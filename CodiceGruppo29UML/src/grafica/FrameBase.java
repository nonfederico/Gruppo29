package grafica;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class FrameBase extends JFrame {
	// classe usata per gestire le 4 aree grafiche, ogni area sarà un thread

	// viene implementata da tutti gli stati per mostrare a schermo quello che
	// succede
	private AreaInterazione areaInterazione;
	static GraficaPlanciaNave graficaPlanciaNave;
	private GraficaInformazioni graficaInformazioni;
	private AreaInterazione due;
	// solo per prova, poi cambio layout

	public FrameBase() {
		// impostazioni del frame
		super("Galaxy trucker");
		setSize(1080, 720);
		setLocationRelativeTo(null);
		setResizable(false); // finestra a dimensione fissa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setVisible(true);

		areaInterazione = new AreaInterazione();
		graficaPlanciaNave = GraficaPlanciaNave.getGraficaPlanciaNave();
		due = new AreaInterazione();
		graficaInformazioni = new GraficaInformazioni();

		// layout del frame, borderLayout è lo standart

		setLayout(new GridLayout(2, 2));

		// imposto i container

		getContentPane().add(areaInterazione);

		getContentPane().add(due);
		getContentPane().add(graficaInformazioni);
		getContentPane().add(graficaPlanciaNave);
		due.writeTextfisso("due");

		setVisible(true);
	}

	// funzioni per areainterazione
	public void DisabledAreaText(String testoScritto) {
		areaInterazione.writeTextfisso(testoScritto);
	}

	public String writeAreaText() {
		String testoScritto = areaInterazione.readText();
		return testoScritto;
	}

	public String returnStringScritta() {
		return areaInterazione.returnString();
	}

	public void disablewriteAreaText() {
		areaInterazione.disableReadText();
	}

	public static void rivalidaPlanciaNave() {
		graficaPlanciaNave.revalidate();
		graficaPlanciaNave.repaint();
	}

	public GraficaPlanciaNave getPlanciaNave() {
		return this.graficaPlanciaNave;
	}

	static void setPlanciaNave(GraficaPlanciaNave g) {
		graficaPlanciaNave = g;
	}

//funzioni per timer
	public void writeInformazioni(String timer) {
		graficaInformazioni.writeTextfisso(timer);
	}

}
