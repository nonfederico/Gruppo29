package main;

import CreazioneGioco.CreaGioco;

public class Main {
	public static void main(String[] args) {
		System.out.println("devo creare gioco");
		CreaGioco creaGioco = new CreaGioco();
		System.out.println("creato creaGioco");
		creaGioco.switchState();

		// TO DO: implementare pattern state per passaggio tra classi, non switch !!

//		String stato = "CREAZIONEGIOCO";

//		switch (stato) {
//		case "CREAZIONEGIOCO":
//			CreaGioco creaGioco = new CreaGioco();
//			while (creaGioco.returnStato() == "ENTER") {
//				creaGioco.enter();
//			}
//			while (creaGioco.returnStato() == "UPDATE") {
//				creaGioco.update();
//			}
//			stato = statoAttuale.setStato2();
//			break;
//
//		case "SETUPPARTITA":
//			stato = statoAttuale.setStato3();
//			break;
//
//		case "VOLO":
//			stato = statoAttuale.setStato4();
//			break;
//
//		case "FINALE":
//			break;
//		}

	}
}
