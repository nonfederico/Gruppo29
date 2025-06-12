package Carta;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public abstract class Carte {


	public static ArrayList<Carte> getListaCarte() {
		
		ArrayList<Carte>  carte = new ArrayList();
		
		carte.add(new Contrabbandieri());
		carte.add(new Contrabbandieri());
		carte.add(new Contrabbandieri());
		carte.add(new Contrabbandieri());
		
		carte.add(new NaveAbbandonata());
		carte.add(new ZonaDiGuerra());
		carte.add(new ZonaDiGuerra());
		carte.add(new ZonaDiGuerra());
		carte.add(new ZonaDiGuerra());
		
		return carte;
		
	}
	
	
	
    public Carte() {
    }

    
    public void ifromLeader() {
        // TODO implement here
    }
}
