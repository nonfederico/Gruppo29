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

//	static void welcome() {
//
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("benvenuto, vuoi creare un gioco? (type y or n) ");
//		String scelta = "";
//		try {
//			scelta = buffer.readLine();
//			while (!scelta.equalsIgnoreCase("y") && !scelta.equalsIgnoreCase("n")) {
//				System.out.print("vuoi creare un gioco? (type y or n)");
//				scelta = buffer.readLine();
//			}
//		} catch (Exception e) {
//			System.out.println("errore nell'input");
//		}
//		if (scelta.equalsIgnoreCase("y")) {
//			creaGioco();
//		} else {
//			System.out.println("Non hai voluto creare un gioco, addio astronauta.");
//		}
//	}
//
//	static Gioco creaGioco() {
//
//		getIstanza();
//		// imposta nome
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.print("inserisci il nome del gioco: (4-10 caratteri):");
//		try {
//			String nome = buffer.readLine();
//			while (nome.isEmpty() || nome.length() < 4 || nome.length() > 10) {
//				System.out.print("inserisci il nome del gioco: ");
//				nome = buffer.readLine();
//			}
//			g.setNomeGioco(nome);
//			System.out.println("il nome è " + g.nomeGioco);
//		} catch (Exception e) {
//			System.out.println("errore nell'input");
//		}
//
//		// imposta numero giocatori
//		System.out.print("inserisci numero giocatori (1-4):");
//		int numGiocatori = 0;
//		try {
//			numGiocatori = Integer.parseInt(buffer.readLine());
//			while (numGiocatori < 1 || numGiocatori > 4) {
//				System.out.print("errore, inserisci numero giocatori (1-4):");
//				numGiocatori = Integer.parseInt(buffer.readLine());
//			}
//		} catch (Exception e) {
//			System.out.println("errore nell'inserimento del numero di giocatori");
//		}
//		g.setNumGiocatori(numGiocatori);
//		System.out.println("il numero di giocatori è: " + numGiocatori);
//		return g;
//	}
//

	/**
	 * @param nomeGioco
	 */

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