package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html

public class GraficaInformazioni extends JPanel {
	Carta cartaGrafica = new Carta();
	GraficaClessidra graficaTimer = new GraficaClessidra();
//	GridBagConstraints c = new GridBagConstraints();

	public GraficaInformazioni() {
//		setLayout(new GridBagLayout());
		setLayout(new GridLayout(1, 2));
		setBorder(new EmptyBorder(10, 10, 10, 10));
//		setUpCarta();
		add(cartaGrafica);
		add(graficaTimer);
	}

//	public void setUpCarta() {
//		c.fill = GridBagConstraints.VERTICAL;
//		c.gridx = 0;
//		c.gridy = 0; // prima posizione a sx in alto
//		add(cartaGrafica);
//	}

//	public void setUpTimer() {
//		c.gridx = 1;
//		c.gridy = 0;
//	}

	public void writeTextFisso(String testo) {
		graficaTimer.writeTextfisso(testo);
	}

}
