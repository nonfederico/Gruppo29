package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html

public class GraficaInformazioni extends JPanel {
	Carta cartaGrafica = new Carta();
	GraficaClessidra graficaTimer = new GraficaClessidra();

	public GraficaInformazioni() {

		setLayout(new GridLayout(1, 2));
		setBorder(new EmptyBorder(10, 10, 10, 10));

		add(cartaGrafica);
		add(graficaTimer);
	}

	/*
	 * settare il titolo della carta (per la grafica)
	 */
	public void setTitolo() {
		cartaGrafica.setValori();
	}

	public void writeTextFisso(String testo) {
		graficaTimer.writeTextfisso(testo);
	}

}
