package com.domduf.test_heritage;

public class Roue {
	
	private int diametre;
	private int largeur;
	private boolean etat;
	
	Roue (int d, int l){
		this.diametre=d;
		this.largeur=l;
		this.etat=true;
	}
	
	public void creve(){
		this.etat=false;
	}
	
	public void repare(){
		this.etat=true;
	}	
	
	public boolean getEtat(){
		return this.etat;
	}
	
	

}
