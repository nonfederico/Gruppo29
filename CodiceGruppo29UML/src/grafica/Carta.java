package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Carta extends JPanel {
	GridLayout layoutCarta = new GridLayout(3, 1);
	JTextField titolo = new JTextField();

	public Carta() {
		// dare layout
		// https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
//		setLayout(layoutCarta);
//		add(titolo);
//		titolo.setText("skdkdkddkk");

	}

//	public String titolo() {
//		String titolo;
//		titolo = Contrabbandieri.getTitolo();
//		return titolo;
//	}
}
