package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AreaInterazione extends JPanel {

	/*
	 * è il primo pannello in cui interagiamo con il giocatore tramite testo jpanel
	 * è un contenitore dove aggiungo componenti
	 */
	private JTextField textField;
	private JTextField textFieldUtente;
	private String inputText = "";

	// lo salvo in variabile di istanza perchè così è accessibile da tutti i metodi,
	// inizializza altrimenti java.lang.NullPointerException: Cannot invoke
	// "String.equals(Object)" because "this.testoInserito" is null

	/*
	 * setLayout usato per impostare il layout del contenitore
	 */
	public AreaInterazione() {

		textField = new JTextField(20);
		textFieldUtente = new JTextField(20);
		setLayout(new GridLayout(2, 1));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		add(textField);
		add(textFieldUtente);

	}

	/*
	 * funzione usata per printare a schermo nella prima riga dell'area
	 * "areaInterazione"
	 */
	public void writeTextfisso(String testo) {

		textField.setEditable(false);
		textField.setText(testo);
	}

	/*
	 * funzione usata per leggere il testo inserito dall'utente
	 */
	public String readText() {
		textFieldUtente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				inputText = textFieldUtente.getText();
				disableReadText();
			}
		});
		return inputText;

	}

	public String returnString() {
		return this.inputText;
	}

	/*
	 * funzione usata per pulire l'area di input dell'utente dopo un inserimento di
	 * testo
	 */
	public void disableReadText() {
		textFieldUtente.setText("");
	}
}
