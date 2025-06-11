package CreazionePlanciaNave;

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
			for (int i = 1; i < g.getPlancia().getCaselle().length; i++) { // i=1 perchè partiamo dalla seconda fila
																			// poiche
				// consideriamo lato nord
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length; j++) {
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[0]
							.equals(Connettori.NESSUNO)) { // se
						// ci
						// sono
						// connettori
						// adiacenti
						if (!g.getPlancia().getComponente(i, j).getListaConnettori()[0].equals(Connettori.NESSUNO)) {// se
																														// ci
							// sono
							// connettori
							// abilita casella, se schiaccia quella casella poi metterà il pezzo solo se lo
							// posiziona con la direzione giusta
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i, j);
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
						if (!g.getPlancia().getComponente(i, j).getListaConnettori()[1].equals(Connettori.NESSUNO)) {

						}

					}
				}
			}
			posLati = statoPos.SUD;
			posizioniSelezionabili(g);
		}
		case SUD: { // guardo a nord di tutte le carte
			for (int i = 0; i < g.getPlancia().getCaselle().length - 1; i++) {// l'ultima riga non la valuto
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length; j++) {
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[2]
							.equals(Connettori.NESSUNO)) {
						if (!g.getPlancia().getComponente(i, j).getListaConnettori()[2].equals(Connettori.NESSUNO)) {

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
						if (!g.getPlancia().getComponente(i, j).getListaConnettori()[3].equals(Connettori.NESSUNO)) {

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
		posizioniSelezionabili(giocatore);
		return null;
	}
}
