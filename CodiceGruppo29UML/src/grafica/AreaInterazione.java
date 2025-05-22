package grafica;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

//è il primo pannello in cui interagiamo con il giocatore tramite testo
public class AreaInterazione extends JPanel {
	// jpanel è un contenitore dove aggiungo componenti
	private JTextArea textAreaUtente;
	private JTextArea textArea;

	public AreaInterazione() {
		textAreaUtente = new JTextArea();
		textArea = new JTextArea();
		setLayout(new GridLayout(2, 1)); // setto il layout solo di questo panel
		add(textArea);
		add(textAreaUtente);
	}

	public void writeText(String testo) {
		textArea.setEditable(false);
		textArea.setText(testo);
	}

	public String readText() {
		String inputText = textAreaUtente.getText();
		textAreaUtente.setText("");
		return inputText;
	}
}
