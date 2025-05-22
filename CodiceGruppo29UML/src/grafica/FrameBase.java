package grafica;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FrameBase extends JFrame {
	// se li dichiaro qui vengono creati nel momento in cui viene creata la classe

	private JTextArea areaTesto; // o jTextField se voglio solo una riga
	private JButton bottone;

	// gli elementi vengono aggiunti al contentpane contenuto nel jframe
	public FrameBase() {

		super("galaxy trucker");

		// frame base
		setSize(1080, 720);

		setLocationRelativeTo(null); // per far apparire la finestra in centro

		setResizable(false); // finestra a dimensione fissa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // alla fine per applicare modifiche prima

		// griglia

		GridLayout grigliaBase = new GridLayout(2, 2);
		setLayout(grigliaBase);

		// aggiungo elementi alla griglia
		areaTesto = new JTextArea();
		bottone = new JButton("clicca");
		// add(areaTesto, grigliaBase.);
		add(new JButton("clicca"), grigliaBase); // posizione 1,1 contiene testo dove interagire
		add(new JButton("clicca"), grigliaBase); // posizione 1,2 contiene plancia di volo (con tutti i personaggi)
		add(new JButton("clicca"), grigliaBase); // posizione 2,1 contiene informazioni
		add(new JButton("clicca"), grigliaBase); // posizione 2,2 contiene plancia nave di ogni giocatore

	}

}
