package CreazionePlanciaNave;

import main.GameState;

public class CreaPlanciaNave implements GameState {

	/*
	 * contesto del gioco in cui si crea la plancianave di ogni giocatore
	 */
	private CreaPlanciaNaveGiocatori planciaG = new CreaPlanciaNaveGiocatori();

	public CreaPlanciaNave() {

	}

	@Override
	public void enter() {
		planciaG.execute();
		// quando execute termina, vado nel contesto volo

	}

	@Override
	public void pause() {

	}

	@Override
	public void exit() {

	}

}
