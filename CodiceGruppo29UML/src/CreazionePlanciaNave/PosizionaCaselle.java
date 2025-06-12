package CreazionePlanciaNave;

import java.util.*;

import javax.swing.SwingWorker;

import grafica.HandleGraphics;
import player.Giocatore;

public class PosizionaCaselle extends SwingWorker<Void, Void> {
	enum statoPos {
		NORD, EST, SUD, OVEST
	}

	private Giocatore giocatore;

	public PosizionaCaselle(Giocatore p) {
		this.giocatore = p;

	}

	statoPos posLati = statoPos.NORD;

	// funzione che abilita le posizioni selezionabili
	public void posizioniSelezionabili(Giocatore g) {
		switch (posLati) {
		case NORD: { // guardo a nord di tutte le carte
			System.out.println("confronto nord");
			for (int i = 1; i < g.getPlancia().getCaselle().length; i++) { // i=1 perchè partiamo dalla seconda fila
																			// poiche
				System.out.println("for 1");
				// consideriamo lato nord
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length; j++) {
					System.out.println("for 2");
					System.out.println("ListaConnettori: "
							+ Arrays.toString(g.getPlancia().getComponente(i, j).getListaConnettori()));
					System.out.println("ListaAdiacenti: "
							+ Arrays.toString(g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()));

					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[0] == Connettori.NESSUNO) { // se
						System.out.println("confronto connettori");
						// ci
						// sono
						// connettori
						// adiacenti
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[0] == Connettori.UNIVERSALE) {// se
							System.out.println("setto casella");
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i - 1, j);

//							HandleGraphics.getGraphics().getPlanciaNave()
							// ci
							// sono
							// connettori
							// abilita casella, se schiaccia quella casella poi metterà il pezzo solo se lo
							// posiziona con la direzione giusta

							// si trova in graficaplancianave
//							g.getPlancia().getComponente(i - 1, j).setEnabled(true);
//							g.getPlancia().getCaselle()[i - 1][j].setBackground(Color.pink);

						}

					}
				}
			}
			posLati = statoPos.EST;
			posizioniSelezionabili(g);

		}
		case EST: { // guardo a nord di tutte le carte
			for (int i = 0; i < g.getPlancia().getCaselle().length; i++) {
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length - 1; j++) { // l'ultima colonna non la valuto
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[1]
							.equals(Connettori.NESSUNO)) {
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[1] == Connettori.UNIVERSALE) {// se
							System.out.println("setto casella");
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i, j + 1);

						}
					}
				}
				posLati = statoPos.SUD;
				posizioniSelezionabili(g);
			}
		}
		case SUD: { // guardo a nord di tutte le carte
			for (int i = 0; i < g.getPlancia().getCaselle().length - 1; i++) {// l'ultima riga non la valuto
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length; j++) {
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[2]
							.equals(Connettori.NESSUNO)) {
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[2] == Connettori.UNIVERSALE) {// se
							System.out.println("setto casella");
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i + 1, j);

						}

					}
				}
			}
			posLati = statoPos.OVEST;
			posizioniSelezionabili(g);
		}
		case OVEST: { // guardo a nord di tutte le carte
			for (int i = 0; i < g.getPlancia().getCaselle().length; i++) {
				for (int j = 1; j < g.getPlancia().getCaselle()[i].length; j++) {// la prima colonna non la valuto
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[3]
							.equals(Connettori.NESSUNO)) {
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[3] == Connettori.UNIVERSALE) {// se
							System.out.println("setto casella");
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i, j - 1);

						}

					}
				}
			}
			return;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + posLati);
		}

	}

	@Override
	protected Void doInBackground() throws Exception {
		Thread.sleep(500);
		HandleGraphics.getGraphics().DisabledAreaText("i quadrati rosa sono selezionabili per connettere i componenti");
		posizioniSelezionabili(giocatore);
		return null;
	}
}
