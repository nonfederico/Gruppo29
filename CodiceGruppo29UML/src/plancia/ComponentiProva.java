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
		setEnabled(false);
//		setEnabled(true); usato per prova, setto false inizialmente
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

//funzione per abilitare:
//prima attivo solo la posizione centrale dove metto il cuore
//poi funzione per far mettere componente , devo abilitare solo le posizioni dove posso mettere il componente
//appena clicco disabilito tutto, faccio scegliere il nuovo componente e abilito ancora le nuove posizioni.
//lo faccio finchè non finisce i soldi o finchè non scade il timer 