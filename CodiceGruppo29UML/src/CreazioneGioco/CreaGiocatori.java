package CreazioneGioco;

import java.util.ArrayList;

import javax.swing.SwingWorker;

import grafica.HandleGraphics;
import player.Giocatore;

public class CreaGiocatori extends SwingWorker<Void, Void> {
	private String num = "";
	private int numeroGiocatori = 0;
	private ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
	private String nome = "";
	private String colore = "";
	private statiCreaGiocatori statiCrea = statiCreaGiocatori.NUMEROGIOCATORI;

	enum statiCreaGiocatori {
		NUMEROGIOCATORI, SELEZIONAINFO, CREAZIONENAVE
	}

	public void statiCreaGiocatori() {

		switch (statiCrea) {
		case NUMEROGIOCATORI:
			do {
				HandleGraphics.getGraphics().DisabledAreaText("inserisci numero giocatori:");
				num = HandleGraphics.getGraphics().writeAreaText();
			} while (num.equals("") || num.isEmpty() || (Integer.parseInt(num) < 1 || Integer.parseInt(num) > 4));

			try {
				Thread.sleep(1 * 1000);
				HandleGraphics.getGraphics().DisabledAreaText("num=" + num);
				setNumeGiocatori(Integer.parseInt(num));
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			statiCrea = statiCreaGiocatori.SELEZIONAINFO;
			statiCreaGiocatori();
			break;

		case SELEZIONAINFO:
			try {
				HandleGraphics.getGraphics().DisabledAreaText("ora creo giocatori");
				Thread.sleep(1 * 1000);
				System.out.println("creazione giocatori");
			} catch (InterruptedException e) {
				HandleGraphics.getGraphics().disablewriteAreaText();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			setInformazioni(giocatori);
			break;

		case CREAZIONENAVE:

			try {
				HandleGraphics.getGraphics().DisabledAreaText("creazione lista giocatori");
				Thread.sleep(2 * 1000);

			} catch (InterruptedException e) {
				HandleGraphics.getGraphics().disablewriteAreaText();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			done();
			return;

		}

	}

	private void setInformazioni(ArrayList<Giocatore> lista) {
		for (int i = 0; i < numeroGiocatori; i++) {
			Giocatore giocatore = new Giocatore();
			giocatore.setId(i);

			HandleGraphics.getGraphics().DisabledAreaText("giocatore " + i + " ,inserisci nome:");
			do {
				nome = HandleGraphics.getGraphics().writeAreaText();
			} while (nome.equals("") || nome.isEmpty());

			try {
				Thread.sleep(1 * 1000);
				HandleGraphics.getGraphics().DisabledAreaText("nome =" + nome);
				giocatore.setNome(nome);
				System.out.println(giocatore.getNome());
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			HandleGraphics.getGraphics()
					.DisabledAreaText(giocatore.getColore() + " ,inserisci colore (verde, blu, giallo, rosso): ");
			do {
				colore = HandleGraphics.getGraphics().writeAreaText();
			} while (colore.equals("") || colore.trim().isEmpty()
					|| (!colore.toLowerCase().equals("verde") && !colore.toLowerCase().equals("blu")
							&& !colore.toLowerCase().equals("giallo") && !colore.toLowerCase().equals("rosso")));

			try {
				Thread.sleep(1 * 1000);
				HandleGraphics.getGraphics().DisabledAreaText("colore =" + colore);
				giocatore.setColore(colore);
				System.out.println(giocatore.getColore());
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			lista.add(giocatore);

			// TO DO: add di plance e lista pezzi

		}

		HandleGraphics.getGraphics().DisabledAreaText("benvenuti ");

		statiCrea = statiCreaGiocatori.CREAZIONENAVE;
		statiCreaGiocatori();

	}

	@Override
	protected Void doInBackground() throws Exception {
		statiCreaGiocatori();
		return null;
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

	public String getStatiCrea() {
		return this.statiCrea.toString();
	}

}
