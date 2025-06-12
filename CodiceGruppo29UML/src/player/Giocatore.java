package player;

import java.awt.Color;

import eccezioni.ErroreNome;

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
	private int creditiVintiMerci;
	private int posizioneAttuale;
	private PlanciaNave planciaNave = null; //

	public Giocatore() {

	}

	public void setNome(String nome) throws ErroreNome {
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

	public int calcolaPotenzaFuoco() {
		return 100;
	}

	public int calcolaPotenzaMotrice() {
		return 100;
	}

	public void guadagnaMerci(int a) {
		creditiVintiMerci = a * 50;
	}

	public void perdiGiorniVolo(int g) {
		return;
	}

	public void subisciPenalita(int p) {
		return;
	}

	public int getEquipaggioTotale() {
		return 5;
	}

	public void perdiEquipaggio(int p) {

	}

	/*
	 * quando creo un giocatore creo anche la plancia e uso get per vederla
	 */
	public PlanciaNave getPlancia() {
		if (planciaNave == null) {
			System.out.println("creato plancia");
			planciaNave = new PlanciaNave();
		}
		return this.planciaNave;
	}

	/*
	 * @return ListaPezziGiocatore ad ogni giocatore è associata un'unica lista
	 * pezzi
	 */
	public ListaPezziGiocatore getListaPezzi() {
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

	public void prendiCrediti(int i) {
		// TODO implement here
	}

}

enum Ruolo {
	LEADER, PILOTA
}