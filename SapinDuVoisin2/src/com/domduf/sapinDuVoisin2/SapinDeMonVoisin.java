package com.domduf.sapinDuVoisin2;

public class SapinDeMonVoisin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voisin monVoisin= new Voisin ("Dupont");
		
		monVoisin.possedeJardin(true);
		
		Sapin sonSapin= new Sapin( 3.5);
		
		Guirlande guir1 =new Guirlande(4);
		
		GuirlandeLumineuse guirLum1= new GuirlandeLumineuse(5);

	}

}
