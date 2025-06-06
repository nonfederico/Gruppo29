package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

//è il primo pannello in cui interagiamo con il giocatore tramite testo
public class AreaInterazione extends JPanel {
// jpanel è un contenitore dove aggiungo componenti
//	private JTextArea textAreaUtente;
//	private JTextArea textArea;
	private JTextField textField;
	private JTextField textFieldUtente;
	private String inputText = ""; // lo salvo in variabile di istanza perchè così è accessibile da tutti i metodi
									// inizializza altrimenti java.lang.NullPointerException: Cannot invoke
									// "String.equals(Object)" because "this.testoInserito" is null

	public AreaInterazione() {

		textField = new JTextField(20);
		textFieldUtente = new JTextField(20);
		setLayout(new GridLayout(2, 1)); // setto il layout solo di questo panel
		add(textField);
		add(textFieldUtente);

	}

	public void writeTextfisso(String testo) {

		textField.setEditable(false);
		textField.setText(testo);
	}

	public String readText() {
		textFieldUtente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				inputText = textFieldUtente.getText();
				disableReadText();
>>>>>>> codiceGiocoFede
			}
		});
		return inputText;

	}
=======
	public String returnString() {
		return this.inputText;
	}

>>>>>>> codiceGiocoFede
	public void disableReadText() {
		textFieldUtente.setText("");
	}
}
