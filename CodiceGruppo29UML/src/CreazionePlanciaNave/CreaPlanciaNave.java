package CreazionePlanciaNave;

import main.GameState;

public class CreaPlanciaNave implements GameState {
	// stato del gioco in cui si crea la plancianave di ogni giocatore
//	GraficaPlanciaNave grafica = new GraficaPlanciaNave();
	private CreaPlanciaNaveGiocatori planciaG = new CreaPlanciaNaveGiocatori();

	public CreaPlanciaNave() {

	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

		planciaG.execute();

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// all'uscita vado alla fase di volo
//		GameContext.getIstanzaGC().setState(Volo);
//		GameContext.getIstanzaGC().enter();

	}

}
