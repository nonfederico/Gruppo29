package Carta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import player.Giocatore;

// Enum definito all'inizio del file, ma fuori dalle classi principali

public class PioggiaMeteoriti extends Carte {
	public enum Direzione {
		avanti, dietro, sinistra, destra
	}

	private List<Meteorite> meteoriti;

	public static class Meteorite {
		public TipoMeteoriti tipo;
		public Direzione direzione; // uso enum qui
		public int rigaColonna;

		public Meteorite(TipoMeteoriti tipo, Direzione direzione, int rigaColonna) {
			this.tipo = tipo;
			this.direzione = direzione;
			this.rigaColonna = rigaColonna;
		}
	}

	public PioggiaMeteoriti() {
		this.meteoriti = new ArrayList<>();
	}

	public void generaMeteoritiCasuali(int numero) {
		meteoriti.clear();
		Random rand = new Random();
		Direzione[] direzioni = Direzione.values(); // uso enum

		for (int i = 0; i < numero; i++) {
			TipoMeteoriti tipo = rand.nextBoolean() ? TipoMeteoriti.piccoli : TipoMeteoriti.grandi;
			Direzione direzione = direzioni[rand.nextInt(direzioni.length)];

			int dado1 = rand.nextInt(6) + 1;
			int dado2 = rand.nextInt(6) + 1;
			int rigaColonna = dado1 + dado2;

			meteoriti.add(new Meteorite(tipo, direzione, rigaColonna));
		}
	}

	public void colpoMeteorite(Giocatore giocatore) {
		// to do
//		System.out.println(">> Risoluzione impatti meteoriti per il giocatore: " + giocatore.getNome());
//		for (Meteorite m : meteoriti) {
//			System.out.println("- Meteorite " + m.tipo + " da " + m.direzione + " colpisce alla " + m.rigaColonna);
//			boolean colpito = giocatore.getPlancia().valutaImpatto(m);
//			if (colpito) {
//				System.out.println("  -> Componente colpito!");
//			} else {
//				System.out.println("  -> Nessun impatto (colpo mancato o difeso).");
//			}
//		}
	}

	public void azioneRispostaMeteoriti(Giocatore giocatore) {
		colpoMeteorite(giocatore);
	}
}

enum TipoMeteoriti {
	piccoli, grandi
}
