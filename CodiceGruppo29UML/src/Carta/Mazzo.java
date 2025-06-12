package Carta;

import java.util.Stack;

import eccezioni.MazzoInvalido;

public class Mazzo {

	private static Mazzo istanza = null;

	int istanzaConteggio = 0;

	private Mazzo() {
		istanzaConteggio = 1;
		creaMazzoMescolato();
	}

	public static Mazzo getMazzo() {
		if (istanza == null) {
			istanza = new Mazzo();
		}
		return istanza;

	}

	private Stack<Carte> mazzo = new Stack<Carte>();

	public Stack<Carte> creaMazzoMescolato() {
		mazzo.push(new ZonaDiGuerra());
		mazzo.push(new Contrabbandieri());
		mazzo.push(new ZonaDiGuerra());
		mazzo.push(new Contrabbandieri());
		mazzo.push(new ZonaDiGuerra());
		mazzo.push(new Contrabbandieri());
		mazzo.push(new ZonaDiGuerra());
		mazzo.push(new ZonaDiGuerra());
		// creo mazzo di 8 carte
		return mazzo;
	}

	public Carte getCarta() throws MazzoInvalido {
		if (mazzo.isEmpty() && istanzaConteggio == 0) {
			throw new MazzoInvalido("errore nella creazione del mazzo");
		}
		return mazzo.pop();

	}

}
