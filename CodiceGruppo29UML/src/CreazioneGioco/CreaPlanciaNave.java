package CreazioneGioco;

import grafica.HandleGraphics;
import main.GameState;

public class CreaPlanciaNave implements GameState {
	public CreaPlanciaNave() {

	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HandleGraphics.getGraphics().DisabledAreaText("crea la plancia nave");

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}
}
