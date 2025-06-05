package player;

/**
 * 
 */
public class Giocatore {

	public Giocatore() {
	}

	private String nome;
	private Ruolo ruolo = null;
	private String colore = null;
	private ListaPezziGiocatore listaPezzi = null;
	private int id;
	private int crediti;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	// commento

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getColore() {
		return this.colore;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ListaPezziGiocatore getListaPezzi() {
		// una sola listapezzi per ogni giocatore
		if (listaPezzi == null) {
			listaPezzi = new ListaPezziGiocatore();
		}
		return listaPezzi;
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

enum Ruolo {
	LEADER, PILOTA
}