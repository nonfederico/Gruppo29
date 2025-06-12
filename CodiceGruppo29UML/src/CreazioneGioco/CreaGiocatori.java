package CreazioneGioco;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.SwingWorker;

import eccezioni.ErroreNome;
import grafica.HandleGraphics;
import player.Giocatore;

public class CreaGiocatori extends SwingWorker<Void, Void> {
	private String num = "";
	private int numeroGiocatori = 0;
	private String nome = "";
	private String colore = "";
	private statiCreaGiocatori statiCrea = statiCreaGiocatori.NUMEROGIOCATORI;
	private Colore c = new Colore();
	private Color coloreInterfaccia;

	enum statiCreaGiocatori {
		NUMEROGIOCATORI, SELEZIONAINFO, CREAZIONENAVE
	}

	@Override
	protected Void doInBackground() throws Exception {
		statiCreaGiocatori();
		return null;
	}

	/*
	 * funzione che suddivide in sottostati la creazione dei giocatori per passare
	 * poi alla fase di creazione della nave
	 */
	public void statiCreaGiocatori() {

		switch (statiCrea) {
		case NUMEROGIOCATORI:
			do {
				HandleGraphics.getGraphics().DisabledAreaText("inserisci numero giocatori (da 1 a 4):");
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

			try {
				setInformazioni(Gioco.getIstanza().getlistaGiocatori());
			} catch (ErroreNome e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
			break;

		case CREAZIONENAVE:

			try {
				HandleGraphics.getGraphics().DisabledAreaText("creazione lista giocatori");
				Thread.sleep(2 * 1000);

			} catch (InterruptedException e) {
				HandleGraphics.getGraphics().disablewriteAreaText();
				// TODO Auto-generated catch block
				System.err.println("Errore inserimento nome: " + e.getMessage());
				e.printStackTrace();
			}
			done();
			return;

		}

	}

	/*
	 * @param lista è la lista di giocatori che partecipano alla partita
	 */
	private void setInformazioni(ArrayList<Giocatore> lista) throws ErroreNome {
		for (int i = 0; i < numeroGiocatori; i++) {
			Giocatore giocatore = new Giocatore();
			giocatore.setId(i);
			System.out.println("id: " + giocatore.getId());
			HandleGraphics.getGraphics()
					.DisabledAreaText("giocatore " + i + " ,inserisci nome (massimo 10 caratteri):");
			do {
				nome = HandleGraphics.getGraphics().writeAreaText().trim();
			} while (nome.equals("") || nome.isEmpty() || (nome.length() > 10 && nome.length() < 1));

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
					.DisabledAreaText(giocatore.getNome() + " ,inserisci colore " + c.getListaColori());

			do {
				colore = HandleGraphics.getGraphics().writeAreaText();
			} while (colore.equals("") || colore.trim().isEmpty()
					|| (!colore.toLowerCase().equals("verde") && !colore.toLowerCase().equals("blu")
							&& !colore.toLowerCase().equals("giallo") && !colore.toLowerCase().equals("rosso")));
			coloreInterfaccia = c.chooseColore(colore);

			System.out.println("colore eliminato");
			try {
				Thread.sleep(1 * 1000);
				HandleGraphics.getGraphics().DisabledAreaText("colore =" + colore);
				giocatore.setColore(colore);
				giocatore.setColoreS(coloreInterfaccia);
				System.out.println(giocatore.getColoreS());
				System.out.println(giocatore.getColore());
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			lista.add(giocatore);

			// add listapezzi
			// add plancia nave

		}

		HandleGraphics.getGraphics().DisabledAreaText("benvenuti ");

		statiCrea = statiCreaGiocatori.CREAZIONENAVE;
		statiCreaGiocatori();

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
