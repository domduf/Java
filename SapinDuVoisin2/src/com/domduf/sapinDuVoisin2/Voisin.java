package com.domduf.sapinDuVoisin2;

public class Voisin {
	
	private String nom;
	private boolean marie;
	private boolean possedeJardin= false;
	
	Voisin(String sonNom){
		this.nom= sonNom;
		
	}
	
	public boolean possedeJardin(boolean ouiOuNon) {
		
		Terminal.ecrireString("Mon voisin M. "+this.nom);
		if(ouiOuNon){
			this.possedeJardin=true;
			Terminal.ecrireStringln(" possède un jardin.");
			
		} else {
			Terminal.ecrireStringln(" ne possède pas de jardin.");
			return false;
		}
		return this.possedeJardin;
		
	}

}
