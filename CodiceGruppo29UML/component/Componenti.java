package component;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Componenti extends Pezzi {

    /**
     * Default constructor
     */
    public Componenti() {
    }


    /**
     * 
     */
    public int[][] posizioneConnettore;

    /**
     * 
     */
    public void ruotaComponente() {
        // TODO implement here
    }

    /**
     * 
     */
    public boolean isConnettoreEsposto() {
    	boolean isEsposto = true;
    	return isEsposto;
        // TODO implement here
    }

    /**
     * 
     */
    public void distruggiComponente() {
        // TODO implement here
    }

}

enum connettori {
	vuoti,
	singoli,
	doppi
}