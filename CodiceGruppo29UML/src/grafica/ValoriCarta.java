package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ValoriCarta extends JPanel {
	JTextField potenza = new JTextField();
	JTextField valore = new JTextField();
	JTextField turni = new JTextField();

	public ValoriCarta() {
		setValori();
		setLayout(new GridLayout(1, 3));
		add(potenza);
		add(valore);
		add(turni);
	}

	public void setValori() {
		// tramite il get in carte andremo ad impostare i valori
		this.potenza.setText("potenza");
		this.valore.setText("valore");
		this.turni.setText("turni persi");
	}

}
