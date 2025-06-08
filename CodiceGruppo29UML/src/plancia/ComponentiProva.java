package plancia;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class ComponentiProva extends JPanel {

	private enum connettori {
		NESSUNO, SINGOLO, DOPPIO;
	}

	private connettori nord;
	private connettori est;
	private connettori sud;
	private connettori ovest;

	private String nome = "";

	public ComponentiProva() {
		this.nome = "connettoreProva";
		setEnabled(true);
		this.nord = connettori.NESSUNO;
		this.est = connettori.SINGOLO;
		this.sud = connettori.NESSUNO;
		this.ovest = connettori.DOPPIO;

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (!isEnabled()) {
					return;
				} else {
					System.out.println("Hai cliccato su un pannello!");
				}
			}
		});
	}
}
