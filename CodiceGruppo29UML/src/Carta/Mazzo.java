package Carta;

import java.util.Stack;

public class Mazzo {

	private static Mazzo istanza = null;

	private Mazzo() {
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

	public Carte getCarta() {
		if (mazzo.isEmpty()) {
			System.out.println("no carte");
			return null;
		}
		return mazzo.pop();

	}

}
