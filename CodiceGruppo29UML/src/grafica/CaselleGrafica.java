package grafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CaselleGrafica extends JPanel {

	CaselleGrafica() {
		setLayout(new GridLayout(1, 1));
		add(new JTextField());
		setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.black));
		setVisible(true);
	}
}
