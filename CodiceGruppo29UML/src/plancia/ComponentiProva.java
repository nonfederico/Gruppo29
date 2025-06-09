package plancia;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComponentiProva extends JPanel {

	private enum connettori {
		NESSUNO, SINGOLO, DOPPIO;
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

	public void setPannello() {
		// setto il layout del componente(ora uguale per tutti i comp)
		// lo chiamo solo quando seleziono casella e aggiungo componente, da mettere
		// nell'event
		nord.setHorizontalAlignment(JTextField.CENTER);
		sud.setHorizontalAlignment(JTextField.CENTER);
		est.setHorizontalAlignment(JTextField.CENTER);
		ovest.setHorizontalAlignment(JTextField.CENTER);

		this.setLayout(new GridLayout(3, 1));
		estOvest.setLayout(new GridLayout(1, 2));

		this.add(nord);
		estOvest.add(ovest);
		estOvest.add(est);
		this.add(estOvest);
		this.add(sud);

	}

//	public Stack<ComponentiProva> isCompatibile(ComponentiProva a, ComponentiProva b) {
//		// il componente attuale
//		Stack<ComponentiProva> listaComp = new Stack<ComponentiProva>();
//		connettori[] listaConfrontoa = a.getListaConnettori();
//		connettori[] listaConfrontob = b.getListaConnettori();
//
//		for (int i = 0; i < listaConnettori.length; i++) { // array che passo
//			for (int j = 0; j < a.listaConnettori.length; j++) // array componente che chiama il metodo
//			{
//				if (listaConfrontoa[i].equals(listaConfrontob)) {
//					listaComp.push(a);
//				}
//			}
//		}
//		return listaComp;
//	}

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
