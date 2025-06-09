package grafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import plancia.ComponentiProva;
import player.Giocatore;

public class GraficaPlanciaNave extends JPanel {
//TO DO: gestire parte grafica relativa alla plancia nave (posizione 2,2)
//	private PlanciaNave caselle = new PlanciaNave();
//	private Stack<ComponentiProva> pilaComponenti = new Stack<ComponentiProva>();

	private static GraficaPlanciaNave grafica = null;

	private GraficaPlanciaNave() {
		setLayout(new GridLayout(5, 5));
//		setCaselleVuote();
//
//		setCaselleDisponibili();
		setVisible(true);
	}

	public static GraficaPlanciaNave getGraficaPlanciaNave() {
		if (grafica == null) {
			grafica = new GraficaPlanciaNave();
		}
		return grafica;
	}

	public void setCaselleVuote(Giocatore g) { // lo vado a richiamare durante la fase creazionePlanciaNave
		// setto caselle per ogni giocatore poi faccio repaint
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ComponentiProva componente = new ComponentiProva();
				componente.setCoordinate(i, j);
				componente.setBackground(Color.LIGHT_GRAY);
				componente.setBorder(new LineBorder(Color.BLUE));
				g.getPlancia().getCaselle()[i][j] = componente; // prendo oggetto plancia (non grafica)
//				caselle.getCaselle()[i][j] = componente;
				add(componente);
				setCaselleDisponibili(g);
				// per aggiornare interfaccia

				setVisible(true);

			}
		}
	}

	public void riformattaPlanciaNave() {
		HandleGraphics.getGraphics().rivalidaPlanciaNave();
	}

	private void setCaselleDisponibili(Giocatore g) {
		g.getPlancia().getCaselle()[2][2].setPannello(); // creo il centro

		g.getPlancia().getCaselle()[0][0].setBackground(Color.white);
		g.getPlancia().getCaselle()[0][1].setBackground(Color.white);
		g.getPlancia().getCaselle()[0][3].setBackground(Color.white);
		g.getPlancia().getCaselle()[0][4].setBackground(Color.white);
		g.getPlancia().getCaselle()[1][0].setBackground(Color.white);
		g.getPlancia().getCaselle()[1][4].setBackground(Color.white);
		g.getPlancia().getCaselle()[4][2].setBackground(Color.white);

		g.getPlancia().getCaselle()[0][0].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselle()[0][1].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselle()[0][3].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselle()[0][4].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselle()[1][0].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselle()[1][4].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselle()[4][2].setBorder(new LineBorder(Color.white));
		// setto caselle inutilizzabili
//		caselle[0][0].setBackground(Color.white);
//		caselle[0][1].setBackground(Color.white);
//		caselle[0][3].setBackground(Color.white);
//		caselle[0][4].setBackground(Color.white);
//		caselle[1][0].setBackground(Color.white);
//		caselle[1][4].setBackground(Color.white);
//		caselle[4][2].setBackground(Color.white);
//
//		caselle[0][0].setBorder(new LineBorder(Color.white));
//		caselle[0][1].setBorder(new LineBorder(Color.white));
//		caselle[0][3].setBorder(new LineBorder(Color.white));
//		caselle[0][4].setBorder(new LineBorder(Color.white));
//		caselle[1][0].setBorder(new LineBorder(Color.white));
//		caselle[1][4].setBorder(new LineBorder(Color.white));
//		caselle[4][2].setBorder(new LineBorder(Color.white));

	}

//	public Stack<ComponentiProva> getPosDisponibili() {
//		Stack<ComponentiProva> c = new Stack<ComponentiProva>();
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//
//				if(getComponenteAttuale(i, j).)
//			}
//		}
//	}

//	public ComponentiProva getComponenteAttuale(int i, int j) {
//		ComponentiProva c = caselle.getCaselle()[i][j];
//		return c;
//	}

	enum coordinateComp {
		NORD, EST, SUD, OVEST
	}

	public void insertInStack(ComponentiProva a, ComponentiProva B) {
		coordinateComp coord = coordinateComp.NORD;
		switch (coord) {
		case NORD: {

		}
		case EST: {

		}
		case SUD: {

		}
		case OVEST: {

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + coord);
		}

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
