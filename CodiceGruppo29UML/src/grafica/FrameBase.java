package grafica;

import javax.swing.JFrame;

public class FrameBase extends JFrame {

	public FrameBase() {

		super("galaxy trucker");

		setSize(1080, 720);

		setLocationRelativeTo(null); // per far apparire la finestra in centro

		setResizable(false); // finestra a dimensione fissa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // alla fine per applicare modifiche prima
	}
}
