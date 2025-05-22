package grafica;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AreaInterazione extends JPanel {
	// jpanel è un contenitore dove aggiungo componenti
	private JTextArea textArea;
	private JTextField textField;

	public AreaInterazione() {
		textArea = new JTextArea();
		setLayout(new BorderLayout()); // setto il layout solo di questo panel
		add(textArea, BorderLayout.CENTER);
	}

	public void writeText(String testo) {
		textArea.setEditable(false);
		textArea.setText(testo);
	}

	public String readText() {
		String inputText = textArea.getText();
		textArea.setText("");
		return inputText;
	}
}
