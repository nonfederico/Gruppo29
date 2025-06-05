package CreazioneGioco;

import java.util.ArrayList;

public class Colore {
	enum Colori {
		BLU, VERDE, GIALLO, ROSSO;
	}

	private boolean esiste = false;

	private ArrayList<Colori> colori = new ArrayList<Colori>();

	private Colore() {
		esiste = true;
		colori.add(Colori.BLU);
		colori.add(Colori.VERDE);
		colori.add(Colori.GIALLO);
		colori.add(Colori.ROSSO);
	}

	public ArrayList<Colori> getListaColori() {
		StringBuilder listaColoriDisponibili = new StringBuilder();
		if (esiste = true) {
			for (Colori colore : colori) {
				listaColoriDisponibili.append(colore).append(" , ");
				System.out.println(listaColoriDisponibili.toString());
			}
		}
		return colori;
	}

}
