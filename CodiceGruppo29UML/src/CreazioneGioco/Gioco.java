package CreazioneGioco;

import java.util.*;

import plancia.PlanciaVolo;
import player.Giocatore;

public class Gioco {

	private String nomeGioco;
	private int numeroGiocatori;
	private static ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
	private static Gioco g = null; // uso pattern singleton
	private PlanciaVolo planciaVolo = null;
	
	private Gioco() {
		// costruttore vuoto perchè settiamo il nome tramite funzione setnome
	}

	public static Gioco getIstanza() { // per accedere all'istanza senza creare un nuovo oggetto nelle altre classi
		if (g == null) {
			g = new Gioco();
		}
		return g;
		// Se esisteva già un gioco questo viene sovrascritto
	}

	public void setNomeGioco(String nome) {
		this.nomeGioco = nome;
	}

	public static ArrayList<Giocatore> getlistaGiocatori() { // per accedere da altre classi
		return giocatori;
	}

	public String getNomeGioco() {
		return this.nomeGioco;
	}

	public void setNumGiocatori(int numero) {
		this.numeroGiocatori = numero;

	}

	public int getNumeroGiocatori() {
		return this.numeroGiocatori;
	}
	
	public PlanciaVolo getPlanciaVolo() { 
		if (planciaVolo == null) {
			System.out.println("creato plancia di volo");
			planciaVolo = new PlanciaVolo();
		}
		return this.planciaVolo;
	}

	public void creaMazzo() {
		// TODO implement here
	}

	public void creaPlanciaNave() {
		// TODO implement here
	}

	public void iniziaGioco() {
		// TODO implement here
	}

	public void restart() {
		// TODO implement here
	}

	public void ritornaVincitore() {
		// TODO implement here
	}

}