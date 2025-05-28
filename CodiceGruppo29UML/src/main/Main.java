package main;

import CreazioneGioco.CreaGioco;

public class Main {
	public static void main(String[] args) {
		// classe client

		GameContext context = new GameContext();
		GameState creagioco = new CreaGioco();
		context.setState(creagioco);
		context.enter(); // entra nell'enter di creagioco

//		System.out.println("devo creare gioco");
//		CreaGioco creaGioco = new CreaGioco();
//		System.out.println("creato creaGioco");
//		creaGioco.switchState();

	}
}
