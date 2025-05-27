package CreazioneGioco;

import java.util.ArrayList;

import grafica.HandleGraphics;
import player.Giocatore;

//public class CreaGioco implements GameState {

public class CreaGioco {
	private static Gioco g = null; // uso pattern singleton

	private String testoInserito = "";
	ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>(); // lista di giocatori, poi implementiamo lista
																	// esterna
	private int numeroGiocatori = 0;
	private String num = "";
	public HandleGraphics handleGraphic = new HandleGraphics();

//	Timer timer = new Timer(1000);
//
//	timer.setRepeats(false); // esegue solo una volta
//	timer.start();

	enum sottoStato {
		ENTER, RUN, EXIT
	}

//	public void run() {
//
//	}
	// boolean r = false;
	private sottoStato statoCorrente = null;

//	private handleState statoAttuale;
	public CreaGioco() {
		System.out.println("settatoStatoCorrente = ENTER");
		setCurrentState(sottoStato.ENTER);

	}

	public void switchState() {
		statoCorrente = getCurrentState();
		System.out.println("entrato in switch con stato " + getCurrentState().toString());
		// while (statoCorrente != sottoStato.EXIT) {
		switch (statoCorrente) {

		case ENTER:

			handleGraphic.getGraphics().DisabledAreaText("benvenuto astronauta... Inserisci nome del gioco:");
			do {
				testoInserito = handleGraphic.getGraphics().writeAreaText();
			} while (testoInserito.equals(""));

			handleGraphic.getGraphics().disablewriteAreaText();
			g.getIstanza(); // creo un gioco o carico quello che esiste già

			handleGraphic.getGraphics().DisabledAreaText("gioco creato");
			System.out.println("stato attuale " + getCurrentState().toString());
			setCurrentState(sottoStato.RUN);
			switchState();

		case RUN:

			handleGraphic.getGraphics().DisabledAreaText("inserisci numero giocatori:");
			do {
				num = handleGraphic.getGraphics().writeAreaText();
			} while (num.equals("") || num.isEmpty()); // perchè altrimenti controlla numerogiocatori che diventa ""
														// anche se
			// settata precedentemente
			creaGiocatori(getNumeGiocatori());
			// aggiungiamo giocatori

		case EXIT:
			break;
		}
		// }
	}

	public void creaGiocatori(int numeroGiocatori) {

		String nome = "";
		String colore = "";

		handleGraphic.getGraphics().DisabledAreaText("num=" + num);
		setNumeGiocatori(Integer.parseInt(num));

		handleGraphic.getGraphics().DisabledAreaText("ora creo giocatori");

		// settiamo nome e colore per ogni giocatore
		for (int i = 0; i < numeroGiocatori; i++) {
			giocatori.add(new Giocatore());
			handleGraphic.getGraphics().DisabledAreaText("inserisci nome:");
			nome = handleGraphic.getGraphics().writeAreaText();
			giocatori.get(i).selezionaNome(nome);
			handleGraphic.getGraphics().DisabledAreaText("inserisci colore (verde, blu, giallo, rosso):");
			colore = handleGraphic.getGraphics().writeAreaText();
			while (colore.toLowerCase() != "verde" || colore.toLowerCase() != "blu" || colore.toLowerCase() != "giallo"
					|| colore.toLowerCase() != "rosso") {
				handleGraphic.getGraphics()
						.DisabledAreaText("colore non presente, inserisci colore (verde, blu, giallo, rosso): /n");
				colore = handleGraphic.getGraphics().writeAreaText();
			}
			handleGraphic.getGraphics().DisabledAreaText("colore selezionato: " + colore);
			giocatori.get(i).selezionaColore(colore);
			handleGraphic.getGraphics().DisabledAreaText("benvenuto " + nome);
		}
	}

	public sottoStato setCurrentState(sottoStato state) {
		this.statoCorrente = state;
		return statoCorrente;
	}

	public String returnNum() {
		return this.num;
	}

	public sottoStato getCurrentState() {
		return statoCorrente;
	}

	public void setNumeGiocatori(int num) {
		this.numeroGiocatori = num;
	}

	public int getNumeGiocatori() {
		return this.numeroGiocatori;
	}

	public static Gioco getGioco() {
		return g;
	}

}
