package CreazioneGioco;

import CreazionePlanciaNave.CreaPlanciaNave;
import grafica.HandleGraphics;
import main.GameContext;
import main.GameState;

//public class CreaGioco implements GameState {

public class CreaGioco implements GameState {
	private static Gioco g = null; // uso pattern singleton per creare una sola partita (per la versione attuale)
	private CreaGiocatori creaGioc = new CreaGiocatori(); // sottoclasse per creare giocatori
	private String testoInserito = "";

	GameState creaPlanciaNave = new CreaPlanciaNave(); // contesto logico nel quale voglio entrare dopo aver finito di
														// creare i giocatori

	@Override
	public void enter() {
		switchState();
	};

	@Override
	public void pause() {
		// salva stato attuale per andare nel menu
		// se schiaccia il pulsante pausa succede qualcosa
	}

	@Override
	public void exit() {
		// salva stato del gioco
		// esce dal gioco

	}

	enum sottoStato {
		ENTER, RUN, EXIT
	}

	public sottoStato statoCorrente = null; // sottostato corrente relativo alla creazioen del giocatore

	public CreaGioco() {
		System.out.println("settatoStatoCorrente = ENTER");
		setCurrentState(sottoStato.ENTER);

	}

	public void switchState() {
		// suddiviso la creazione del giocatore in sottostati

		statoCorrente = getCurrentState();
		System.out.println("entrato in switch con stato " + getCurrentState().toString());

		switch (statoCorrente) {

		case ENTER:

			HandleGraphics.getGraphics().DisabledAreaText("benvenuto astronauta... Inserisci nome del gioco:");

			do {
				testoInserito = HandleGraphics.getGraphics().writeAreaText();
			} while (testoInserito.equals("") || testoInserito.isEmpty()
					|| (testoInserito.length() > 10 || testoInserito.length() < 1));
			;

			g.getIstanza(); // creo un gioco o carico quello che esiste già

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

}
