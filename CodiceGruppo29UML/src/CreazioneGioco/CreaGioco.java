package CreazioneGioco;

import grafica.HandleGraphics;
import main.GameState;

//public class CreaGioco implements GameState {

public class CreaGioco implements GameState {
	private static Gioco g = null; // uso pattern singleton per creare una sola partita (per la versione attuale)
	private CreaGiocatori creaGioc = new CreaGiocatori();
	private String testoInserito = "";
<<<<<<< HEAD

=======
//	ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>(); // lista di giocatori, poi implementiamo lista
	// esterna
//	private int numeroGiocatori = 0;
//	private String num = "";
	// public HandleGraphics handleGraphic = new HandleGraphics();
	// private FrameBase handleGraphic = HandleGraphics.getGraphics();

//	Timer timer = new Timer(1000);
//
//	timer.setRepeats(false); // esegue solo una volta
//	timer.start();

>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
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

	private sottoStato statoCorrente = null;

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
			} while (testoInserito.equals(""));

			HandleGraphics.getGraphics().disablewriteAreaText();
			g.getIstanza(); // creo un gioco o carico quello che esiste già

			HandleGraphics.getGraphics().DisabledAreaText("gioco creato");
			System.out.println("stato attuale " + getCurrentState().toString());
			setCurrentState(sottoStato.RUN);
			switchState();

		case RUN:

			creaGioc.execute();
<<<<<<< HEAD
=======
//			HandleGraphics.getGraphics().DisabledAreaText("inserisci numero giocatori:");
//			do {
//				num = HandleGraphics.getGraphics().writeAreaText();
//			} while (num.equals("") || num.isEmpty()); // perchè altrimenti controlla numerogiocatori che diventa ""
//														// anche se
//			// settata precedentemente
//			creaGiocatori(getNumeGiocatori());
//			// aggiungiamo giocatori
>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391

		case EXIT:
			break;
		}

	}

<<<<<<< HEAD
=======
//	public void creaGiocatori(int numeroGiocatori) {
//
//		String nome = "";
//		String colore = "";
//
//		HandleGraphics.getGraphics().DisabledAreaText("num=" + num);
//		setNumeGiocatori(Integer.parseInt(num));
//
//		HandleGraphics.getGraphics().DisabledAreaText("ora creo giocatori");
//
//		// settiamo nome e colore per ogni giocatore
//		for (int i = 0; i < numeroGiocatori; i++) {
//			giocatori.add(new Giocatore());
//			HandleGraphics.getGraphics().DisabledAreaText("inserisci nome:");
//			nome = HandleGraphics.getGraphics().writeAreaText();
//			giocatori.get(i).selezionaNome(nome);
//			HandleGraphics.getGraphics().DisabledAreaText("inserisci colore (verde, blu, giallo, rosso):");
//			colore = HandleGraphics.getGraphics().writeAreaText();
//			while (colore.toLowerCase() != "verde" || colore.toLowerCase() != "blu" || colore.toLowerCase() != "giallo"
//					|| colore.toLowerCase() != "rosso") {
//				HandleGraphics.getGraphics()
//						.DisabledAreaText("colore non presente, inserisci colore (verde, blu, giallo, rosso): /n");
//				colore = HandleGraphics.getGraphics().writeAreaText();
//			}
//			HandleGraphics.getGraphics().DisabledAreaText("colore selezionato: " + colore);
//			giocatori.get(i).selezionaColore(colore);
//			HandleGraphics.getGraphics().DisabledAreaText("benvenuto " + nome);
//		}
//	}

>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
	public sottoStato setCurrentState(sottoStato state) {
		this.statoCorrente = state;
		return statoCorrente;
	}

<<<<<<< HEAD
=======
//	public String returnNum() {
//		return this.num;
//	}

>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
	public sottoStato getCurrentState() {
		return statoCorrente;
	}

<<<<<<< HEAD
=======
//	public void setNumeGiocatori(int num) {
//		this.numeroGiocatori = num;
//	}

//	public int getNumeGiocatori() {
//		return this.numeroGiocatori;
//	}

>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
	public static Gioco getGioco() {
		return g;
	}

}
