package main;

import javax.swing.SwingWorker;

import grafica.HandleGraphics;

/*
 * clessidra lo implementiamo come SwingWorker, per eseguire il thread clessidra in un thread separato dall'edt (quello del main)
 */
public class Clessidra extends SwingWorker<String, Void> {

	boolean attivo;
	public int tempoMax = 30 * 1000;

	/*
	 * sovrascrivo il metodo doInBackground di swingworker se clicchi il pulsante
	 * azzurro vicino alla carta, il timer parte e si ferma dopo 3 secondi
	 */
	@Override
	protected String doInBackground() throws Exception {

		attivo = true;
		while (attivo) {
			try {
				HandleGraphics.getGraphics().writeInformazioni("timer attivo");
				System.out.println("timer attivato");
				Thread.sleep(3 * 1000);
				done();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("timer scaduto");
		HandleGraphics.getGraphics().writeInformazioni("timer scaduto");
		return "";
	}

	@Override
	protected void done() {
		attivo = false;
	}

	public Clessidra() {
	}

	public void stopClessidra() {
		HandleGraphics.getGraphics().writeInformazioni("timer disattivato");
		attivo = false;
	}

}