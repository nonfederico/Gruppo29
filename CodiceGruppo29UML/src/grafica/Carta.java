package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Carta.Mazzo;

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

	public void setValori() {
		this.titolo.setText(getTitolo());
		this.descrizione.setText("descrizione della carta con cui interagiamo, è la prima carta della pila");
		descrizione.setLineWrap(true);
		descrizione.setWrapStyleWord(true);
	}

	public String getTitolo() {
		String t = Mazzo.getMazzo().getCarta().getTitolo();
		return t;
	}

}
