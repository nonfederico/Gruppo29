package Carta;

import java.util.Stack;

import javax.swing.SwingWorker;

  public class Mazzo  extends SwingWorker<Void, Void >{
	
	 private Mazzo istanza = null; 
	  
	private Mazzo () {
		
	}

	
	public Mazzo getMazzo () {
		
		if (istanza==null) {
			
			istanza = new Mazzo();
			
		} return istanza;
		
		
	}
	
	private Stack<Carte> mazzo = new Stack<Carte>() ;
  
	
	
	@Override
	protected Void doInBackground() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
