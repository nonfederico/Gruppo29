package main;

public class GameContext implements GameState {
	// classe che si occupa di mantenere traccia dello stato corrente, ad esempio
	// SEMAFORO sarebbe il contesto (contenitore) e GIALLO, ROSSO, VERDE i possibili
	// stati

	private static GameContext istanzaGameContext = new GameContext();
	private GameState currentState;

	private GameContext() {
	}

	public static GameContext getIstanzaGC() {
		return istanzaGameContext;
	}

	public void setState(GameState state) {
		this.currentState = state;
	}

	public GameState getState() {
		return this.currentState;
	}

	@Override
	public void enter() {
		currentState.enter();
	}

	@Override
	public void pause() {
		currentState.pause();
	}

	@Override
	public void exit() {
		currentState.exit();
	}

}
