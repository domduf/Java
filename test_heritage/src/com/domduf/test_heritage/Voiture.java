package com.domduf.test_heritage;

public class Voiture extends Vehicule{
	
	static int nbRoue=4;
	protected Roue[] tabRoue; 
	protected int diamRoue=50;
	protected int largRoue=15;
	

	
	Voiture(){
		super();
		this.genre=GenreVehicule.roulant;
		this.puissance=this.genre.getPuissanceNominale();
		this.tabRoue=new Roue[nbRoue];
		monteRoue(nbRoue, diamRoue, largRoue);
	}
	
	
	
	private void monteRoue(int nb, int d, int l){
		
		for (int i=0; i<nbRoue; i++){
			this.tabRoue[i]=new Roue(d,l);
		}
	}
	
	public void setDimensionRoues(int diam, int larg){
		this.diamRoue=diam;
		this.largRoue=larg;
	}
	
	public int montreRoue(){
		Terminal.ecrireStringln(this.nom+" possède "+this.nbRoue+" roues de "
				+this.diamRoue+" de diamètre et "+this.largRoue+
				" de large.");
		for (int i=0; i<this.nbRoue; i++){
			Terminal.ecrireString("Roue "+(i+1)+" ");
			if (this.tabRoue[i].getEtat()){
				Terminal.ecrireStringln("OK");
			} else 
				Terminal.ecrireStringln("Crevée...");
		}
		return nbRoue;
	}
	
	/**
	 * 
	 * @param idPneu 1->avG 2->avD 3->arG 4->arD
	 */
	public void creveUnPneu(int idPneu){
		// 1 avG 2 avD 3 arG 4 arD
		Terminal.ecrireStringln(this.nom+" crève sa roue n° "+(idPneu));
		tabRoue[idPneu-1].creve();
		
	}
	
	public void repareUnPneu(int idPneu){
		// 1 avG 2 avD 3 arG 4 arD
		Terminal.ecrireStringln(this.nom+" répare sa roue n° "+(idPneu));
		tabRoue[idPneu-1].repare();
		
	}	
	
	


}
