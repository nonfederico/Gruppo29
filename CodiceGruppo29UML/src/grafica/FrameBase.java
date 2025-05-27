package grafica;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameBase extends JFrame {
	// classe usata per gestire le 4 aree grafiche, ogni area sarà un thread

	// viene implementata da tutti gli stati per mostrare a schermo quello che
	// succede
	private AreaInterazione areaInterazione;
	private AreaInterazione due;
	private AreaInterazione tre;
	private AreaInterazione quattro;
	// solo per prova, poi cambio layout

	public FrameBase() {
		// impostazioni del frame
		super("Galaxy trucker");
		setSize(1080, 720);
		setLocationRelativeTo(null);
		setResizable(false); // finestra a dimensione fissa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		areaInterazione = new AreaInterazione();
		due = new AreaInterazione();
		tre = new AreaInterazione();
		quattro = new AreaInterazione();

		// layout del frame, borderLayout è lo standart

		setLayout(new GridLayout(2, 2));

		// imposto i container
		add(areaInterazione);
		add(due);
		add(tre);
		add(quattro);

		due.writeTextfisso("due");
		tre.writeTextfisso("tre");
		quattro.writeTextfisso("quattro");

	}

	public void DisabledAreaText(String testoScritto) {
		areaInterazione.writeTextfisso(testoScritto);
	}

	public String writeAreaText() {
		String testoScritto = areaInterazione.readText();
		return testoScritto;
	}

	public void disablewriteAreaText() {
		areaInterazione.disableReadText();
	}
}
