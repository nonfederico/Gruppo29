package plancia;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;

import javax.swing.JPanel;
import javax.swing.JTextField;

import CreazioneGioco.Gioco;
import player.PlanciaNave;

public class ComponentiProva extends JPanel {

	private enum connettori {
		NESSUNO, SINGOLO, DOPPIO, UNIVERSALE
	}

	private connettori[] listaConnettori = { connettori.NESSUNO, connettori.NESSUNO, connettori.NESSUNO,
			connettori.NESSUNO };
	private connettori[] listaConnettoriAdiacenti = { connettori.NESSUNO, connettori.NESSUNO, connettori.NESSUNO,
			connettori.NESSUNO }; // lista usata per vedere se ci sono connettori ai lati adiacenti al pezzo

	private int[] posizioneComponente = { 0, 0 };
	private String nome = "";
	private JTextField nord = new JTextField(listaConnettori[0].toString());
	private JTextField est = new JTextField(listaConnettori[1].toString());
	private JTextField sud = new JTextField(listaConnettori[2].toString());
	private JTextField ovest = new JTextField(listaConnettori[3].toString());

	// per settare quali caselle abilitare
	Stack<int[]> listaPosizioni = new Stack<>();

	enum statoPos {
		NORD, EST, SUD, OVEST
	}

	statoPos posLati = statoPos.NORD;

	JPanel estOvest = new JPanel();

	public ComponentiProva() {

		this.nome = "connettoreProva";
		setEnabled(false);
//		setEnabled(true); usato per prova, setto false inizialmente

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (!isEnabled()) {
					return;
				} else {
					System.out.println("Hai cliccato su un pannello!");
				}
			}
		});
	}

	public void setCoordinate(int riga, int colonna) {
		this.posizioneComponente[0] = riga;
		this.posizioneComponente[1] = colonna;
	}

	public int[] returnCoordinate() {
		return posizioneComponente;
	}

	public connettori[] getListaConnettori() {
		return this.listaConnettori;
	}

	public connettori[] getListaConnettoriAdiacenti() {
		return this.listaConnettoriAdiacenti;
	}

	public void setPannello(String s, int i) {
		// setto il layout del componente(ora uguale per tutti i comp)
		// lo chiamo solo quando seleziono casella e aggiungo componente, da mettere
		// nell'event

		this.setLayout(new GridLayout(1, 1));
		JTextField nome = new JTextField();
		nome.setText(Gioco.getlistaGiocatori().get(i).getNome());
		add(nome);

//		nord.setHorizontalAlignment(JTextField.CENTER);
//		sud.setHorizontalAlignment(JTextField.CENTER);
//		est.setHorizontalAlignment(JTextField.CENTER);
//		ovest.setHorizontalAlignment(JTextField.CENTER);
//
//		this.setLayout(new GridLayout(3, 1));
//		estOvest.setLayout(new GridLayout(1, 2));
//
//		this.add(nord);
//		estOvest.add(ovest);
//		estOvest.add(est);
//		this.add(estOvest);
//		this.add(sud);

	}

	public void posizioniSelezionabili(PlanciaNave p) {
		// pila delle posizioni che devo abilitare
		switch (posLati) {
		case NORD: { // guardo a nord di tutte le carte
			for (int i = 1; i < p.getCaselle().length; i++) { // i=1 perchè partiamo dalla seconda fila poiche
																// consideriamo lato nord
				for (int j = 0; j < p.getCaselle()[i].length; j++) {
					if (p.getComponente(i, j).getListaConnettoriAdiacenti()[0].equals(connettori.NESSUNO)) { // se non
																												// ci
																												// sono
																												// connettori
																												// adiacenti
						if (p.getComponente(i, j).getListaConnettori()[0].equals(connettori.SINGOLO)) {// se il
																										// connettore è
																										// singolo
							// abilita pos componente i-1, j
						} else if (p.getComponente(i, j).getListaConnettori()[0].equals(connettori.DOPPIO)) {// se il
							// connettore è
							// doppio
							// abilita pos componente i-1, j
						} else {
							// non fare nulla
						}

					}
				}
			}

		}
		case EST: { // guardo a nord di tutte le carte
			for (int i = 0; i < p.getCaselle().length; i++) {
				for (int j = 0; j < p.getCaselle()[i].length - 1; j++) { // l'ultima colonna non la valuto
					if (p.getComponente(i, j).getListaConnettoriAdiacenti()[1].equals(connettori.NESSUNO)) {
						if (p.getComponente(i, j).getListaConnettori()[1].equals(connettori.SINGOLO)) {
							// abilita pos componente i, j+1
						} else if (p.getComponente(i, j).getListaConnettori()[1].equals(connettori.DOPPIO)) {
							// abilita pos componente i, j-1
						} else {
							// non fare nulla
						}

					}
				}
			}

		}
		case SUD: { // guardo a nord di tutte le carte
			for (int i = 0; i < p.getCaselle().length - 1; i++) {// l'ultima riga non la valuto
				for (int j = 0; j < p.getCaselle()[i].length; j++) {
					if (p.getComponente(i, j).getListaConnettoriAdiacenti()[2].equals(connettori.NESSUNO)) {
						if (p.getComponente(i, j).getListaConnettori()[2].equals(connettori.SINGOLO)) {
							// abilita pos componente i, j+1
						} else if (p.getComponente(i, j).getListaConnettori()[2].equals(connettori.DOPPIO)) {
							// abilita pos componente i, j-1
						} else {
							// non fare nulla
						}

					}
				}
			}

		}
		case OVEST: { // guardo a nord di tutte le carte
			for (int i = 0; i < p.getCaselle().length; i++) {
				for (int j = 1; j < p.getCaselle()[i].length; j++) {// la prima colonna non la valuto
					if (p.getComponente(i, j).getListaConnettoriAdiacenti()[2].equals(connettori.NESSUNO)) {
						if (p.getComponente(i, j).getListaConnettori()[2].equals(connettori.SINGOLO)) {
							// abilita pos componente i, j+1
						} else if (p.getComponente(i, j).getListaConnettori()[2].equals(connettori.DOPPIO)) {
							// abilita pos componente i, j-1
						} else {
							// non fare nulla
						}

					}
				}
			}

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + posLati);
		}
//modifico stack listaPosizioni
	}

	public connettori[] getAdiacenti() {
		return this.listaConnettoriAdiacenti;
	}
}

//METODO PER SCELTA POSTO
//
//funzione 1) scansiono tutto l'array caselle (composto da componenti), per ogni componente che incontro guardo dove hanno connettori e salvo in una pila la posizione della casella libera adiacente.
//funzione 2) estraggo dalla pila ogni posizione salvata e la abilito per la scelta
//funzione 3) con l'event associato allo spazio cliccato vado a disabilitare tutte le posizioni e a richiamare la funzione dello scan dell'array di caselle
//++questo finchè non fisiscono soldi o finiscono pezzi o finisce il tempo

//******************per vedere connettori***************
//seleziono pezzo attuale, faccio confronto:
//	se this.nord=lista[i-1][j] (riga-1, stessa colonna) allora possono essere collegati
//	se this.est=lista[i][j+1] (stessa rga, colonna+1) allora possono essere collegati
//	se this.sud=lista[i+1][j] (riga+1, stessa colonna) allora possono essere collegati
//	se this.ovest=lista[i][j-1] (stessa riga, colonna-1) allora possono essere collegati
//	
//	
