package grafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import plancia.ComponentiProva;

public class GraficaPlanciaNave extends JPanel {
//TO DO: gestire parte grafica relativa alla plancia nave (posizione 2,2)
	private ComponentiProva[][] caselle = new ComponentiProva[5][5];

	public GraficaPlanciaNave() {
		setLayout(new GridLayout(5, 5));
		setCaselleVuote();
		setCaselleDisponibili();
	}

	public void setCaselleVuote() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ComponentiProva componente = new ComponentiProva();
				componente.setBackground(Color.LIGHT_GRAY);
				componente.setBorder(new LineBorder(Color.BLUE));
				caselle[i][j] = componente;
				add(componente);
//				JButton bottone = new JButton(Integer.toString(i) + " " + Integer.toString(j));
//
//				System.out.println("bottone aggiunto");
//				bottone.setBorder(new LineBorder(Color.black));
//				bottone.setBackground(Color.WHITE);
//				System.out.println("bottone nero");
//				caselle[i][j] = bottone;
//				add(bottone);

			}
		}
	}

	private void setCaselleDisponibili() {
		caselle[0][0].setBackground(Color.white);
		caselle[0][1].setBackground(Color.white);
		caselle[0][3].setBackground(Color.white);
		caselle[0][4].setBackground(Color.white);
		caselle[1][0].setBackground(Color.white);
		caselle[1][4].setBackground(Color.white);
		caselle[4][2].setBackground(Color.white);

		caselle[0][0].setBorder(new LineBorder(Color.white));
		caselle[0][1].setBorder(new LineBorder(Color.white));
		caselle[0][3].setBorder(new LineBorder(Color.white));
		caselle[0][4].setBorder(new LineBorder(Color.white));
		caselle[1][0].setBorder(new LineBorder(Color.white));
		caselle[1][4].setBorder(new LineBorder(Color.white));
		caselle[4][2].setBorder(new LineBorder(Color.white));

		caselle[0][0].setEnabled(false);
		caselle[0][1].setEnabled(false);
		caselle[0][3].setEnabled(false);
		caselle[0][4].setEnabled(false);
		caselle[1][0].setEnabled(false);
		caselle[1][4].setEnabled(false);
		caselle[4][2].setEnabled(false);
	}

//	public void caselleInutilizzabili() {
//
//	}
//
//	public void aggiungiComponente() {
//		ComponentiProva componente = new ComponentiProva();
//
//	}

//	public void setCuoreNave() {
//		caselle[3][3] = new ComponentiProva();
//	}
//	public void insertComponente() {
//		
//	}
}
