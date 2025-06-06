package CreazioneGioco;

import java.util.ArrayList;

public class Colore {
	enum Colori {
		BLU, VERDE, GIALLO, ROSSO;
	}

	private boolean esiste = false;

	private ArrayList<Colori> colori = new ArrayList<Colori>();

	public Colore() {
		esiste = true;
		colori.add(Colori.BLU);
		colori.add(Colori.VERDE);
		colori.add(Colori.GIALLO);
		colori.add(Colori.ROSSO);
	}

	public String getListaColori() {
		StringBuilder listaColoriDisponibili = new StringBuilder();
		if (esiste == true) {
			for (Colori colore : colori) {
				listaColoriDisponibili.append(colore).append(" , ");
			}
			System.out.println(listaColoriDisponibili.toString());
		}
		return listaColoriDisponibili.toString();
	}

	public void chooseColore(String s) {
		for (int i = 0; i < colori.size(); i++) {
			if (colori.get(i).name().equalsIgnoreCase(s)) {
				colori.remove(i);
				return;
			}

		}
	}

}
