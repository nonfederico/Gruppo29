package main;

import javax.swing.SwingWorker;

import grafica.HandleGraphics;

public class Clessidra extends SwingWorker<String, Void> {
//clessidra lo implementiamo come SwingWorker, per eseguire il thread clessidra in un thread separato dall'edt (quello del main)
	boolean attivo;
	public int tempoMax = 30 * 1000;

	@Override
	protected String doInBackground() throws Exception {
		// sovrascrivo il metodo doInBackground di swingworker
		attivo = true;
		while (attivo) {
			try {
				// conta fino a 3 secondi (rimane attivo) e al termine si ferma tramite done(),
				// funzione usata per chiedere al thread di terminare
				HandleGraphics.getGraphics().writeInformazioni("timer attivo");
				Thread.sleep(3 * 1000);
				done();
//				stopClessidra();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		HandleGraphics.getGraphics().writeInformazioni("timer scaduto"); // modifico componente tramite handlegraphics
		return "";
	}

	@Override
	protected void done() {
		attivo = false;
	}

	public Clessidra() {
//    	creo clessidra
	}

	public void stopClessidra() {
		HandleGraphics.getGraphics().writeInformazioni("timer disattivato");
		attivo = false;
	}

}