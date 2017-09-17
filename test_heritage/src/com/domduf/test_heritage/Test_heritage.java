package com.domduf.test_heritage;

public class Test_heritage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicule v0 = new  Vehicule();
		
		Vehicule v1 = new  Vehicule();
		Voiture v2 = new Voiture();
		v2.setNom("Ma 307");
		Voiture v3 = new Voiture();
		v3.setNom("Ma Porshe 911 Carrera S");
		v3.setPuissanceCh(320);
		
		v3.getId();

		v3.getCarteGrise();
		v3.creveUnPneu(2);
		
		v2.getCarteGrise();
		Vehicule.changePuissance(2, 1350);
		v2.getCarteGrise();
		
		v2.montreRoue();
		//Terminal.ecrireStringln(v1.getClass().getSimpleName());
		v2.creveUnPneu(3);
		v2.montreRoue();
		v3.montreRoue();
		
		GenreVehicule.setPuissanceNominale(GenreVehicule.roulant, 10000);
		
		v3.setDimensionRoues(65, 25);
		v3.repareUnPneu(2);
		v3.montreRoue();
		v3.getCarteGrise();
	}

}
