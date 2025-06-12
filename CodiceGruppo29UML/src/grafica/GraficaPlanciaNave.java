package grafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import CreazionePlanciaNave.ComponentiGioco;
import eccezioni.CasellaNonPresenteException;
import player.Giocatore;

/*
 * usata per gestire parte grafica relativa alla plancia nave (posizione 2,2)
 */
public class GraficaPlanciaNave extends JPanel {

	/*
	 * creo istanza singola di GraficaPlanciaNave e uso getGraficaPlanciaNave se
	 * devo modificare la planciaNa
	 */
	private static GraficaPlanciaNave grafica = null;

	/*
	 * imposto visibile un layout di 5righe e 5 colonne
	 */
	private GraficaPlanciaNave() {
		setLayout(new GridLayout(5, 5));
		setVisible(true);
	}

	/*
	 * singleton, creo una sola istanza per gestire la grafica di PlanciaNave
	 */
	public static GraficaPlanciaNave getGraficaPlanciaNave() {
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

	/*
	 * guarda CreazionePlanciaNave
	 * 
	 * ad ogni spazio della gridLayout associo un componente e imposto le
	 * caratteristiche il colore lo imposto in base al colore del giocatore
	 */
	public void setCaselleVuote(Giocatore g) {
		System.out.println("INIZIO setCaselleVuote");
		for (int i = 0; i < 5; i++) {
			System.out.println("for i");
			for (int j = 0; j < 5; j++) {

				System.out.println("for j");
				ComponentiGiocoGrafica componenteGrafico = new ComponentiGiocoGrafica();
				ComponentiGioco componente = new ComponentiGioco();
				System.out.println("new componenti prova");
				componenteGrafico.setCoordinate(i, j);
				System.out.println("setcordi");
				componenteGrafico.setBackground(g.getColoreS());
				componenteGrafico.setBorder(new LineBorder(Color.BLACK));
				System.out.println("imposto colore");

				g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;
				g.getPlancia().getCaselle()[i][j] = componente;
				g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;
				System.out.println("getcaselle");

				add(componenteGrafico);
				System.out.println("add componente");

				setVisible(true);
				System.out.println("FINE setCaselleVuote");

			}
		}
		g.getPlancia().getCaselle()[2][2].setConnettori(); // setto connettore centrale in componentiGioco
	}

	/*
	 * funzione usata per settare una singola casella alla volta, utile quando
	 * dobbiamo evidenziare quali sono le caselle disponibili per posizionare i
	 * componenti
	 */
	public void setCasellaSingola(Giocatore g, int i, int j) {

		System.out.println("modifico la casella disponibile");

		if (i < 0 || i >= 5 || j < 0 || j >= 5) {
			System.err.println("sto accedendo a una casella fuori dalla griglia");
			return;
		}
		ComponentiGiocoGrafica componenteGrafico = new ComponentiGiocoGrafica();
		componenteGrafico.setCoordinate(i, j);
		componenteGrafico.setBackground(Color.pink);
		componenteGrafico.setEnabled(true);

		JPanel graficaCasella = HandleGraphics.getGraphics().getPlanciaNave();
		int index = i * 5 + j; // per 5 perchè ci sono 5 colonne quidi 5 elementi per riga

		try {
			if (index >= graficaCasella.getComponentCount()) {
				throw new CasellaNonPresenteException(index);
			}

			graficaCasella.remove(index);
			graficaCasella.add(componenteGrafico, index);

			g.getPlancia().getCaselleGrafica()[i][j] = componenteGrafico;
			graficaCasella.revalidate();
			graficaCasella.repaint();
			System.out.println("òa casella aggiornata è la: [" + i + "," + j + "]");

		} catch (CasellaNonPresenteException e) {
			System.err.println(e.getMessage());
			HandleGraphics.getGraphics().DisabledAreaText("Errore aggiornamento casella: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/*
	 * tramite handleGraphics setto le caselle della PlanciaNave che non possono
	 * essere utilizzate
	 */
	public void setCaselleNonDisponibili(Giocatore g) {

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
