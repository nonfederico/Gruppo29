package main;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Dadi {

    /**
     * Default constructor
     */
    public Dadi() {
    	
    }

    /**
     * 
     */
    private int numeroDadi = 2;

    public int getNumeroDadi(){
    	return this.numeroDadi;
    }

    /**
     * 
     */
    public int roll() {
    	int[] valore = {0,0};
    	int valoreTiro1 = (int)Math.random()*6;
    	int valoreTiro2 = (int)Math.random()*6;
    	valore[1] = valoreTiro1;
    	valore[2] = valoreTiro2;
    	int somma = valoreTiro1+valoreTiro2;
    	return somma;
        // TODO implement here
    }

}