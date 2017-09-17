package com.domduf.sapinDuVoisin2;

public class Sapin {

	// var instance
	private double hauteur;
	private int nbGuirlandeNormale;
	private int nbGuirlandeLumineuse;
	private boolean allume;
	
	// constructeurs
	public Sapin(Double taille) {
		// TODO Auto-generated constructor stub
		hauteur = taille;
		Terminal.ecrireStringln("beau sapin de "+hauteur+"m de haut.");
		
	}
	
}
