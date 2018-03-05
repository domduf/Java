package com.domduf.grapheProjet;

public class Sommet {
	
	// var instances
	private String nom;
	private int index;
	private int nbSuccesseurs;
	private int[] tabSuccesseurs; 
	
	// constructeur
	public Sommet(int n){
		this.index =n;
		this.nom=setNom(n);
		afficheSommet();

	}
	
	// assesseurs
	public String getNom(){
		return this.nom;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public void setTabSuccesseurs(int nbSuccessseurs, int nbSommets){
		this.nbSuccesseurs = nbSuccessseurs;
		this.tabSuccesseurs = new int[nbSommets];
		
		for (int i = 0; i < tabSuccesseurs.length; i++) {
			tabSuccesseurs[i]=0;
		}
	}
	
	
	
	public void setSuccesseur(int a, int v){
		this.tabSuccesseurs[a]=v;
	}
	
	public int[] getSuccesseurs(){
		return this.tabSuccesseurs;
	}
	
	public void afficheSuccesseurs(){
		
		for (int i = 0; i < tabSuccesseurs.length; i++) {
			Terminal.ecrireString("-"+tabSuccesseurs[i]);
		}
		Terminal.sautDeLigne();
	}
	
	public void afficheSommet(){
		Terminal.ecrireStringln(this.nom+"("+(this.index+1)+")");
	}
	
	public String setNom(int n){
		Terminal.ecrireStringln("Entrez le nom du sommet ("+(this.index+1)+")");
		return Terminal.lireString();
	}

	
}
