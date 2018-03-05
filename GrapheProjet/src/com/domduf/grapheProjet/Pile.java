package com.domduf.grapheProjet;

public class Pile {
	
	private int profondeur=100;
	private int[] tabValeur= new int[profondeur];
	private int pointeur=0;
	
	Pile(){
		//Terminal.ecrireStringln("Instanciation d'une pile de calcul");
		
		for (int i = 0; i < this.profondeur; i++) {
			tabValeur[i]=0;
		}
	}
	
	// affiche le contenu de la pile
	public int getPile(){
		
		if (!pileVide()) {
			//Terminal.ecrireStringln("sommet de la pile ->"+this.tabValeur[this.pointeur-1]);
			return this.tabValeur[this.pointeur-1];
		}
		else 
			//Terminal.ecrireStringln("Pile vide");
			return 9999;

	}
	
	// test pile vide
	public boolean pileVide(){
		return this.pointeur==0;
	}
	
	// Push
	public void pushPile(int v){
		//Terminal.ecrireStringln("Push--->"+v);
		tabValeur[pointeur]=v;
		this.pointeur++;
		
	}
	
	// Pop
	public int popPile(){
		
		if (!pileVide()) {
			this.pointeur-- ;
			//Terminal.ecrireStringln(tabValeur[pointeur]+"<---Pop");
			return tabValeur[pointeur];
		}
		else return 0;
		
		
	}
	
	

}
