package Carta;

import java.util.ArrayList;

public class Esempio {
	//variabili
private int num;
private ArrayList<Integer> listaNum;

	 Esempio() {
		//costruttore
		this.num = 1;
	}
	
	public void setNumero(int numeroInserito) {
		//modificare la variabile numero
		this.num =numeroInserito;
	}
	
	public int getNumero() {
		return this.num;
	}
	
	public ArrayList<Integer> getLista(){
		//serve per ritornare la lista di carte (in questo caso numeri)
		if(listaNum == null) {
			listaNum = new ArrayList<Integer>();
		}
		return listaNum;
	}
	
	public Integer getElementoLista() {
		int numCarta = (int)Math.random();
		Integer elementoEstratto = listaNum.get(numCarta);
		return elementoEstratto;
	}
}
