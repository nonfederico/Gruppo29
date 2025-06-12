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

	public void setCaselleDisponibili(Giocatore g) {

		this.giocatore = null;

	}

	public void setCaselleVuote(Giocatore g) {

	}

}
