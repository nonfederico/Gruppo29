package CreazionePlanciaNave;

import javax.swing.SwingWorker;

import CreazioneGioco.Gioco;
import grafica.HandleGraphics;

public class CreaPlanciaNaveGiocatori extends SwingWorker<Void, Void> {

	enum sottoStati { // sottostati della creazione planciaNave
		GIOCATORE1, GIOCATORE2, GIOCATORE3, GIOCATORE4, VOLO
	}

	@Override
	protected Void doInBackground() throws Exception {
		System.out.println("sono in doInBackground");
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HandleGraphics.getGraphics().DisabledAreaText("crea la plancia nave");

		switchState(); // switch per la creazione delle 1..4 navi
		return null;
	}

//	protected void done() {
//		System.out.println("sono in done");
//		switchState();
//	}

	public void switchState() {
		System.out.println("sono in switchPlanciaNave");
		sottoStati stati = sottoStati.GIOCATORE1;
		switch (stati) {
		case GIOCATORE1: {
			// carico la plancia di ogni giocatore, update grafica, seleziono componenti
			System.out.println("sono in giocatore 1");

			try {
				System.out.println("sono in giocatore1 - ridisegno la plancia");
				// funzione che carica le caselle della plancia nave
				rivalidaPlanciaNave();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			return;
		}
		case GIOCATORE2: {

		}
		case GIOCATORE3: {

		}
		case GIOCATORE4: {

		}
		case VOLO: {
//			GameContext.getIstanzaGC().setState(Volo);
//			GameContext.getIstanzaGC().enter();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + stati);
		}

	}

	public boolean rivalidaPlanciaNave() {
		boolean tru = true;

		try {
			System.out.println("removeall plancia nave");
			HandleGraphics.getGraphics().getPlanciaNave().removeAll();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			// devo chiamare con handlegraphics i metodi per modificare i componenti grafici
			// altrimenti non funziona e si blocca nel thread
			System.out.println("plancia nave setcaselle");
			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
					.setCaselleVuote(Gioco.getlistaGiocatori().get(0));
			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
					.setCaselleDisponibili(Gioco.getlistaGiocatori().get(0));

			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("plancia nave revalidate");
			HandleGraphics.getGraphics().getPlanciaNave().revalidate();

			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			System.out.println(" plancia nave repaint");
			HandleGraphics.getGraphics().getPlanciaNave().repaint();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tru = false;
	}

}
