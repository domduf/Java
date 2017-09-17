package com.domduf.sapinDuVoisin2;

public class Guirlande {
	
	// var instance
	static int nb=0;
	protected int numeroGuirlande;
	protected int nbBoule;
	protected Boule[] tabBoule;
	
	// constructeurs
	 Guirlande(int combienBoule) {
		// TODO Auto-generated constructor stub
		this.nbBoule=combienBoule;
		nb+=1;
		this.numeroGuirlande=nb;
		
		Terminal.ecrireStringln("une nouvelle guirlande n°"+this.numeroGuirlande+" a été construite");
		Terminal.ecrireStringln(", elle possède "+this.nbBoule+" boules");
		
		
	}
	

}
