package grafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import plancia.Caselle;
import player.Giocatore;

public class GraficaPlanciaVolo extends JPanel {

	private static GraficaPlanciaVolo grafica = null;

	CaselleGrafica[][] caselleGrafica = new CaselleGrafica[6][6];
	Caselle[][] caselle = new Caselle[6][6];
	Giocatore giocatore = null;

	private GraficaPlanciaVolo() {

		setLayout(new GridLayout(6, 6));
		setBorder(new LineBorder(Color.LIGHT_GRAY));
		addCaselle();
		setCaselleDisponibili();
		setCaselleVuote();
		setVisible(true);
	}

	public void addCaselle() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				caselleGrafica[i][j] = new CaselleGrafica();
				caselle[i][j] = new Caselle();
				add(caselleGrafica[i][j]);

			}
		}
	}

	public static GraficaPlanciaVolo getGraficaPlanciaVolo() {

		if (grafica == null) {
			grafica = new GraficaPlanciaVolo();
		}
		return grafica;
	}

	enum StatoEnum {
		CASELLEVUOTE, CASELLEDISPONIBILI
	}

	public void setCaselleDisponibili() {

		this.giocatore = null;

	}

	/*
	 * settiamo le caselle centrali per evidenziare le 20 caselle (presenti sui
	 * bordi) dove si muoveranno i giocatori
	 */
	public void setCaselleVuote() {

		caselleGrafica[1][1].setBackground(Color.white);
		caselleGrafica[1][1].setBorder(new LineBorder(Color.white));
		caselleGrafica[1][1].setEnabled(false);

		caselleGrafica[1][2].setBackground(Color.white);
		caselleGrafica[1][2].setBorder(new LineBorder(Color.white));
		caselleGrafica[1][2].setEnabled(false);

		caselleGrafica[1][3].setBackground(Color.white);
		caselleGrafica[1][3].setBorder(new LineBorder(Color.white));
		caselleGrafica[1][3].setEnabled(false);

		caselleGrafica[1][4].setBackground(Color.white);
		caselleGrafica[1][4].setBorder(new LineBorder(Color.white));
		caselleGrafica[1][4].setEnabled(false);

		caselleGrafica[2][1].setBackground(Color.white);
		caselleGrafica[2][1].setBorder(new LineBorder(Color.white));
		caselleGrafica[2][1].setEnabled(false);

		caselleGrafica[2][2].setBackground(Color.white);
		caselleGrafica[2][2].setBorder(new LineBorder(Color.white));
		caselleGrafica[2][2].setEnabled(false);

		caselleGrafica[2][3].setBackground(Color.white);
		caselleGrafica[2][3].setBorder(new LineBorder(Color.white));
		caselleGrafica[2][3].setEnabled(false);

		caselleGrafica[2][4].setBackground(Color.white);
		caselleGrafica[2][4].setBorder(new LineBorder(Color.white));
		caselleGrafica[2][4].setEnabled(false);

		caselleGrafica[3][1].setBackground(Color.white);
		caselleGrafica[3][1].setBorder(new LineBorder(Color.white));
		caselleGrafica[3][1].setEnabled(false);

		caselleGrafica[3][2].setBackground(Color.white);
		caselleGrafica[3][2].setBorder(new LineBorder(Color.white));
		caselleGrafica[3][2].setEnabled(false);

		caselleGrafica[3][3].setBackground(Color.white);
		caselleGrafica[3][3].setBorder(new LineBorder(Color.white));
		caselleGrafica[3][3].setEnabled(false);

		caselleGrafica[3][4].setBackground(Color.white);
		caselleGrafica[3][4].setBorder(new LineBorder(Color.white));
		caselleGrafica[3][4].setEnabled(false);

		caselleGrafica[4][1].setBackground(Color.white);
		caselleGrafica[4][1].setBorder(new LineBorder(Color.white));
		caselleGrafica[4][1].setEnabled(false);

		caselleGrafica[4][2].setBackground(Color.white);
		caselleGrafica[4][2].setBorder(new LineBorder(Color.white));
		caselleGrafica[4][2].setEnabled(false);

		caselleGrafica[4][3].setBackground(Color.white);
		caselleGrafica[4][3].setBorder(new LineBorder(Color.white));
		caselleGrafica[4][3].setEnabled(false);

		caselleGrafica[4][4].setBackground(Color.white);
		caselleGrafica[4][4].setBorder(new LineBorder(Color.white));
		caselleGrafica[4][4].setEnabled(false);

	}

}
