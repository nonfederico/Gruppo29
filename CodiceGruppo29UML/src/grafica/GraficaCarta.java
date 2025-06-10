package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraficaCarta extends JPanel {
	
	// dare layout 
	
	GridLayout layoutCarta = new GridLayout(3,1);
	
	JTextField titolo = new JTextField();
	
	
	public GraficaCarta() {
		setLayout(layoutCarta);
		
		add(titolo);
		titolo.setText("quello che voglio");
		
		
	}

}
