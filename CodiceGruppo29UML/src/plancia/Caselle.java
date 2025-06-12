package plancia;

import player.Giocatore;

public class Caselle {

	private int numero;
	private Giocatore occupante;
	private int cordinatai, cordinataj;

	public Caselle() {

		this.occupante = null;
	}

	/*
	 * per indicare a quale posizione della matrice si trova la casella
	 * 
	 * @param i numero di riga
	 * 
	 * @param j numero della colonna
	 */
	public void setCoordinata(int i, int j) {
		this.cordinatai = i;
		this.cordinataj = j;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isOccupata() {
		return occupante != null;
	}

	public Giocatore getOccupante() {

		return occupante;
	}

	public void setOccupante(Giocatore g) {

		this.occupante = g;
	}

	public void libera() {

		this.occupante = null;
	}
}
