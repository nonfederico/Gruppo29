package grafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import CreazionePlanciaNave.ComponentiGioco;
import player.Giocatore;

public class GraficaPlanciaNave extends JPanel {
//gestire parte grafica relativa alla plancia nave (posizione 2,2)

	private static GraficaPlanciaNave grafica = null; // creo istanza singola di GraficaPlanciaNave e uso
														// getGraficaPlanciaNave se devo modificare la planciaNa

	private GraficaPlanciaNave() {
		setLayout(new GridLayout(5, 5)); // imposto visibile un layout di 5righe e 5 colonne
		setVisible(true);
	}

	public static GraficaPlanciaNave getGraficaPlanciaNave() {
		// singleton, creo una sola istanza per gestire la grafica di PlanciaNave
		if (grafica == null) {
			grafica = new GraficaPlanciaNave();
		}
		return grafica;
	}

	public void setCaselleVuote(Giocatore g) { // package CreazionePlanciaNave
		System.out.println("INIZIO setCaselleVuote");
		for (int i = 0; i < 5; i++) {
			System.out.println("for i");
			for (int j = 0; j < 5; j++) {
				// ad ogni spazio della gridLayout associo un componente e imposto le
				// caratteristiche
				System.out.println("for j");
				ComponentiGiocoGrafica componenteGrafico = new ComponentiGiocoGrafica();
				ComponentiGioco componente = new ComponentiGioco();
				System.out.println("new componenti prova");
				componente.setCoordinate(i, j);
				System.out.println("setcordi");
				componenteGrafico.setBackground(g.getColoreS());
				componenteGrafico.setBorder(new LineBorder(Color.BLACK));
				System.out.println("imposto colore");
				// il colore lo imposto in base al colore del giocatore

				g.getPlancia().getCaselle()[i][j] = componente; // prendo oggetto plancia (non grafica)
				g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;
				System.out.println("getcaselle");

				add(componenteGrafico);
				System.out.println("add componente");

				setVisible(true);
				System.out.println("FINE setCaselleVuote");
//				setCaselleDisponibili(g);
//				sottoStato = statoEnum.CASELLEDISPONIBILI;
//				setCaselleG(g);
			}
		}
	}

	public void setCasellaSingola(Giocatore g, int i, int j) {
		// per modificare le caselle che possono essere selezionate
		ComponentiGiocoGrafica componente = g.getPlancia().getCaselleGrafica()[i][j];
		componente.setEnabled(true);
		componente.setBackground(Color.pink);

	}

	public void setCaselleNonDisponibili(Giocatore g) {
		// lo richiamo nella creazione della plancia tramithe handlegraphics

		System.out.println("1 " + g.getId());
		g.getPlancia().getCaselleGrafica()[2][2].setPannello(g.getNome(), g.getId()); // creo il centro

		System.out.println("2");
		g.getPlancia().getCaselleGrafica()[0][0].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[0][1].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[0][0].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[0][1].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[0][3].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[0][4].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[1][0].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[1][4].setBackground(Color.white);
		g.getPlancia().getCaselleGrafica()[4][2].setBackground(Color.white);

		System.out.println("3");
		g.getPlancia().getCaselleGrafica()[0][0].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselleGrafica()[0][1].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselleGrafica()[0][3].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselleGrafica()[0][4].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselleGrafica()[1][0].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselleGrafica()[1][4].setBorder(new LineBorder(Color.white));
		g.getPlancia().getCaselleGrafica()[4][2].setBorder(new LineBorder(Color.white));
	}

//	enum statoEnum {
//		CASELLEVUOTE, CASELLEDISPONIBILI
//	}
//
//	statoEnum sottoStato = statoEnum.CASELLEVUOTE;

//	public void setCaselleG(Giocatore g) {
//	// lo vado a richiamare durante la fase creazionePlanciaNave (per ogni
//	// giocatore)
//
//	switch (sottoStato) {
//	case CASELLEDISPONIBILI:
//
//		System.out.println("1");
//		g.getPlancia().getCaselle()[2][2].setPannello(g.getNome(), g.getId()); // creo il centro
//
//		System.out.println("2");
//		g.getPlancia().getCaselle()[0][0].setBackground(Color.white);
//		g.getPlancia().getCaselle()[0][1].setBackground(Color.white);
//		g.getPlancia().getCaselle()[0][3].setBackground(Color.white);
//		g.getPlancia().getCaselle()[0][4].setBackground(Color.white);
//		g.getPlancia().getCaselle()[1][0].setBackground(Color.white);
//		g.getPlancia().getCaselle()[1][4].setBackground(Color.white);
//		g.getPlancia().getCaselle()[4][2].setBackground(Color.white);
//
//		System.out.println("3");
//		g.getPlancia().getCaselle()[0][0].setBorder(new LineBorder(Color.white));
//		g.getPlancia().getCaselle()[0][1].setBorder(new LineBorder(Color.white));
//		g.getPlancia().getCaselle()[0][3].setBorder(new LineBorder(Color.white));
//		g.getPlancia().getCaselle()[0][4].setBorder(new LineBorder(Color.white));
//		g.getPlancia().getCaselle()[1][0].setBorder(new LineBorder(Color.white));
//		g.getPlancia().getCaselle()[1][4].setBorder(new LineBorder(Color.white));
//		g.getPlancia().getCaselle()[4][2].setBorder(new LineBorder(Color.white));
//
//	case CASELLEVUOTE:
//		System.out.println("INIZIO setCaselleVuote");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("for i");
//			for (int j = 0; j < 5; j++) {
//				// ad ogni spazio della gridLayout associo un componente e imposto le
//				// caratteristiche
//				System.out.println("for j");
//				ComponentiProva componente = new ComponentiProva();
//				System.out.println("new componenti prova");
//				componente.setCoordinate(i, j);
//				System.out.println("setcordi");
//				componente.setBackground(Color.LIGHT_GRAY);
//				componente.setBorder(new LineBorder(Color.BLUE));
//				System.out.println("imposto colore");
//				// il colore lo imposto in base al colore del giocatore
//
//				g.getPlancia().getCaselle()[i][j] = componente; // prendo oggetto plancia (non grafica)
//				System.out.println("getcaselle");
//
//				add(componente);
//				System.out.println("add componente");
//
//				setVisible(true);
//				System.out.println("FINE setCaselleVuote");
////				setCaselleDisponibili(g);
//				sottoStato = statoEnum.CASELLEDISPONIBILI;
//				setCaselleG(g);
//			}
//		}
//	default:
//		throw new IllegalArgumentException("Unexpected value: " + sottoStato);
//	}
//
//}
//	enum coordinateComp {
//		NORD, EST, SUD, OVEST
//	}
//
//	public void insertInStack(ComponentiProva a, ComponentiProva B) {
//		// come settare componenti adiacenti?
//		coordinateComp coord = coordinateComp.NORD;
//		switch (coord) {
//		case NORD: {
//
//		}
//		case EST: {
//
//		}
//		case SUD: {
//
//		}
//		case OVEST: {
//
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + coord);
//		}
//
//	}

}
