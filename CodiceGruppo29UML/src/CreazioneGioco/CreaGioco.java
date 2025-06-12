package CreazioneGioco;

import Carta.Mazzo;
import CreazionePlanciaNave.CreaPlanciaNave;
import grafica.HandleGraphics;
import main.GameContext;
import main.GameState;

//public class CreaGioco implements GameState {

public class CreaGioco implements GameState {
	private static Gioco g = null; // uso pattern singleton per creare una sola partita (per la versione attuale)
	private CreaGiocatori creaGioc = new CreaGiocatori(); // sottoclasse per creare giocatori
	private String testoInserito = "";
	private Mazzo mazzo = Mazzo.getMazzo();
	GameState creaPlanciaNave = new CreaPlanciaNave(); // contesto logico nel quale voglio entrare dopo aver finito di
														// creare i giocatori

	@Override
	public void enter() {
		switchState();
	};

	/*
	 * salva stato attuale per andare nel menu se schiaccia il pulsante pausa
	 * succede qualcosa
	 */
	@Override
	public void pause() {

	}

	/*
	 * salva stato del gioco , esce dal gioco
	 */
	@Override
	public void exit() {

	}

	enum sottoStato {
		ENTER, RUN, EXIT
	}

	public sottoStato statoCorrente = null; // sottostato corrente relativo alla creazioen del giocatore

	public CreaGioco() {
		System.out.println("settatoStatoCorrente = ENTER");
		setCurrentState(sottoStato.ENTER);

	}

	/*
	 * funzione che suddivide la creazione del giocatore in sottostati
	 */

	public void switchState() {

		statoCorrente = getCurrentState();
		System.out.println("entrato in switch con stato " + getCurrentState().toString());

		switch (statoCorrente) {

		case ENTER:

			HandleGraphics.getGraphics().DisabledAreaText(
					"benvenuto astronauta... Inserisci nome della partit (compila l'area sottostante) :");

			do {
				testoInserito = HandleGraphics.getGraphics().writeAreaText();
			} while (testoInserito.equals("") || testoInserito.isEmpty()
					|| (testoInserito.length() > 10 || testoInserito.length() < 1));
			;

			g.getIstanza();

			HandleGraphics.getGraphics().DisabledAreaText("gioco creato");
			System.out.println("stato attuale " + getCurrentState().toString());
			setCurrentState(sottoStato.RUN);
			switchState(); // richiamo switchstate per entrare nel case: RUN
			break;

		case RUN:

			creaGioc.execute();
			while (!creaGioc.isDone()) {

			}

			System.out.println("esco da execute: " + getCurrentState());
			setCurrentState(sottoStato.EXIT);
			System.out.println("setto exit: " + getCurrentState());
			switchState();
			break;

		case EXIT:
			HandleGraphics.getGraphics().DisabledAreaText("gioco e giocatori creati, andiamo a creare le navi");
			Mazzo mazzo = Mazzo.getMazzo();
			HandleGraphics.getGraphics().getGraficaInfo().setTitolo();
			GameContext.getIstanzaGC().setState(creaPlanciaNave); // setto il contesto logico in cui voglio entrare
			GameContext.getIstanzaGC().enter(); // entro nello stato enter del contesto creaPlanciaNave
			break;

		default:
			System.out.println("Stato sconosciuto: " + getCurrentState());
			break;
		}

	}

	public sottoStato setCurrentState(sottoStato state) {
		this.statoCorrente = state;
		return statoCorrente;
	}

	public sottoStato getCurrentState() {
		return statoCorrente;
	}

	public static Gioco getGioco() {
		return g;
	}

	public String titoloCarta() {
		String titolo = mazzo.getCarta().getTitolo();
		return titolo;
	}

}
