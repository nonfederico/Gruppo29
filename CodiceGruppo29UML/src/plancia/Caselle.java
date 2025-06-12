package plancia;

import player.Giocatore;

public class Caselle {

	private int numero;
	private Giocatore occupante;
	private int cordinatai, cordinataj;

	public Caselle() {

		this.occupante = null;
	}

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
