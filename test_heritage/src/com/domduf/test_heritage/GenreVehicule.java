package com.domduf.test_heritage;

public enum GenreVehicule {
	
	aerien("ailes",800000), // environ 6MW maxi
	roulant("roues",8000), 
	bateau("coques flottante",30000),
	sousMarin("coques submersibles", 100000000),// puisance maxi 550 MW...
	inconnu("...à définir", 0);
	
	private String moyen;
	private int puissaceNominale;
	
	
	/**
	 * 
	 * @param moyen
	 * @param p
	 */
	GenreVehicule(String moyen, int p){
		this.moyen= moyen;
		this.puissaceNominale = p;
	}
	

	
	public String getMoyen(){
		return this.moyen;
	}
	
	public int getPuissanceNominale(){
		return this.puissaceNominale;		
	}
	
	public static void setPuissanceNominale( GenreVehicule g, int p) {
		g.puissaceNominale = p;
		
	}

}
