package player;

/**
 * 
 */
public class Giocatore {

	/**
	 * Default constructor
	 */
	public Giocatore() {
	}

	/**
	 * 
	 */
	public String nome;

	/**
	 * 
	 */
	public String ruolo;

	public String colore;

	/**
	 * 
	 */
	public int id;

	/**
	 * 
	 */
	public void selezionaColore(String colore) {
		// TODO implement here
		this.colore = colore;
	}

	/**
	 * 
	 */
	public void selezionaNome(String nome) {
		// TODO implement here
		this.nome = nome;
	}

	/**
	 * 
	 */
	public void pescaCarte() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void azionaScudi() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void azionaCannoni() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void attivaMotori() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void posizionaComponenti() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void rimuoviComponenti() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void lanciaDadi() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void avviaTempo() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void modificaNave() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public boolean isLeader() {
		boolean Leader = true;
		return Leader;
		// TODO implement here
	}

	/**
	 * 
	 */
	public void prendiCrediti() {
		// TODO implement here
	}

}

enum colore {
	bianco, blu, rosso, verde
}