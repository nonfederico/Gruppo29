package grafica;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;

import CreazioneGioco.Gioco;

public class ComponentiGiocoGrafica extends JPanel {

	/*
	 * classe per la parte grafica dei componenti
	 */
	private enum connettori {
		NESSUNO, SINGOLO, DOPPIO, UNIVERSALE;
	}

	private int[] posizioneComponente = { 0, 0 };
	private String nome = "";
//	private JTextField nord = new JTextField(listaConnettori[0].toString()); ...

	JPanel estOvest = new JPanel();

	public ComponentiGiocoGrafica() {

//		listaConnettori[0] = Connettori.UNIVERSALE;...
		this.nome = "connettoreProva";
		setEnabled(false);

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

	/*
	 * setto il layout del componente(ora uguale per tutti i componenti lo chiamo
	 * solo quando seleziono casella e aggiungo componente, da mettere nell'event
	 */
	public void setPannello(String s, int i) {

		this.setLayout(new GridLayout(1, 1));
		JTextField nome = new JTextField();
		nome.setText(Gioco.getlistaGiocatori().get(i).getNome());
		add(nome);
	}
}
