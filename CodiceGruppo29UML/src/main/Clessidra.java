package main;

/**
 * 
 */
public class Clessidra implements Runnable {
	boolean attivo;

	@Override
	public void run() {
		// la clessidra sarà in un pane fissa
		attivo = true;
		while (attivo) {
			try {
//				HandleGraphics.getGraphics().writeInformazioni("timer attivo");
				Thread.sleep(1000);
//				stopClessidra();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			HandleGraphics.getGraphics().writeInformazioni("timer scaduto");
		}

	}

	public Clessidra() {
//    	creo clessidra, avvio

	}

	public void stopClessidra() {
		attivo = false;
	}

	/**
	 * 
	 */
	public int tempoMax;

	/**
	 * 
	 */
//	public void start() {
//		// TODO implement here
//	} uso run

}