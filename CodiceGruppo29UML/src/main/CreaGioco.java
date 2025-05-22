package main;

import grafica.FrameBase;

public class CreaGioco implements GameState {

	private static Gioco g = null; // uso pattern singleton
	FrameBase frameBase = new FrameBase(); // interfaccia grafica

	@Override
	public void enter() {

		frameBase.returnAreaText("Inserisci nome del gioco:");
//		if (!frameBase.areaInterazione.readText().equals("")) {
//			frameBase.areaInterazione.writeText("Benvenuto astronauta...");
//			g.getIstanza(); // creo un gioco o carico quello che esiste già
//		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

//	public void update() { // interagisco con l'utente
//
//		// nome gioco
//		frameBase.areaInterazione.writeText("Inserisci nome del gioco:");
//
//		try {
//			g.setNomeGioco(frameBase.areaInterazione.readText());
//			while (g.getNomeGioco().isEmpty() || g.getNomeGioco().length() < 4 || g.getNomeGioco().length() > 10) {
//				System.out.print("inserisci il nome del gioco: ");
//				g.setNomeGioco(frameBase.areaInterazione.readText());
//			}
//			frameBase.areaInterazione.writeText("Inizia la partita " + g.getNomeGioco());
//		} catch (Exception e) {
//			System.out.println("errore nell'input");
//		}
//
//		// numero giocatori
//		frameBase.areaInterazione.writeText("Inserisci numero dei giocatori (da 1 a 4)");
//
//		try {
//			g.setNumGiocatori(Integer.parseInt(frameBase.areaInterazione.readText()));
//			while (g.getNumeroGiocatori() < 1 || g.getNumeroGiocatori() > 4) {
//				System.out.print("errore, inserisci numero giocatori (1-4):");
//				g.setNumGiocatori(Integer.parseInt(frameBase.areaInterazione.readText()));
//			}
//		} catch (Exception e) {
//			System.out.println("errore nell'inserimento del numero di giocatori");
//		}
//
//		System.out.println("il numero di giocatori è: " + g.getNumeroGiocatori());
//	}
//
//	public void exit() {
//		frameBase.areaInterazione.writeText("prossima fase..");
//	}

}
