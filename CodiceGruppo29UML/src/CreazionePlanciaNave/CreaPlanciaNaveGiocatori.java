package CreazionePlanciaNave;

import javax.swing.SwingWorker;

import CreazioneGioco.Gioco;
import grafica.HandleGraphics;

public class CreaPlanciaNaveGiocatori extends SwingWorker<Void, Void> {

	enum sottoStati {
		GIOCATORE1, GIOCATORE2, GIOCATORE3, GIOCATORE4
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

		switchState();
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
			System.out.println("sono in giocatore1");
			// si blocca alla riga 40 "sono in giocatore 1" di CreaPlanciaNaveGIocatore dove
			// vado a prendere il riferimento alla plancia e setto le caselle vuote (stato
			// iniziale)
			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
					.setCaselleVuote(Gioco.getlistaGiocatori().get(0));
			System.out.println("sono in giocatore1-plancia creata");
			try {
				System.out.println("sono in giocatore1 - ridisegno la plancia");
				HandleGraphics.getGraphics().rivalidaPlanciaNave();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			GraficaPlanciaNave.getGraficaPlanciaNave().setCaselleVuote(Gioco.getlistaGiocatori().get(0)); // ritorna il
			// giocatore
			// 1
		}
		case GIOCATORE2: {

		}
		case GIOCATORE3: {

		}
		case GIOCATORE4: {

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + stati);
		}
	}

}
