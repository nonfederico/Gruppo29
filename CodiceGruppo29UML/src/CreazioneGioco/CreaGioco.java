package CreazioneGioco;

import grafica.HandleGraphics;
import main.GameState;

//public class CreaGioco implements GameState {

public class CreaGioco implements GameState {
	private static Gioco g = null; // uso pattern singleton per creare una sola partita (per la versione attuale)
	private CreaGiocatori creaGioc = new CreaGiocatori();
	private String testoInserito = "";

	@Override
	public void enter() {
		switchState();
	};

	@Override
	public void pause() {
		// salva stato attuale per andare nel menu
	}

	@Override
	public void exit() {
		// salva stato del gioco

	}

	enum sottoStato {
		ENTER, RUN, EXIT
	}

	public sottoStato statoCorrente = null;

	public CreaGioco() {
		System.out.println("settatoStatoCorrente = ENTER");
		setCurrentState(sottoStato.ENTER);

	}

	public void switchState() {
		statoCorrente = getCurrentState();
		System.out.println("entrato in switch con stato " + getCurrentState().toString());

		switch (statoCorrente) {

		case ENTER:

			HandleGraphics.getGraphics().DisabledAreaText("benvenuto astronauta... Inserisci nome del gioco:");

			do {
				testoInserito = HandleGraphics.getGraphics().writeAreaText();
			} while (testoInserito.equals("") || testoInserito.isEmpty());

			g.getIstanza(); // creo un gioco o carico quello che esiste già

			HandleGraphics.getGraphics().DisabledAreaText("gioco creato");
			System.out.println("stato attuale " + getCurrentState().toString());
			setCurrentState(sottoStato.RUN);
			switchState();
			break;

		case RUN:
//
//			while (creaGioc.isCancelled())
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
