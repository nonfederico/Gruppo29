package CreazioneGioco;

import java.util.ArrayList;

import player.Giocatore;

public class Gioco {

	private String nomeGioco;
	private int numeroGiocatori;
	private static ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
	private static Gioco g = null; // uso pattern singleton

	/*
	 * costruttore vuoto perchè settiamo il nome tramite funzione setnome
	 */
	private Gioco() {
	}

	/*
	 * per accedere all'istanza senza creare un nuovo oggetto nelle altre classi,
	 * viene creata un'istanza nuova solo se non esiste
	 */
	public static Gioco getIstanza() {
		if (g == null) {
			g = new Gioco();
		}
		return g;

	}

	public void setNomeGioco(String nome) {
		this.nomeGioco = nome;
	}

	/*
	 * funzione usata dalle classi per l'accesso alla lista di giocatori
	 */
	public static ArrayList<Giocatore> getlistaGiocatori() {
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

	public void ritornaVincitore() {
		// TODO implement here
	}

}