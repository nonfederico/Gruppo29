package CreazioneGioco;

import java.util.ArrayList;

import javax.swing.SwingWorker;

import grafica.HandleGraphics;
import player.Giocatore;

public class CreaGiocatori extends SwingWorker<Void, Void> {
	private String num = "";
	private int numeroGiocatori = 0;
	private ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();

	@Override
	protected Void doInBackground() throws Exception {
		HandleGraphics.getGraphics().DisabledAreaText("inserisci numero giocatori:");
		do {
			num = HandleGraphics.getGraphics().writeAreaText();
		} while (num.equals("") || num.isEmpty()); // perchè altrimenti controlla numerogiocatori che diventa ""
													// anche se
		// settata precedentemente
		creaGiocatoriSelezionati(getNumeGiocatori());
		// aggiungiamo giocatori

		return null;
	}

	public void creaGiocatoriSelezionati(int numeroGiocatori) {

		String nome = "";
		String colore = "";
		try {
<<<<<<< HEAD
			Thread.sleep(1 * 1000);
=======
			Thread.sleep(2 * 1000);
>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
			HandleGraphics.getGraphics().DisabledAreaText("num=" + num);
			setNumeGiocatori(Integer.parseInt(num));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
<<<<<<< HEAD
			Thread.sleep(1 * 1000);
=======
			Thread.sleep(2 * 1000);
>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
			HandleGraphics.getGraphics().DisabledAreaText("ora creo giocatori");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

<<<<<<< HEAD
=======
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
>>>>>>> 8b20f3fb8bf27c780b2ec35f8d2224dd8904c391
		// settiamo nome e colore per ogni giocatore
		for (int i = 0; i < numeroGiocatori; i++) {
			giocatori.add(new Giocatore());
			HandleGraphics.getGraphics().DisabledAreaText("inserisci nome:");
			nome = HandleGraphics.getGraphics().writeAreaText();
			giocatori.get(i).selezionaNome(nome);
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HandleGraphics.getGraphics().DisabledAreaText("inserisci colore (verde, blu, giallo, rosso):");
			colore = HandleGraphics.getGraphics().writeAreaText();
			while (colore.toLowerCase() != "verde" || colore.toLowerCase() != "blu" || colore.toLowerCase() != "giallo"
					|| colore.toLowerCase() != "rosso") {
				HandleGraphics.getGraphics()
						.DisabledAreaText("colore non presente, inserisci colore (verde, blu, giallo, rosso): /n");
				colore = HandleGraphics.getGraphics().writeAreaText();
			}
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HandleGraphics.getGraphics().DisabledAreaText("colore selezionato: " + colore);
			giocatori.get(i).selezionaColore(colore);
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HandleGraphics.getGraphics().DisabledAreaText("benvenuto " + nome);
		}
	}

	public int getNumeGiocatori() {
		return this.numeroGiocatori;
	}

	public void setNumeGiocatori(int num) {
		this.numeroGiocatori = num;
	}

	public String returnNum() {
		return this.num;
	}
}
