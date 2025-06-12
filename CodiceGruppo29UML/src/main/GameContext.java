package main;

public class GameContext implements GameState {

	/*
	 * classe che si occupa di mantenere traccia dello stato corrente: Semaforo è il
	 * contesto, ROSSO VERDE GIALLO i possibili stati
	 */
	private static GameContext istanzaGameContext = new GameContext();
	private GameState currentState;

	private GameContext() {
	}

	/*
	 * accedo al contesto tramite metodo get
	 */
	public static GameContext getIstanzaGC() {
		return istanzaGameContext;
	}

	public void setState(GameState state) {
		this.currentState = state;
	}

	public GameState getState() {
		return this.currentState;
	}

	/*
	 * richiama lo stato corrente
	 */
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
