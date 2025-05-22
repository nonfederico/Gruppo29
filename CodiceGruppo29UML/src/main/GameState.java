package main;

public interface GameState {
	// rappresentiamo gli stati del gioco presenti nel diagramma della macchina a
	// stati
	// usiamo lo state pattern

	void enter(); // inizializziamo i componenti che ci servono

	void update(); // operazioni negli stati

	void exit(); // salviamo le variabili utili e passiamo al prossimo stato
}
