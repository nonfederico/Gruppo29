package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Clessidra;

public class GraficaClessidra extends JPanel {

	private JTextField textField;
	private Clessidra timer = new Clessidra();
	JButton button = new JButton();

	public GraficaClessidra() {

		textField = new JTextField();
		textField.enableInputMethods(false);
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		setLayout(new GridLayout(2, 1));

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				timer.execute();
			}
		});
		add(textField);
		add(button);

	}

	/*
	 * per modificare il testo visualizzato nell'area di print della clessidra
	 */
	public void writeTextfisso(String testo) {
		textField.setEditable(false);
		textField.setText(testo);
	}
}
