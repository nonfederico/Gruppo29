package main;

public interface GameState {
	// rappresentiamo tutti i possibili stati, context si occupa dimantenere il
	// riferimento allo stato corrente che delega l'oggetto context di eseguire le
	// operazioni (contenitore dello sstao)

//	void mainMenu(GameContext context);
//
//	void playing(GameContext context);
//
//	void paused(GameContext context);
//
//	// void loading(); //da implementare se volessimo dare l'opzione di caricare i
//	// salvataggi
//
//	void ending(GameContext context);

	void enter(); // per entrare nello stato corrente

	void pause();

	void exit(); // per uscire dallo stato corrente
}
