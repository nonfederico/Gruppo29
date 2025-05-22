package grafica;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FrameBase extends JFrame {

//	// se li dichiaro qui vengono creati nel momento in cui viene creata la classe
//
//	private AreaInterazione areaTesto;
//
//	// gli elementi vengono aggiunti al contentpane contenuto nel jframe
//	public FrameBase() {
//
//		super("galaxy trucker");
//
//		// frame base
//		setSize(1080, 720);
//
//		setLocationRelativeTo(null); // per far apparire la finestra in centro
//
//		setResizable(false); // finestra a dimensione fissa
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true); // alla fine per applicare modifiche prima
//
//		// griglia
//
//		GridLayout grigliaBase = new GridLayout(2, 2); // funziona se hai componenti
//		// simili
//		// BorderLayout grigliaBase = new BorderLayout();
//		setLayout(grigliaBase);
//
//		// aggiungo elementi alla griglia
//
//		areaTesto = new AreaInterazione();
//		
//		add(areaTesto, grigliaBase); // posizione 1,1 contiene testo dove interagire
//		add(new JButton("clicca"), grigliaBase); // posizione 1,2 contiene plancia di volo (con tutti i personaggi)
//		add(new JButton("clicca"), grigliaBase); // posizione 2,1 contiene informazioni
//		add(new JButton("clicca"), grigliaBase); // posizione 2,2 contiene plancia nave di ogni giocatore
//
//		// add(areaTesto, grigliaBase.CENTER);
// }

	// viene implementata da tutti gli stati per mostrare a schermo quello che
	// succede
	private AreaInterazione areaInterazione;
	private AreaInterazione sopra;

	public FrameBase() {
		// impostazioni del frame
		super("Galaxy trucker");
		setSize(1080, 720);
		setLocationRelativeTo(null);
		setResizable(false); // finestra a dimensione fissa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		areaInterazione = new AreaInterazione();

		// layout del frame, borderLayout è lo standart

		setLayout(new BorderLayout());

		// imposto i container

		add(areaInterazione, BorderLayout.CENTER);

	}

	public void returnAreaText(String testoScritto) {
		areaInterazione.writeText(testoScritto);
	}

}
