package CreazioneGioco;

public class Gioco {

	private String nomeGioco;
	private int numeroGiocatori;
	private static Gioco g = null; // uso pattern singleton

	public Gioco() {
		// costruttore vuoto perchè settiamo il nome tramite funzione setnome
	}

	public static Gioco getIstanza() {
		if (g == null) {
			g = new Gioco();
		}
		return g;
		// Se esisteva già un gioco questo viene sovrascritto
	}

	public void setNomeGioco(String nome) {
		this.nomeGioco = nome;
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