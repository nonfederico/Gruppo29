//package CreazioneGioco;
//
//import javax.swing.SwingWorker;
//
//import grafica.HandleGraphics;
//import main.GameState;
//
//public class CreaPlanciaNave extends SwingWorker<Void, Void> implements GameState {
//
//	public CreaPlanciaNave() {
//	}
//
//	@Override
//	public void enter() {
//		try {
//			Thread.sleep(2 * 1000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//		HandleGraphics.getGraphics().DisabledAreaText("crea la plancia nave");
//
//	}
//
//	@Override
//	public void pause() {
//	}
//
//	@Override
//	public void exit() {
//	}
//
//	@Override
//	protected Void doInBackground() throws Exception {
//		return null;
//	}
//}
