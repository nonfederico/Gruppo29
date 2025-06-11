package player;

import CreazionePlanciaNave.ComponentiGioco;
import grafica.ComponentiGiocoGrafica;

//la associo ad un giocatore e accedo tramite il giocatore cosi da avere 4 plance diverse
public class PlanciaNave {

	private ComponentiGiocoGrafica[][] caselleGrafica = new ComponentiGiocoGrafica[5][5];
	private ComponentiGioco[][] caselle = new ComponentiGioco[5][5];

	public PlanciaNave() {

//		caselle[2][2].setConnettori();
//		System.out.println(caselle[2][2].toString());
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

	public ComponentiGioco getComponente(int i, int j) {
		return caselle[i][j];
	}

	public ComponentiGioco[][] getCaselle() {
		return this.caselle;
	}

	public ComponentiGiocoGrafica getComponenteGrafica(int i, int j) {
		return caselleGrafica[i][j];
	}

	public ComponentiGiocoGrafica[][] getCaselleGrafica() {
		return this.caselleGrafica;
	}

}