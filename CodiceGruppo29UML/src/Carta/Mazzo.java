package Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import javax.swing.SwingWorker;

  public class Mazzo  {
	
	 private Mazzo istanza = null; 
	  
	private Mazzo () {
		
	}

	
	public Mazzo getMazzo () {
		
		if (istanza==null) {
			
			istanza = new Mazzo();
			
		} return istanza;
		
		
	}
	
	private Stack<Carte> mazzo = new Stack<Carte>() ;
  
	  public Stack<Carte> creaMazzoMescolato() {
	        ArrayList<Carte> carte = Carte.getListaCarte(); // chiamata statica
	        Collections.shuffle(carte);
	       
	        for (int i = 0 ; i <8 ; i++) {
	            mazzo.push(carte.get(i));
	        }

	        return mazzo;
	    }

	public Carte getCarta() {
		
			return mazzo.pop();

	}
	




}
