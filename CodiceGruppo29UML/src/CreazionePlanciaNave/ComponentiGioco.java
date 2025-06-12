package CreazionePlanciaNave;

public class ComponentiGioco {

	/*
	 * lista usata per vedere se ci sono connettori ai lati adiacenti al pezzo
	 */
	private Connettori[] listaConnettori = { Connettori.NESSUNO, Connettori.NESSUNO, Connettori.NESSUNO,
			Connettori.NESSUNO };
	private Connettori[] listaConnettoriAdiacenti = { Connettori.NESSUNO, Connettori.NESSUNO, Connettori.NESSUNO,
			Connettori.NESSUNO };

	private int[] posizioneComponente = { 0, 0 };

	enum statoPos {
		NORD, EST, SUD, OVEST
	}

	public ComponentiGioco() {
	}

	public void setCoordinate(int riga, int colonna) {
		this.posizioneComponente[0] = riga;
		this.posizioneComponente[1] = colonna;
	}

	public int[] returnCoordinate() {
		return posizioneComponente;
	}

	public Connettori[] getListaConnettori() {
		return this.listaConnettori;
	}

	public Connettori[] getListaConnettoriAdiacenti() {
		return this.listaConnettoriAdiacenti;
	}

	public void setConnettori() {
		getListaConnettori()[0] = Connettori.UNIVERSALE;
		getListaConnettori()[1] = Connettori.UNIVERSALE;
		getListaConnettori()[2] = Connettori.UNIVERSALE;
		getListaConnettori()[3] = Connettori.UNIVERSALE;
//		this.listaConnettori[0] = Connettori.UNIVERSALE;
//		this.listaConnettori[1] = Connettori.UNIVERSALE;
//		this.listaConnettori[2] = Connettori.UNIVERSALE;
//		this.listaConnettori[3] = Connettori.UNIVERSALE;
	}

}