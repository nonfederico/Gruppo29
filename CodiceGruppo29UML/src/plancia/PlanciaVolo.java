package plancia;

import java.io.*;
import java.util.*;
import player.Giocatore;

/**
 * 
 */
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
    		
    		return;
    	}
    	
    	percorso[posizioneCorrente].remove(g);
    	int nuovaPosizione = Math.min(posizioneCorrente + passi, LUNGHEZZA -1);
    	percorso[nuovaPosizione].add(g);
    	
    }
    
    
//    determina chi è più avanti nel tracciato 
    
    public Giocatore getLeader() {
    	
    	for(int i = LUNGHEZZA - 1; i >= 0; i-- ) {
    		
    		if(!percorso[i].isEmpty()) {
    			
    			return percorso[i].get(0); // giocatore nella posizione più avanzata
    		}
    	}
    	
    	return null;
    }
    
//    visualizza la plancia di volo 
    
    public void stampaPlancia() {
    	
    	for(int i = 0; i < LUNGHEZZA ; i++) {
    		
    		System.out.println("[ " + i + " ]");
    		for(Giocatore g : percorso[i]) {
    			
    			System.out.println(g.getNome() + " ");
    			
    		}
    		
    		System.out.println();
    	}
    }
}
    
//    
//    
//
//
//    /**
//     * 
//     */
//    public int[] posizioneGiocatori;
//
//    /**
//     * 
//     */
//    public int crediti;
//
//
//
//
//
//    /**
//     * 
//     */
//    public void visualizzaPericoli() {
//        // TODO implement here
//    }
//
//    /**
//     * richiamata a fine di ogni turno
//     */
//    public void ritornaOrdineGiocatori() {
//        // TODO implement here
//    }
//
//    /**
//     * 
//     */
//    public void spostaGiocatori() {
//        // TODO implement here
//    }
//
//    /**
//     * 
//     */
//    public void ricompensaOrdineArrivo() {
//        // TODO implement here
//    }
//
//    /**
//     * 
//     */
//    public void ricompensaNaveBella() {
//        // TODO implement here
//    }
//
//    /**
//     * 
//     */
//    public void ricompensaMerci() {
//        // TODO implement here
//    }
//
//    /**
//     * 
//     */
//    public void penalitàPerdite() {
//        // TODO implement here
//    }
//
//}
//
//enum tipologia {
//	Livello0,
//	Livello1
//}