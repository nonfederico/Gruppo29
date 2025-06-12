package grafica;

import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import plancia.ComponentiProva;
import player.Giocatore;

public class GraficaPlanciaVolo extends JPanel{
	
	
	private static GraficaPlanciaVolo grafica = null;

	Giocatore giocatore = null;
	
	private GraficaPlanciaVolo() {
		
		setLayout(new GridLayout(6,6));
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
	
	public void setCaselleDisponibili(Giocatore g) {
		
		this.giocatore = null;
		
	}
	
	public void setCaselleVuote(Giocatore g) {
		
		
		
	}
	
}
