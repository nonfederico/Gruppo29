package player;

/**
 * 
 */
public class Giocatore {

	public Giocatore() {
	}

	private String nome;

	private String ruolo;

	private String colore;

	private ListaPezziGiocatore listaPezzi = null;

	private int id;

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getColore() {
		return this.colore;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void addListaPezzi(ListaPezziGiocatore lista) {
		this.listaPezzi = lista;
	}

	public void pescaCarte() {
		// TODO implement here
	}

	public void azionaScudi() {
		// TODO implement here
	}

	public void azionaCannoni() {
		// TODO implement here
	}

	public void attivaMotori() {
		// TODO implement here
	}

	public void posizionaComponenti() {
		// TODO implement here
	}

	public void rimuoviComponenti() {
		// TODO implement here
	}

	public void lanciaDadi() {
		// TODO implement here
	}

	public void avviaTempo() {
		// TODO implement here
	}

	public void modificaNave() {
		// TODO implement here
	}

	public boolean isLeader() {
		boolean Leader = true;
		return Leader;
		// TODO implement here
	}

	public void prendiCrediti() {
		// TODO implement here
	}

}

enum colore {
	bianco, blu, rosso, verde
}