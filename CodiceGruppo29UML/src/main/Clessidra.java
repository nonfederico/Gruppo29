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
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Default constructor
	 */
	public Clessidra() {
//    	creo clessidra, avvio

	}

//	public void avviaClessidra() {
//	
//	}

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