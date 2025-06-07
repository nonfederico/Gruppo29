package grafica;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class GraficaPlanciaNave extends JPanel {
//TO DO: gestire parte grafica relativa alla plancia nave (posizione 2,2)
	private JButton[][] caselle = new JButton[5][5];

	public GraficaPlanciaNave() {
		setLayout(new GridLayout(5, 5));
		setCaselleVuote();
	}

	public void setCaselleVuote() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; i < 5; i++) {
				JButton bottone = new JButton(Integer.toString(i) + " " + Integer.toString(j));

				System.out.println("bottone aggiunto");
				bottone.setBorder(new LineBorder(Color.black));
				System.out.println("bottone nero");
				caselle[i][j] = bottone;
				bottone.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
					}
				});

			}
		}
	}

	public void caselleInutilizzabili() {

	}
}
