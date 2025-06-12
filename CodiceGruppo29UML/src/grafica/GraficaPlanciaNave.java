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

	public void getPosizioneDaModificare(Giocatore g, int i, int j) {
		ComponentiGioco componenteGrafico = new ComponentiGioco();
		g.getPlancia().getComponenteGrafica(i, j).setBackground(Color.pink);
		g.getPlancia().getComponenteGrafica(i, j).setEnabled(true);

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
				componenteGrafico.setCoordinate(i, j);
				System.out.println("setcordi");
				componenteGrafico.setBackground(g.getColoreS());
				componenteGrafico.setBorder(new LineBorder(Color.BLACK));
				System.out.println("imposto colore");

				// il colore lo imposto in base al colore del giocatore

				g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico; // prendo oggetto plancia (non grafica)
//				if (!g.getPlancia().getCaselleGrafica()[2][2].equals(null)) {
//					g.getPlancia().getCaselle()[2][2].setConnettori(); // creo il centro
//				}
				g.getPlancia().getCaselle()[i][j] = componente;
				g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;
				System.out.println("getcaselle");

				add(componenteGrafico);
				System.out.println("add componente");

				setVisible(true);
				System.out.println("FINE setCaselleVuote");

			}
		}
		g.getPlancia().getCaselle()[2][2].setConnettori(); // setto connettore centrale
	}

	public void setCasellaSingola(Giocatore g, int i, int j) {
		System.out.println("set casella singola");
		// per modificare le caselle che possono essere selezionate
		ComponentiGiocoGrafica componenteGrafico = new ComponentiGiocoGrafica();
		componenteGrafico.setCoordinate(i, j);
		componenteGrafico.setBackground(Color.pink);
		componenteGrafico.setEnabled(true);

		JPanel graficaCasella = HandleGraphics.getGraphics().getPlanciaNave();
		int index = i * 5 + j; // per 5 perchè ci sono 5 colonne quidi 5 elemtni per riga
		graficaCasella.remove(index); // non posso rimuovere con l'indice della matrice , non va
		graficaCasella.add(componenteGrafico, index);
		g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;
		graficaCasella.revalidate();
		graficaCasella.repaint();
		System.out.println("Casella aggiornata graficamente: [" + i + "," + j + "]");

//		try {
//			System.out.println("removeall casella " + i + " " + j);
//			HandleGraphics.getGraphics().getPlanciaNave().remove(g.getPlancia().getCaselleGrafica()[i - 1][j]);
//			
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		componenteGrafico.setBackground(Color.pink);
//		componenteGrafico.setEnabled(true);
//		g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;

//		g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;
//		ComponentiGiocoGrafica componente = g.getPlancia().getCaselleGrafica()[i][j];

//		ComponentiGioco componenteGioco = g.getPlancia().getCaselle()[i][j];

//		componenteGioco.setConnettori();

//		try {
//			g.getPlancia().getCaselleGrafica()[i][j].setEnabled(true);
//			g.getPlancia().getCaselleGrafica()[i][j].setBackground(Color.pink);
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println("plancia nave revalidate");
//			HandleGraphics.getGraphics().getPlanciaNave().revalidate();
//
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//
//			System.out.println(" plancia nave repaint");
//			HandleGraphics.getGraphics().getPlanciaNave().repaint();
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		componente.setEnabled(true);
//		componente.setBackground(Color.pink);

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

}
