package CreazionePlanciaNave;

import javax.swing.SwingWorker;

import CreazioneGioco.Gioco;
import grafica.HandleGraphics;
import main.Clessidra;

public class CreaPlanciaNaveGiocatori extends SwingWorker<Void, Void> {

	private Clessidra timer = new Clessidra();
	String finito = "";

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
				rivalidaPlanciaNave(0);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText("inserisci FINITO al termine della creazione");
			System.out.println("ciclo do");
			do {
//				timer.execute();

				finito = HandleGraphics.getGraphics().writeAreaText();

			} while (!finito.toUpperCase().equals("FINITO"));
			System.out.println("ciclo do finito");

			if (finito.toUpperCase().equals("FINITO") && Gioco.getlistaGiocatori().size() < 3) {
				System.out.println("setto stato giocatore2");
				stati = sottoStati.GIOCATORE2;
				System.out.println("switchstate");
				switchState();
			} else {
				HandleGraphics.getGraphics().DisabledAreaText("creazione nava finita");
				return;
			}

		}
		case GIOCATORE2: {
			// carico la plancia di ogni giocatore, update grafica, seleziono componenti
			System.out.println("sono in giocatore 2");

			try {
				System.out.println("sono in giocatore 2 - ridisegno la plancia");
				// funzione che carica le caselle della plancia nave
				rivalidaPlanciaNave(1);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText("inserisci FINITO al termine della creazione");
			do {
				timer.execute();
				finito = HandleGraphics.getGraphics().writeAreaText();
			} while (!finito.toUpperCase().equals("FINITO") || !timer.isDone());

			if (finito.toUpperCase().equals("FINITO") && Gioco.getlistaGiocatori().size() < 4) {
				stati = sottoStati.GIOCATORE3;
				switchState();
			} else {
				HandleGraphics.getGraphics().DisabledAreaText("creazione nava finita");
				return;
			}

		}
		case GIOCATORE3: {
			// carico la plancia di ogni giocatore, update grafica, seleziono componenti
			System.out.println("sono in giocatore 3");

			try {
				System.out.println("sono in giocatore 3 - ridisegno la plancia");
				// funzione che carica le caselle della plancia nave
				rivalidaPlanciaNave(2);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText("inserisci FINITO al termine della creazione");
			do {
				timer.execute();
				finito = HandleGraphics.getGraphics().writeAreaText();
			} while (!finito.toUpperCase().equals("FINITO") || !timer.isDone());

			if (finito.toUpperCase().equals("FINITO") && Gioco.getlistaGiocatori().size() < 5) {
				stati = sottoStati.GIOCATORE4;
				switchState();
			} else {
				HandleGraphics.getGraphics().DisabledAreaText("creazione nava finita");
				return;
			}

		}
		case GIOCATORE4: {
			// carico la plancia di ogni giocatore, update grafica, seleziono componenti
			System.out.println("sono in giocatore 4");

			try {
				System.out.println("sono in giocatore 4 - ridisegno la plancia");
				// funzione che carica le caselle della plancia nave
				rivalidaPlanciaNave(3);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText("inserisci FINITO al termine della creazione");
			do {
				timer.execute();
				finito = HandleGraphics.getGraphics().writeAreaText();
			} while (!finito.toUpperCase().equals("FINITO") || !timer.isDone());

			if (finito.toUpperCase().equals("FINITO")) {
				stati = sottoStati.VOLO;
				switchState();
			} else {
				HandleGraphics.getGraphics().DisabledAreaText("creazione nava finita");
				return;
			}

		}
		case VOLO: {
			try {
				Thread.sleep(500);
				HandleGraphics.getGraphics().DisabledAreaText("fase di volo");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//			GameContext.getIstanzaGC().setState(Volo);
//			GameContext.getIstanzaGC().enter();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + stati);
		}

	}

	public boolean rivalidaPlanciaNave(int id) {
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
//			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
//					.setCaselleVuote(Gioco.getlistaGiocatori().get(id));
//			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
//					.setCaselleDisponibili(Gioco.getlistaGiocatori().get(id));

			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
					.setCaselleG(Gioco.getlistaGiocatori().get(id));

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
