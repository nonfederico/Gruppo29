package CreazionePlanciaNave;

import javax.swing.SwingWorker;

import CreazioneGioco.Gioco;
import grafica.HandleGraphics;
import main.Clessidra;

public class CreaPlanciaNaveGiocatori extends SwingWorker<Void, Void> {

	private Clessidra timer = new Clessidra();
	String finito = "";
	sottoStati stati = sottoStati.GIOCATORE1;

	/*
	 * sottostati della creazione planciaNave, per indicare il turno del giocatore
	 */
	enum sottoStati {
		GIOCATORE1, GIOCATORE2, GIOCATORE3, GIOCATORE4, VOLO
	}

	/*
	 * funzione richiamata quando facciamo thread.execute, con switchstate
	 * richiamiamo il cambio dello stato della macchina a stati
	 */
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

	/*
	 * funzione usata per ridisegnare le plancie navi dei giocatori e tramite le
	 * caselle rosa far vedere quali sono gli spazi in cui si possono inserire i
	 * componenti per la creazione della nave
	 */
	public void switchState() {
		System.out.println("sono in switchPlanciaNave");

		switch (stati) {
		case GIOCATORE1: {
			System.out.println("sono in giocatore 1");

			try {
				System.out.println("sono in giocatore1 - ridisegno la plancia");

				rivalidaPlanciaNave(0);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText(
					"inserisci FINITO al termine della creazione.. spazi rosa per connettere componenti");
			System.out.println("ciclo do");
			PosizionaCaselle posCaselle = new PosizionaCaselle(Gioco.getlistaGiocatori().get(0));
			posCaselle.execute();
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
				stati = sottoStati.VOLO;
				System.out.println("switchstate");
				switchState();
				return;
			}

		}
		case GIOCATORE2: {
			System.out.println("sono in giocatore 2");

			try {
				System.out.println("sono in giocatore 2 - ridisegno la plancia");

				rivalidaPlanciaNave(1);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText(
					"inserisci FINITO al termine della creazione.. spazi rosa per connettere componenti");
			PosizionaCaselle posCaselle = new PosizionaCaselle(Gioco.getlistaGiocatori().get(0));
			posCaselle.execute();
			do {
//				timer.execute();
				finito = HandleGraphics.getGraphics().writeAreaText();
			} while (!finito.toUpperCase().equals("FINITO"));

			if (finito.toUpperCase().equals("FINITO") && Gioco.getlistaGiocatori().size() < 4) {
				stati = sottoStati.GIOCATORE3;
				switchState();
			} else {
				HandleGraphics.getGraphics().DisabledAreaText("creazione nava finita");
				stati = sottoStati.VOLO;
				System.out.println("switchstate");
				switchState();
				return;
			}

		}
		case GIOCATORE3: {

			System.out.println("sono in giocatore 3");

			try {
				System.out.println("sono in giocatore 3 - ridisegno la plancia");

				rivalidaPlanciaNave(2);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText(
					"inserisci FINITO al termine della creazione.. spazi rosa per connettere componenti");
			PosizionaCaselle posCaselle = new PosizionaCaselle(Gioco.getlistaGiocatori().get(0));
			posCaselle.execute();
			do {
				finito = HandleGraphics.getGraphics().writeAreaText();
			} while (!finito.toUpperCase().equals("FINITO"));

			if (finito.toUpperCase().equals("FINITO") && Gioco.getlistaGiocatori().size() < 5) {
				stati = sottoStati.GIOCATORE4;
				switchState();
			} else {
				HandleGraphics.getGraphics().DisabledAreaText("creazione nava finita");
				stati = sottoStati.VOLO;
				System.out.println("switchstate");
				switchState();
				return;
			}

		}
		case GIOCATORE4: {

			System.out.println("sono in giocatore 4");

			try {
				System.out.println("sono in giocatore 4 - ridisegno la plancia");

				rivalidaPlanciaNave(3);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			HandleGraphics.getGraphics().DisabledAreaText(
					"inserisci FINITO al termine della creazione.. spazi rosa per connettere componenti");
			PosizionaCaselle posCaselle = new PosizionaCaselle(Gioco.getlistaGiocatori().get(0));
			posCaselle.execute();
			do {
				finito = HandleGraphics.getGraphics().writeAreaText();
			} while (!finito.toUpperCase().equals("FINITO"));

			if (finito.toUpperCase().equals("FINITO")) {
				stati = sottoStati.VOLO;
				switchState();
			} else {
				HandleGraphics.getGraphics().DisabledAreaText("creazione nava finita");
				stati = sottoStati.VOLO;
				System.out.println("switchstate");
				switchState();
				return;
			}

		}
		case VOLO: {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			GameContext.getIstanzaGC().setState(FaseVolo);
//			GameContext.getIstanzaGC().enter();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + stati);
		}

	}

	/*
	 * @param id usato per capire di quale giocatore dobbiamo ridisegnare la plancia
	 * uso handlegraphics per modificare i componenti grafici, cosi da lavorare sul
	 * EDT
	 */
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

			System.out.println("plancia nave setcaselle");
			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
					.setCaselleVuote(Gioco.getlistaGiocatori().get(id));
			HandleGraphics.getGraphics().getPlanciaNave().getGraficaPlanciaNave()
					.setCaselleNonDisponibili(Gioco.getlistaGiocatori().get(id));

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
