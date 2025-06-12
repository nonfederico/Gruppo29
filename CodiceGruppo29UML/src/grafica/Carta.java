package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Carta.Mazzo;
import eccezioni.ErroreNome;
import eccezioni.MazzoInvalido;

public class Carta extends JPanel {

	JTextField titolo = new JTextField();
	JTextArea descrizione = new JTextArea();
	ValoriCarta valoriCarta = new ValoriCarta();

	public Carta() {
		titolo.setText("mazzo vuoto");
		descrizione.setText("in attesa della creazione del mazzo");
		setLayout(new GridLayout(3, 1));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		add(titolo);
		add(descrizione);
		add(valoriCarta);
	}

	public void setValori() throws MazzoInvalido {
		try {
			this.titolo.setText(getTitolo());
		} catch (ErroreNome e) {
			// TODO Auto-generated catch block
			System.err.println("Errore, titolo carta non valido: " + e.getMessage());
			e.printStackTrace();
		}
		this.descrizione.setText("descrizione della carta con cui interagiamo, è la prima carta della pila");
		descrizione.setLineWrap(true);
		descrizione.setWrapStyleWord(true);
	}

	public String getTitolo() throws MazzoInvalido, ErroreNome {
		String t = Mazzo.getMazzo().getCarta().getTitolo();
		return t;
	}

}
