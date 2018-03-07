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
	    		"Explore en profondeur", "Explore en largeur",
	    		"Affiche Composante Connexe", "Tri topologique",
	    		"Changer de Graphe", "QUITTER"};
	    Menu menuGeneral = new Menu("MENU GENERAL \n Que voulez-vous faire ?", choixGeneral);    
	    
	    
	    while (!sortir) {
	    	fin=false;
	    	
	        Terminal.ecrireStringln("----------------------------------------------");			
	        Terminal.ecrireStringln("--------    ENTREE D'UN GRAPHE     -----------");
	        Terminal.ecrireStringln("----------------------------------------------");
	    	
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
		        	// calcul du parcours en largeur du graph
		        	g.parcoursLargeur();
		          }
		        
		        if (choixMenu==4) {
		        	
					// Composante Connexe
		        	g.afficheComposanteConnexe();
				}
		        
		        if (choixMenu==5) {
					// Tri topologique
				}
		        if (choixMenu==6) {
					// QUITTER
		        	fin=true;
				}
		        
		        if (choixMenu==7) {
					// QUITTER
		        	fin=true;
		        	sortir=true;
				}
		      
	        
	        
			}
			

		}
	    	
		Terminal.ecrireStringln("Merci, programme terminé.");
		
	}

}
