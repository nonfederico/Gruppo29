package main;

public class GameContext implements GameState {
	// classe che si occupa di mantenere traccia dello stato corrente, ad esempio
	// SEMAFORO sarebbe il contesto (contenitore o contesto) e GIALLO, ROSSO, VERDE
	// i possibili
	// stati (uno sarà lo stato corrente, noi abbiamo enter, pause, exit che sono i
	// 3 posibili stati di un videogioco)

	private static GameContext istanzaGameContext = new GameContext();
	private GameState currentState;

	private GameContext() {
	}

	public static GameContext getIstanzaGC() {
		// per accedere al contesto (creagioco, creanave exx..) devo usare metodo get
		return istanzaGameContext;
	}

	public void setState(GameState state) {
		this.currentState = state;
	}

	public GameState getState() {
		return this.currentState;
	}

	// richiama stato corrente
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
