package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Clessidra;

public class GraficaInformazioni extends JPanel {
//TO DO si occuperà di gestire la parte grafica relativa a carte e informazioni (posizione 2,1)
	private JTextField textField;
	private Clessidra timer = new Clessidra();
	JButton button = new JButton();

	public GraficaInformazioni() {

		// new Thread(timer).start();
		textField = new JTextField();
		setLayout(new GridLayout(1, 2));

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				timer.execute();
				// timer.run();
			}
		});
		add(textField);
		add(button);

	}

	public void writeTextfisso(String testo) {
		textField.setEditable(false);
		textField.setText(testo);
	}
}
