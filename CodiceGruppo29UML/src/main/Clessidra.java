package main;

import javax.swing.SwingWorker;

import grafica.HandleGraphics;

/**
 * 
 */
public class Clessidra extends SwingWorker<String, Void> {
//public class Clessidra implements Runnable {
	boolean attivo;
	public int tempoMax = 30 * 1000;

	@Override
	protected String doInBackground() throws Exception {
		attivo = true;
		while (attivo) {
			try {
				HandleGraphics.getGraphics().writeInformazioni("timer attivo");
				Thread.sleep(5 * 1000);
				done();
//				stopClessidra();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		HandleGraphics.getGraphics().writeInformazioni("timer scaduto");
		return "";
	}

	@Override
	protected void done() {
		attivo = false;
	}

	public Clessidra() {
//    	creo clessidra, avvio

	}

	public void stopClessidra() {
		HandleGraphics.getGraphics().writeInformazioni("timer disattivato");
		attivo = false;
	}

}