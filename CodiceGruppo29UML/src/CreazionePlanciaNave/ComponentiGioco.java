package CreazionePlanciaNave;

public class ComponentiGioco {

//	public enum connettori {
//		NESSUNO, SINGOLO, DOPPIO, UNIVERSALE
//	}

	// usati in PosizionaCaselle

	private Connettori[] listaConnettori = { Connettori.NESSUNO, Connettori.NESSUNO, Connettori.NESSUNO,
			Connettori.NESSUNO };
	private Connettori[] listaConnettoriAdiacenti = { Connettori.NESSUNO, Connettori.NESSUNO, Connettori.NESSUNO,
			Connettori.NESSUNO };
// lista usata per vedere se ci sono connettori ai lati adiacenti al pezzo

	private int[] posizioneComponente = { 0, 0 };

	enum statoPos {
		NORD, EST, SUD, OVEST
	}

	public ComponentiGioco() {
		setConnettori();
	}
//	statoPos posLati = statoPos.NORD;

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
		this.listaConnettori[0] = Connettori.UNIVERSALE;
		this.listaConnettori[1] = Connettori.UNIVERSALE;
		this.listaConnettori[2] = Connettori.UNIVERSALE;
		this.listaConnettori[3] = Connettori.UNIVERSALE;
	}

}