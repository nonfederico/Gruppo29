package CreazionePlanciaNave;

import java.util.Arrays;

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

	@Override
	protected Void doInBackground() throws Exception {
		Thread.sleep(500);
		posizioniSelezionabili(giocatore);
		return null;
	}

	/*
	 * funzione che abilita le posizioni disponibili per posizionare i componenti
	 * macchina a stati guarda un lato per ogni casella presente (NORD, EST, SUD,
	 * OVEST), e abilita le caselle adiacenti se sono vuote e se la casella attuale
	 * ha un connettore disponibile
	 * 
	 * @param g Giocatore per il quale valutiamo le posizioni disponibili nella
	 * plancia della sua nave
	 */
	public void posizioniSelezionabili(Giocatore g) {
		switch (posLati) {
		case NORD: {
			System.out.println("confronto nord");
			for (int i = 1; i < g.getPlancia().getCaselle().length; i++) {
				System.out.println("for 1");
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length; j++) {
					System.out.println("for 2");
					System.out.println("ListaConnettori: "
							+ Arrays.toString(g.getPlancia().getComponente(i, j).getListaConnettori()));
					System.out.println("ListaAdiacenti: "
							+ Arrays.toString(g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()));

					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[0] == Connettori.NESSUNO) {
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[0] == Connettori.UNIVERSALE) {
							System.out.println("setto casella");
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i - 1, j);

						}

					}
				}
			}
			posLati = statoPos.EST;
			posizioniSelezionabili(g);

		}
		case EST: {
			for (int i = 0; i < g.getPlancia().getCaselle().length; i++) {
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length - 1; j++) { // l'ultima colonna non la valuto
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[1]
							.equals(Connettori.NESSUNO)) {
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[1] == Connettori.UNIVERSALE) {
							System.out.println("setto casella");
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i, j + 1);

						}
					}
				}
				posLati = statoPos.SUD;
				posizioniSelezionabili(g);
			}
		}
		case SUD: {
			for (int i = 0; i < g.getPlancia().getCaselle().length - 1; i++) {// l'ultima riga non la valuto
				for (int j = 0; j < g.getPlancia().getCaselle()[i].length; j++) {
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[2]
							.equals(Connettori.NESSUNO)) {
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[2] == Connettori.UNIVERSALE) {
							System.out.println("setto casella");
							HandleGraphics.getGraphics().getPlanciaNave().setCasellaSingola(g, i + 1, j);

						}

					}
				}
			}
			posLati = statoPos.OVEST;
			posizioniSelezionabili(g);
		}
		case OVEST: {
			for (int i = 0; i < g.getPlancia().getCaselle().length; i++) {
				for (int j = 1; j < g.getPlancia().getCaselle()[i].length; j++) {// la prima colonna non la valuto
					if (g.getPlancia().getComponente(i, j).getListaConnettoriAdiacenti()[3]
							.equals(Connettori.NESSUNO)) {
						if (g.getPlancia().getComponente(i, j).getListaConnettori()[3] == Connettori.UNIVERSALE) {
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

}
