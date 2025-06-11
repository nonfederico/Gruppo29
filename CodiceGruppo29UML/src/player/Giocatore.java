package player;

import java.awt.Color;

/**
 * 
 */
public class Giocatore {

	private String nome;
	private Ruolo ruolo = null;
	private String colore = null;
	private Color coloreS = null;
	private ListaPezziGiocatore listaPezzi = null;
	private int id;
	private int crediti;
	private PlanciaNave planciaNave = null; // quando creo un giocatore creo anche la plancia e uso get per
	// vederla

	public Giocatore() {
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getColore() {
		return this.colore;
	}

	public void setColoreS(Color colore) {
		this.coloreS = colore;
	}

	public Color getColoreS() {
		return this.coloreS;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public PlanciaNave getPlancia() { // se non ho creato una plancia, la creo e poi la restituisco
		if (planciaNave == null) {
			System.out.println("creato plancia");
			planciaNave = new PlanciaNave();
		}
		return this.planciaNave;
	}

	public ListaPezziGiocatore getListaPezzi() {
		// una sola listapezzi per ogni giocatore
		if (listaPezzi == null) {
			listaPezzi = new ListaPezziGiocatore();
		}
		return listaPezzi;
	}

	public void pescaCarte() {
		// TODO implement here
	}

	public void azionaScudi() {
		// TODO implement here
	}

	public void azionaCannoni() {
		// TODO implement here
	}

	public void attivaMotori() {
		// TODO implement here
	}

	public void posizionaComponenti() {
		// TODO implement here
	}

	public void rimuoviComponenti() {
		// TODO implement here
	}

	public void lanciaDadi() {
		// TODO implement here
	}

	public void avviaTempo() {
		// TODO implement here
	}

	public void modificaNave() {
		// TODO implement here
	}

	public boolean isLeader() {
		boolean Leader = true;
		return Leader;
		// TODO implement here
	}

	public void prendiCrediti() {
		// TODO implement here
	}

}

enum Ruolo {
	LEADER, PILOTA
}