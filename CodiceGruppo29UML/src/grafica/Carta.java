package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Carta extends JPanel {
	// prenderemo i veri valori dalle sottoclassi di carte tramite
	// getValoreCheVoglio
	JTextField titolo = new JTextField();
	JTextArea descrizione = new JTextArea();
	ValoriCarta valoriCarta = new ValoriCarta();

	public Carta() {
		setValori();
		setLayout(new GridLayout(3, 1));
		add(titolo);
		add(descrizione);
		add(valoriCarta);
	}

	public void setValori() {
		this.titolo.setText("titolo carta");
		this.descrizione.setText("descrizione della carta con cui interagiamo, è la prima carta della pila");
		descrizione.setLineWrap(true);
		descrizione.setWrapStyleWord(true);
	}

}
