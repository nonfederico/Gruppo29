package main;

public interface GameState {

	/*
	 * rappresentiamo tutti i possibili stati context mantiene il riferimento allo
	 * stato corrente
	 * 
	 * TO DO: void loading(); per caricare i salvataggi
	 */
	void enter(); // per entrare nello stato corrente

	void pause();

	void exit(); // per uscire dallo stato corrente
}
