
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

//    ritorna il caso Giorni Persi 

	public int getGiorniPersi() {
		return giorniPersi;
	}

//    calcola la posizione di un giocatore mosso 

//    aggiuge un giocatore nella posizione 0 (iniziale)

	public void aggiungiGiocatore(Giocatore g) {

		percorso[0].setOccupante(g);
	}

//    trova la posizione di un determinato giocatore

	public int trovaPosizione(Giocatore g) {

		for (int i = 0; i < LUNGHEZZA; i++) {

			if (percorso[i].getOccupante() != null && percorso[i].getOccupante().equals(g)) {

				return i;
			}
		}

		return -1; // posizione non trovata
	}

//    determina chi è più avanti nel tracciato 

	public Giocatore getLeader() {

		for (int i = LUNGHEZZA - 1; i >= 0; i--) {

			if (!percorso[i].isOccupata()) {

				return percorso[i].getOccupante(); // giocatore nella posizione più avanzata
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

//		libera la posizione attuale

		percorso[posizioneAttuale].libera();

		int nuovaPosizione = posizioneAttuale + passi;

		while (nuovaPosizione < LUNGHEZZA && percorso[nuovaPosizione].isOccupata()) {
			nuovaPosizione++;
		}

		if (nuovaPosizione >= LUNGHEZZA) {

			System.out.println("\nGiro completato! Riparti dalla casella iniziale");
			System.out.println("\nGiro numero " + incremento());
		}

//		sposta il giocatore nella nuova posizione

		percorso[nuovaPosizione].setOccupante(g);
		System.out.println("\nGiocatore " + g.getNome() + " si sposta alla casella " + nuovaPosizione);
	}
}
