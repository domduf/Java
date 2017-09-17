package com.domduf.sapinDuVoisin2;

public class GuirlandeLumineuse extends Guirlande {
	
	
	
	private boolean branchee=false;
	
	GuirlandeLumineuse(int nbBoule) {
		// TODO Auto-generated constructor stub
		super(nbBoule);
		Terminal.ecrireStringln("et en plus lumineuses...ooooooOOOOOOHHHHHH !");
		
	}
	
	public boolean branche() {
		
		this.branchee=true;
		
		return this.branchee;
		
	}
	
	public boolean debranche() {
		this.branchee=false;
		return this.branchee;
		
	}
	



}
