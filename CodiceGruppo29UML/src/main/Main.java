package main;

import CreazioneGioco.CreaGioco;
import grafica.HandleGraphics;

public class Main {

	public static void main(String[] args) {
		// classe client

		HandleGraphics.createGraphics();

		// partiamo dal primo stato (contesto) creagioco
		GameState creagioco = new CreaGioco();
		GameContext.getIstanzaGC().setState(creagioco);
		GameContext.getIstanzaGC().enter(); // entro nello stato enter di creagioco
		// il cambio di stato e contesto lo faremo nelle altre classi tramite
		// getIstanzaGC().setState(classe entro la quale vuoi attivare lo stato)
		// , il context è la classe dentro la quale chiamiamo setState
		// la classe context deve implementare l'interfaccia GameState

	}

}

//struttura codice:
//	campi
//	campi statici
//	costruttori
//	metodi
//	metodi statici