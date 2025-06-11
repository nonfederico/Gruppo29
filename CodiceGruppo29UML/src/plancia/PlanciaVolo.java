package plancia;

import java.io.*;
import java.util.*;
import player.Giocatore;

public class PlanciaVolo {

	private final int LUNGHEZZA = 21;
	private ArrayList[] percorso;
	
    public PlanciaVolo() {
    	
    	percorso = new ArrayList[LUNGHEZZA];
    	
    	for(int i = 0; i < LUNGHEZZA; i++ ) {
    		
    		percorso[i] = new ArrayList();
    	}
    	
    }
    
//    aggiuge un giocatore nella posizione 0 (iniziale)
    
    public void aggiungiGiocatore(Giocatore g) {
    	
    	percorso[0].add(g);
    }
    
//    trova la posizione di un determinato giocatore
    
    public int trovaPosizione(Giocatore g) {
    	
    	for(int i = 0; i < LUNGHEZZA; i++) {
    		
    		if(percorso[i].contains(g)) {
    			
    			return i;
    		}
    	}
    	
    	return -1;
    }
    
//    muove un giocatore di un certo numero di passi
    
    public void muoviGiocatore(Giocatore g, int passi) {
    	
    	int posizioneCorrente = trovaPosizione(g);
    	if(posizioneCorrente == -1) {
    		
    		System.out.println("il giocatore: " + g.getNome() + " non è presente sulla plancia.");
    		return;
    	}
    	
    	int nuovaPosizione = Math.min(posizioneCorrente + passi, LUNGHEZZA -1);
    	
    	
    	if(!percorso[nuovaPosizione].isEmpty()) {
			
			System.out.println("la posizione " + nuovaPosizione + " è gia occupata.");
		}
    	
//    	sposta il giocatore 
    	
    	percorso[posizioneCorrente].remove(g);
    	percorso[nuovaPosizione].add(g);
    	
    	System.out.println(g.getNome() + " si è mosso alla posizione " + nuovaPosizione);
    	
    }
    
    
//    determina chi è più avanti nel tracciato 
    
    public Giocatore getLeader() {
    	
    	for(int i = LUNGHEZZA - 1; i >= 0; i-- ) {
    		
    		if(!percorso[i].isEmpty()) {
    			
    			return (Giocatore) percorso[i].get(0); // giocatore nella posizione più avanzata
    		}
    	}
    	
    	return null;
    }
}