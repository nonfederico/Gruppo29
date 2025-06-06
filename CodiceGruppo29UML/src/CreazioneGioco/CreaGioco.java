package CreazioneGioco;

import grafica.HandleGraphics;
<<<<<<< HEAD
=======
import main.GameContext;
>>>>>>> codiceGiocoFede
import main.GameState;

//public class CreaGioco implements GameState {

public class CreaGioco implements GameState {
	private static Gioco g = null; // uso pattern singleton per creare una sola partita (per la versione attuale)
	private CreaGiocatori creaGioc = new CreaGiocatori();
	private String testoInserito = "";
>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
=======

	GameState creaPlanciaNave = new CreaPlanciaNave();

>>>>>>> codiceGiocoFede
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
>>>>>>> codiceGiocoFede

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
			} while (testoInserito.equals("") || testoInserito.isEmpty()
					|| (testoInserito.length() > 10 || testoInserito.length() < 1));
			;

>>>>>>> codiceGiocoFede
			g.getIstanza(); // creo un gioco o carico quello che esiste già

			HandleGraphics.getGraphics().DisabledAreaText("gioco creato");
			System.out.println("stato attuale " + getCurrentState().toString());
			setCurrentState(sottoStato.RUN);
			switchState();

>>>>>>> codiceGiocoFede

		case RUN:

			creaGioc.execute();

>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391

		case EXIT:
=======
			while (!creaGioc.isDone()) {

			}

			System.out.println("esco da execute: " + getCurrentState());
			setCurrentState(sottoStato.EXIT);
			System.out.println("setto exit: " + getCurrentState());
			switchState();
			break;

		case EXIT:
			HandleGraphics.getGraphics().DisabledAreaText("gioco e giocatori creati, andiamo a creare le navi");
			GameContext.getIstanzaGC().setState(creaPlanciaNave);
			GameContext.getIstanzaGC().enter();
			break;

		default:
			System.out.println("Stato sconosciuto: " + getCurrentState());
>>>>>>> codiceGiocoFede
			break;
		}

	}

>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
=======
>>>>>>> codiceGiocoFede
	public sottoStato setCurrentState(sottoStato state) {
		this.statoCorrente = state;
		return statoCorrente;
	}


>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
=======
>>>>>>> codiceGiocoFede
	public sottoStato getCurrentState() {
		return statoCorrente;
	}

>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
=======
>>>>>>> codiceGiocoFede
	public static Gioco getGioco() {
		return g;
	}

}
