package Carta;

import java.io.*;
import java.util.*;


public class Contrabbandieri extends Carte {

    private int penalita;
    private int ricompensa;
    private int potenzaFuoco;
    private int giorniPersi;

    
    
    public Contrabbandieri(int penalita, int ricompensa, int potenzaFuoco, int giorniPersi) {
        this.penalita = penalita;
        this.ricompensa = ricompensa;
        this.potenzaFuoco = potenzaFuoco;
        this.giorniPersi = giorniPersi;
    }
     
    
    // da implementare la classe giocatori 
    
    public void battaglia(List<Giocatore> giocatoriInOrdine) {
        System.out.println("⚔️ I Contrabbandieri attaccano! Potenza: " + potenzaFuoco);

        for (Giocatore g : giocatoriInOrdine) {
            int potenzaGiocatore = g.calcolaPotenzaFuoco();
            System.out.println(g.getNome() + " ha potenza di fuoco: " + potenzaGiocatore);

            int confronto;
            if (potenzaGiocatore == potenzaFuoco) confronto = 0;
            else if (potenzaGiocatore > potenzaFuoco) confronto = 1;
            else confronto = 2;

            switch (confronto) {
                case 1: // Vittoria
                    System.out.println("✅ " + g.getNome() + " sconfigge i Contrabbandieri! Guadagna " + ricompensa + " merci.");
                    g.guadagnaMerci(ricompensa);
                    g.perdiGiorniVolo(giorniPersi); // perdita effettiva di giorni di volo dalla carta
                    return; // Battaglia finita
                case 0: // Pareggio
                    System.out.println("😐 " + g.getNome() + " pareggia. I Contrabbandieri proseguono.");
                    break;
                case 2: // Sconfitta
                    System.out.println("❌ " + g.getNome() + " perde! Subisce una penalità di " + penalita + ".");
                    g.subisciPenalita(penalita);
                    break;
            }
        }
    }
    
    
	public int getPenalita() {
		return penalita;
	}



	public void setPenalita(int penalita) {
		this.penalita = penalita;
	}



	public int getRicompensa() {
		return ricompensa;
	}



	public void setRicompensa(int ricompensa) {
		this.ricompensa = ricompensa;
	}



	public int getPotenzaFuoco() {
		return potenzaFuoco;
	}



	public void setPotenzaFuoco(int potenzaFuoco) {
		this.potenzaFuoco = potenzaFuoco;
	}



	public int getGiorniPersi() {
		return giorniPersi;
	}



	public void setGiorniPersi(int giorniPersi) {
		this.giorniPersi = giorniPersi;
	}

}