package CreazioneGioco;

import java.util.ArrayList;

import grafica.FrameBase;
import grafica.HandleGraphics;
import main.GameState;
import player.Giocatore;

//public class CreaGioco implements GameState {

public class CreaGioco implements GameState {
	private static Gioco g = null; // uso pattern singleton per creare una sola partita (per la versione attuale)

	private String testoInserito = "";
	ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>(); // lista di giocatori, poi implementiamo lista
																	// esterna
	private int numeroGiocatori = 0;
	private String num = "";
	// public HandleGraphics handleGraphic = new HandleGraphics();
	private FrameBase handleGraphic = HandleGraphics.getGraphics();

//	Timer timer = new Timer(1000);
//
//	timer.setRepeats(false); // esegue solo una volta
//	timer.start();
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

			handleGraphic.DisabledAreaText("benvenuto astronauta... Inserisci nome del gioco:");
			do {
				testoInserito = handleGraphic.writeAreaText();
			} while (testoInserito.equals(""));

			handleGraphic.disablewriteAreaText();
			g.getIstanza(); // creo un gioco o carico quello che esiste già

			handleGraphic.DisabledAreaText("gioco creato");
			System.out.println("stato attuale " + getCurrentState().toString());
			setCurrentState(sottoStato.RUN);
			switchState();

		case RUN:

			handleGraphic.DisabledAreaText("inserisci numero giocatori:");
			do {
				num = handleGraphic.writeAreaText();
			} while (num.equals("") || num.isEmpty()); // perchè altrimenti controlla numerogiocatori che diventa ""
														// anche se
			// settata precedentemente
			creaGiocatori(getNumeGiocatori());
			// aggiungiamo giocatori

		case EXIT:
			break;
		}

	}

	public void creaGiocatori(int numeroGiocatori) {

		String nome = "";
		String colore = "";

		handleGraphic.DisabledAreaText("num=" + num);
		setNumeGiocatori(Integer.parseInt(num));

		handleGraphic.DisabledAreaText("ora creo giocatori");

		// settiamo nome e colore per ogni giocatore
		for (int i = 0; i < numeroGiocatori; i++) {
			giocatori.add(new Giocatore());
			handleGraphic.DisabledAreaText("inserisci nome:");
			nome = handleGraphic.writeAreaText();
			giocatori.get(i).selezionaNome(nome);
			handleGraphic.DisabledAreaText("inserisci colore (verde, blu, giallo, rosso):");
			colore = handleGraphic.writeAreaText();
			while (colore.toLowerCase() != "verde" || colore.toLowerCase() != "blu" || colore.toLowerCase() != "giallo"
					|| colore.toLowerCase() != "rosso") {
				handleGraphic.DisabledAreaText("colore non presente, inserisci colore (verde, blu, giallo, rosso): /n");
				colore = handleGraphic.writeAreaText();
			}
			handleGraphic.DisabledAreaText("colore selezionato: " + colore);
			giocatori.get(i).selezionaColore(colore);
			handleGraphic.DisabledAreaText("benvenuto " + nome);
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
