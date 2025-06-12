package main;

import CreazioneGioco.CreaGioco;
import grafica.HandleGraphics;

/*
 * IMPORTANTE
 * installare da help-> eclipse marketplace -> windowbuilder current
 * 
 * meglio compilare ed eseguire il codice direttamente da terminale, con eclipse delle volte non esegue in maniera corretta
 * 
 * versione del gioco fino alla creazione della plancia nave di ogni giocatore, creazione del mazzo, creazione della plancia di volo
 * 
 */
public class Main {

	/*
	 * Partiamo dal primo stato creagioco (contesto, classe dentro la quale
	 * chiamiamo setState) prima entro in creagioco, poi il cambio stato e contesto
	 * avverrà durante l'esecuzione nelle altre classi
	 * 
	 * getIstanzaGC().setState(classe entro la quale vuoi attivare lo stato)
	 * 
	 * ogni classe context deve implementare l'interfaccia GameState
	 */
	public static void main(String[] args) {

		HandleGraphics.createGraphics();

		GameState creagioco = new CreaGioco();
		GameContext.getIstanzaGC().setState(creagioco);
		GameContext.getIstanzaGC().enter();

	}

}
