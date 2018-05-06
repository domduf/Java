package com.domduf.grapheProjet;

/**
 * 
 * file d'attente toute simple
 * @author domduf
 */
public class File {
	private int profondeur=100;
	private int[] tabValeur= new int[profondeur];
	private int pointeurEntree=0;
	private int pointeurSortie;
	
	File(){
		//Terminal.ecrireStringln("Instanciation d'une file de calcul");
		
		for (int i = 0; i < this.profondeur; i++) {
			this.tabValeur[i]=0;
		}
		
		this.pointeurSortie=0;
	}
	
	/*
	 *  affiche le contenu de la file au pointeur de sortie
	 */
	public int getFile(){
		
		if (!fileVide()) {
			//Terminal.ecrireStringln("sommet de la file ->"+this.tabValeur[this.pointeur-1]);
			return this.tabValeur[this.pointeurSortie-1];
		}
		else 
			//Terminal.ecrireStringln("File vide");
			return 9999;

	}
	
	/**
	 * entre une valeur dans la file
	 * @param v cette valeur
	 */
	public void pushFile(int v) {
		
		Terminal.ecrireIntln(pointeurSortie);
		Terminal.ecrireIntln(pointeurEntree);
		
		
		if (!fileVide()) {
			
			for (int i = pointeurSortie; i >0; i--) {
				tabValeur[i]=tabValeur[i-1];
			}
			this.tabValeur[pointeurEntree]=v;
			this.pointeurSortie++;
		} else {
			this.tabValeur[pointeurEntree]=v;
			this.pointeurSortie++;
		}		
	}
	
	
	/**
	 * sort la première valeur de la file
	 * @return cette valeur
	 */
	public int popFile(){
		this.pointeurSortie--;
		return this.tabValeur[this.pointeurSortie];
	}
	
	

	/**
	 * test de file vide
	 * @return boolean true si vide
	 */
	public boolean fileVide(){
		return pointeurSortie==pointeurEntree;
	}
	
	
}
