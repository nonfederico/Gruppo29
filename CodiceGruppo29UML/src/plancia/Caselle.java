package plancia;

import java.util.*;

import player.Giocatore;

public class Caselle {
	
	private int numero;
	private Giocatore occupante;
	
	
	public Caselle(int numero) {
		
		this.numero = numero;
		this.occupante = null;
	}
	
	public int getNumero() {
		
		return numero;
	}
	
	public boolean isOccupata() {
		return occupante != null;
	}
	
	public Giocatore getOccupante() {
		
		return occupante;
	}
	
	public void setOccupante(Giocatore g) {
		
		this.occupante = g;
	}
	
	public void libera() {
		
		this.occupante = null;
	}
}
