package CreazioneGioco;

import java.awt.Color;
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

	/*
	 * @return lista dei colori disponibili, non ancora selezionati
	 */
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

	/*
	 * funzione per far scegliere il colore all'utente
	 * 
	 * @param s stringa inserita dall'utente
	 * 
	 * @return Color ritorna oggetto di tipo Color
	 */
	public Color chooseColore(String s) {
		Color coloreSettato = null;
		for (int i = 0; i < colori.size(); i++) {
			if (colori.get(i).name().equalsIgnoreCase(s)) {
				colori.remove(i);
				if (s.toLowerCase().equals("blu")) {
					coloreSettato = Color.blue;
				} else if (s.toLowerCase().equals("verde")) {
					coloreSettato = Color.green;
				} else if (s.toLowerCase().equals("giallo")) {
					coloreSettato = Color.yellow;
				} else if (s.toLowerCase().equals("rosso")) {
					coloreSettato = Color.red;
				}
			}
		}
		return coloreSettato;
	}

}
