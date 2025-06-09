package player;

import plancia.ComponentiProva;

//la associo ad un giocatore e accedo tramite il giocatore cosi da avere 4 plance diverse
public class PlanciaNave {

	private ComponentiProva[][] caselle = new ComponentiProva[5][5];

	public PlanciaNave() {
	}

	public int livello;

	public boolean legalità;

	public int potenzaMotrice;

	public int potenzaFuoco;

	public boolean isLegale() {

		return this.legalità;
		// TODO implement here
	}

	public void ritornaRicompensePenalità() {
		// TODO implement here
	}

	public int calcolaPotenzaMotrice() {
		int potenza = 0;
		return potenza;
		// TODO implement here
	}

	public int calcolaPotenzaFuoco() {
		int potenza = 0;
		return potenza;
		// TODO implement here
	}

	public void returnpenalità() {
		// TODO implement here
	}

	public void returnricompense() {
		// TODO implement here
	}

	public ComponentiProva[][] getCaselle() {
		return this.caselle;
	}

}