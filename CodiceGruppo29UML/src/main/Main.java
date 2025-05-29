package main;

import CreazioneGioco.CreaGioco;
import grafica.HandleGraphics;

public class Main {
	public static void main(String[] args) {
		// classe client
		HandleGraphics.createGraphics();
		GameContext context = new GameContext();
		GameState creagioco = new CreaGioco();
		context.setState(creagioco);
		context.enter(); // entra nell'enter di creagioco

		// context.pause lo associo ad un pulsante che sta in ascolto e cambia stato
		// quando viene premuto

//		System.out.println("devo creare gioco");
//		CreaGioco creaGioco = new CreaGioco();
//		System.out.println("creato creaGioco");
//		creaGioco.switchState();

	}
}
