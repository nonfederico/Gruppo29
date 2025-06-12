package Carta;

import java.util.List;
import java.util.function.ToIntFunction;

import player.Giocatore;

public class ZonaDiGuerra extends Carte {
	public enum cannonate {
		piccole, grandi
	}

	public enum Direzione {
		avanti, dietro, sinistra, destra
	}

	// Costruttore base, non servono parametri
	public ZonaDiGuerra() {
	}

	// Metodo principale da chiamare per applicare gli effetti della carta
	public void applicaEffetti(List<Giocatore> giocatoriInOrdine) {
		System.out.println("Zona di Guerra attivata");
		penalitaMenoEquipaggio(giocatoriInOrdine);
		penalitaMenoPotenzaMotrice(giocatoriInOrdine);
		penalitaMenoPotenzaFuoco(giocatoriInOrdine);
	}

	// Penalizza il giocatore con meno equipaggio
	private void penalitaMenoEquipaggio(List<Giocatore> giocatori) {
		Giocatore target = trovaGiocatoreConValoreMinimo(giocatori, g -> g.getEquipaggioTotale());
		System.out.println(target.getNome() + " ha meno equipaggio: perde 3 giorni di volo");
		target.perdiGiorniVolo(3);
	}

	// Penalizza il giocatore con meno potenza motrice
	private void penalitaMenoPotenzaMotrice(List<Giocatore> giocatori) {
		Giocatore target = trovaGiocatoreConValoreMinimo(giocatori, g -> g.calcolaPotenzaMotrice());
		System.out.println(target.getNome() + " ha meno potenza motrice: perde 2 membri dell'equipaggio");
		target.perdiEquipaggio(2);
	}

	// Penalizza il giocatore con meno potenza di fuoco
	private void penalitaMenoPotenzaFuoco(List<Giocatore> giocatori) {
		Giocatore target = trovaGiocatoreConValoreMinimo(giocatori, g -> g.calcolaPotenzaFuoco());
		System.out.println(target.getNome() + " ha meno potenza di fuoco: subisce due cannonate");

		// Prima cannonata: piccola, difendibile con scudo
		applicaCannonata(target, cannonate.piccole);

		// Seconda cannonata: grande, non difendibile
		applicaCannonata(target, cannonate.grandi);
	}

	// Gestisce una singola cannonata su un giocatore
	private void applicaCannonata(Giocatore g, cannonate tipo) {
		// to do
//		int dado1 = new Random().nextInt(6) + 1;
//		int dado2 = new Random().nextInt(6) + 1;
//		int colpo = dado1 + dado2;
//
//		Direzione direzione = Direzione.dietro;
//
//		System.out.println("Cannonata " + tipo + " alla colonna " + colpo + " da " + direzione);
//
//		boolean colpito = g.getPlancia().valutaCannonata(tipo, direzione, colpo);
//		if (colpito) {
//			System.out.println("Componente distrutto");
//		} else {
//			System.out.println("Impatto evitato");
//		}
	}

	// Trova il giocatore con il valore minimo in base a un criterio, usando
	// l'ordine di rotta per risolvere i pareggi
	private Giocatore trovaGiocatoreConValoreMinimo(List<Giocatore> giocatori, ToIntFunction<Giocatore> criterio) {
		int min = Integer.MAX_VALUE;
		Giocatore candidato = null;

		for (Giocatore g : giocatori) {
			int valore = criterio.applyAsInt(g);
			if (valore < min || (valore == min && piuAvanti(g, candidato, giocatori))) {
				min = valore;
				candidato = g;
			}
		}
		return candidato;
	}

	// Ritorna true se g1 e' piu' avanti di g2 nella rotta
	private boolean piuAvanti(Giocatore g1, Giocatore g2, List<Giocatore> ordine) {
		if (g2 == null)
			return true;
		return ordine.indexOf(g1) < ordine.indexOf(g2);
	}
}
