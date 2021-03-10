package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
		
    //LinkedList<String>parole;
	//Proviamo con un ArrayList
	ArrayList<String>parole;
	public Parole() {
		
		parole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	public void reset() {
		parole = new ArrayList<String>();
	}
	
	public void cancellaParola(String p) {
		int i =parole.indexOf(p);
		parole.remove(i);
		
	}

}
