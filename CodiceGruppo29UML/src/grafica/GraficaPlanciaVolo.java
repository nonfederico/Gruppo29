package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class GraficaPlanciaVolo extends JPanel {

	// TO DO: gestire parte grafica relativa alla plancia volo (posizione 1,2)

	private static GraficaPlanciaVolo grafica = null;

	private GraficaPlanciaVolo() {

		setLayout(new GridLayout(6, 6));
		setVisible(true);

	}

	public static GraficaPlanciaVolo GraficaPlanciaVolo() {

		if (grafica == null) {
			grafica = new GraficaPlanciaVolo();
		}
		return grafica;
	}

	enum StatoEnum {
		CASELLEVUOTE, CASELLEDISPONIBILI
	}

}
