package grafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import plancia.ComponentiProva;
import player.Giocatore;

public class GraficaPlanciaVolo extends JPanel{
	
	// TO DO: gestire parte grafica relativa alla plancia volo (posizione 1,2)
	
	private static GraficaPlanciaVolo grafica = null;
	
	private GraficaPlanciaVolo() {
		
		setLayout(new GridLayout(5,5));
		setVisible(true);
		
	}
	
	public static GraficaPlanciaVolo GraficaPlanciaVolo() {
		
		if(grafica == null) {
			
			grafica = new GraficaPlanciaVolo();
		}
		return grafica;
	}
	
	enum StatoEnum {
		
		CASELLEVUOTE,
		CASELLEDISPONIBILI
	}
	
	
}
