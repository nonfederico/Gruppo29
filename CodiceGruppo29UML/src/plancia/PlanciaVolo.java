
package plancia;

import player.Giocatore;

public class PlanciaVolo {

	private final int LUNGHEZZA = 21;
	private int giorniPersi;
	private Caselle[] percorso;
	private int contatore = 0;

	public PlanciaVolo() {

		percorso = new Caselle[LUNGHEZZA];

		for (int i = 0; i < LUNGHEZZA; i++) {
			percorso[i] = new Caselle();
		}

	}

	public int incremento() {
		return contatore++;
	}

	/*
	 * @return Giorni Persi
	 */
	public int getGiorniPersi() {
		return giorniPersi;
	}

	/*
	 * calcola la posizione di un giocatore mosso aggiuge un giocatore nella
	 * posizione 0 (iniziale)
	 * 
	 * @param g giocatore da settare
	 */
	public void aggiungiGiocatore(Giocatore g) {

		percorso[0].setOccupante(g);
	}

	/*
	 * @param g giocatore di cui vogliamo trovare la posizione
	 * 
	 * @return int, -1 se non troviamo la posizione del giocatore indicato
	 */
	public int trovaPosizione(Giocatore g) {
		for (int i = 0; i < LUNGHEZZA; i++) {
			if (percorso[i].getOccupante() != null && percorso[i].getOccupante().equals(g)) {
				return i;
			}
		}

		return -1;

	}

	/*
	 * per determinare chi è il primo giocatore in termini di posizione sul
	 * tabellone
	 * 
	 * @return Giocatore
	 */
	public Giocatore getLeader() {

		for (int i = LUNGHEZZA - 1; i >= 0; i--) {

			if (!percorso[i].isOccupata()) {

				return percorso[i].getOccupante();
			}
		}

		return null;
	}

	public void muoviGiocatore(Giocatore g, int passi) {

		int posizioneAttuale = trovaPosizione(g);
		if (posizioneAttuale == -1) {
			System.out.println("\nGiocatore non trovato");
			return;
		}

		percorso[posizioneAttuale].libera();

		int nuovaPosizione = posizioneAttuale + passi;
		while (nuovaPosizione < LUNGHEZZA && percorso[nuovaPosizione].isOccupata()) {
			nuovaPosizione++;
		}

		if (nuovaPosizione >= LUNGHEZZA) {

			System.out.println("\nGiro completato! Riparti dalla casella iniziale");
			System.out.println("\nGiro numero " + incremento());
		}

		percorso[nuovaPosizione].setOccupante(g);
		System.out.println("\nGiocatore " + g.getNome() + " si sposta alla casella " + nuovaPosizione);
	}
}
