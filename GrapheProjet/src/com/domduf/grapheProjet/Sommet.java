package com.domduf.grapheProjet;

public class Sommet {
	
	// var instances
	private String nom;
	private int index;
	private int nbSuccesseurs;
	private int[] tabSuccesseurs; 
	private int[] tabAscendants ;
	private int numComposante;
	
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
		this.tabAscendants = new int[nbSommets];
		
		for (int i = 0; i < tabSuccesseurs.length; i++) {
			// raz successeurs
			tabSuccesseurs[i]=0;
			//raz ascendants
			tabAscendants[i]=0;
		}
	}
	
	
	public void setNumComposante(int num){
		this.numComposante=num;
	}
	
	public int getNumComposanteConnexe(){
		return this.numComposante;
	}
	
	public void setSuccesseur(int a, int v){
		this.tabSuccesseurs[a]=v;
	}
	
	public void setPredecesseur(int a, int v){
		this.tabAscendants[a]=v;
	}	
	
	
	public int[] getSuccesseurs(){
		return this.tabSuccesseurs;
	}
	
	public int[] getPredecesseurs(){
		return this.tabAscendants;
	}
	
	public void afficheSuccesseurs(){
		
		for (int i = 0; i < tabSuccesseurs.length; i++) {
			Terminal.ecrireString("-"+tabSuccesseurs[i]);
		}
		Terminal.sautDeLigne();
	}
	
	
	// TODO
	public void affichePredecesseurs(){
		
		for (int i = 0; i < tabAscendants.length; i++) {
			Terminal.ecrireString("-"+tabAscendants[i]);
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
