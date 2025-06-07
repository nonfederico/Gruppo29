package player;

import javax.swing.SwingWorker;

/**
 * 
 */
public class PlanciaNave extends SwingWorker<Void, Void> {

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

	@Override
	protected Void doInBackground() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}