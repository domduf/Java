package com.domduf.grapheProjet;



public class GrapheProjet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sortir=false; // sortie definitive
	    boolean fin=false; // pour pouvoir entrer dans la boucle de choix générale
		int nbSommet;
		
	    //----------------définition des menus------------------------
		
	    String choixGeneral[]= { "Redéfinir les Successeurs des Sommets", 
	    		"Explore en profoneur", "Tri topologique", "Changer de Graphe"};
	    Menu menuGeneral = new Menu("MENU GENERAL \n Que voulez-vous faire ?", choixGeneral);    
	    
	    
	    while (!sortir) {
	    	
			Terminal.ecrireStringln("Combien de Sommet pour votre Graphe ? (15 max.)");
			nbSommet=Menu.saisirChoix(15);
				
			// déclaration d'un graphe
			Graphe g = new Graphe(nbSommet);
	    	
			while ( ! fin) {
		    	
		        // affiche le menu général et entre le choix
		        int choixMenu=menuGeneral.afficheSaisitRetourneChoix();
		        
		        if (choixMenu==1) {
		            // redefinition des successeurs
		        	g.entreSuccesseurs();
		          }
		        
		        if (choixMenu==2) {
		           
		    		// calcul du parcours en profondeur du graphe
		    		g.parcoursProfondeur();
		          }
		        
		        if (choixMenu==3) {
		        	// Tri topologique
		          }
		        
		        if (choixMenu==4) {
					// 
				}
		        
		        if (choixMenu==4) {
					// QUITTER
		        	fin=true;
				}
	        
	        
			}
	        
		}
	    	
		Terminal.ecrireStringln("Merci, programme terminé.");
		
	}

}
