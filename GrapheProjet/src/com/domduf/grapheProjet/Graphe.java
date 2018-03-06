package com.domduf.grapheProjet;

public class Graphe {
	
	// var instances
	private  Sommet[] sommetTab;
	private int nbSommet;
	private int[] tabMarquage;

	
	// constructeur
	public Graphe(int s){
		
		Terminal.ecrireStringln("Dans le constructeur d'un Graphe de "+s+
				" sommets.");
		
		this.nbSommet =s;
		
		this.sommetTab =  new Sommet[s];

		int index;
		
		for (int i = 0; i < s; i++) {
			index = i;
			this.sommetTab[i]= new Sommet(index);
		}
		
		entreSuccesseurs();
		
	}
	
	
	
	// methodes
	
	/*
	 * calcule le tableau des sommets 
	 * en parcourant ceux accessibles à partir
	 * du sommet entré.
	 */
	public void parcoursProfondeur(){
		
		Sommet sommetDepart;
		
		// declare systeme de marquage
		this.tabMarquage = new int[this.nbSommet]; 
		
		//init systeme de marquage à 0
		for (int i = 0; i < tabMarquage.length; i++) {
			tabMarquage[i]=0;
		}
		
		
		Terminal.ecrireStringln("Dans la methode de parcours en profondeur");
		
		
		// affiche les sommets
		afficheListeSommets();
		
		// choix du sommet de départ
		sommetDepart = choixSommet();
		
		// affiche le sommet choisi
		Terminal.ecrireString("Vous avez choisi le sommet ");
		sommetDepart.afficheSommet();
		
		
		//-------------début algorythme parcoursProfondeur -----------//
		//     		voir cours NFA010 p23
		
		
		// declaration successeur S non marque
		Sommet sommetS;
		
		// la pile est vide
		Pile pile= new Pile();
		
		// traiter i
		Sommet sommetATraiter = sommetDepart;
		
		// Empiler i
		pile.pushPile(sommetDepart.getIndex());
		
		
		//marquer i
		tabMarquage[sommetDepart.getIndex()]=1;
		
		
		pile.getPile();
		
		// Tant que la pile n'est pas vide

		while (!pile.pileVide()) {
			
			
			/*
			 * tant qu'il existe un successeur S au sommet en tête de pile
			 * qui soit non marqué, faire
			 */
			while ( rechercheSuccesseur(sommetATraiter, tabMarquage).getIndex() 
					!= sommetATraiter.getIndex()) {
				
				sommetS = rechercheSuccesseur(sommetATraiter, tabMarquage);
				
				//Terminal.ecrireStringln("Dans while du S, tabMarquage:");
				//afficheTableauMarquage(tabMarquage);
				Terminal.ecrireStringln("Sommet S non marqué ->"+(sommetS.getIndex()+1));
						
				// empiler S
				pile.pushPile(sommetS.getIndex());
				
				
				// marquer S
				tabMarquage[sommetS.getIndex()]=1;
				Terminal.ecrireStringln(" marquage du Sommet "+(sommetS.getIndex()+1));
				//afficheTableauMarquage(tabMarquage);
				
						
			} 
			
			// affiche la pile
			pile.getPile();
			
			// dépiler (sortir le sommet de la pile)
			sommetATraiter=sommetTab[pile.popPile()];
			
			
			
			
		}
		
		// affiche le systeme de marquage
		afficheTableauMarquage(tabMarquage);
		
	}
	
	/*
	 * 
	 */
	public void parcoursLargeur(){
		
		Sommet sommetDepart;
		
		// declare systeme de marquage
		this.tabMarquage = new int[this.nbSommet]; 
		
		//init systeme de marquage à 0
		for (int i = 0; i < tabMarquage.length; i++) {
			tabMarquage[i]=0;
		}
		
		
		Terminal.ecrireStringln("Dans la methode de parcours en largeur");
		
		
		// affiche les sommets
		afficheListeSommets();
		
		// choix du sommet de départ
		sommetDepart = choixSommet();
		
		// affiche le sommet choisi
		Terminal.ecrireString("Vous avez choisi le sommet ");
		sommetDepart.afficheSommet();
		
		
		//-------------début algorythme parcoursLargeur -----------//
		//     		voir cours NFA010 p26
		
		
		// declaration successeur S non marque
		Sommet sommetS;
		
		// la pile est vide
		File file= new File();
		
		// traiter i
		Sommet sommetATraiter = sommetDepart;
		
		// Empiler i
		file.pushFile(sommetDepart.getIndex());
		
		
		//marquer i
		tabMarquage[sommetDepart.getIndex()]=1;
		
		
		file.getFile();
		
		// Tant que la pile n'est pas vide

		while (!file.fileVide()) {
			
			// sortir de la file son premier element, soit TF
			
			sommetATraiter=sommetTab[file.popFile()];
			/*
			 * tant qu'il existe un successeur S au sommet en tête de pile
			 * qui soit non marqué, faire
			 */
			while ( rechercheSuccesseur(sommetATraiter, tabMarquage).getIndex() 
					!= sommetATraiter.getIndex()) {
				
				sommetS = rechercheSuccesseur(sommetATraiter, tabMarquage);
				
				//Terminal.ecrireStringln("Dans while du S, tabMarquage:");
				//afficheTableauMarquage(tabMarquage);
				Terminal.ecrireStringln("Sommet S non marqué ->"+(sommetS.getIndex()+1));
						
				// empiler S
				file.pushFile(sommetS.getIndex());
				
				
				// marquer S
				tabMarquage[sommetS.getIndex()]=1;
				Terminal.ecrireStringln(" marquage du Sommet "+(sommetS.getIndex()+1));
				//afficheTableauMarquage(tabMarquage);
				
						
			} 
			
			// affiche la pile
			file.getFile();
			

			
			
			
			
		}
		
		// affiche le systeme de marquage
		afficheTableauMarquage(tabMarquage);
		
	}
	
	private Sommet rechercheSuccesseur(Sommet s, int[] tableauMarquage){
		
		//Terminal.ecrireStringln("Dans rechercheSuccesseur");
		
				// boucle sur le tableau des successeurs de sommetATraiter
				for (int i = 0; i < s.getSuccesseurs().length; i++) {
					
					/*
					Terminal.ecrireStringln("i = "+i);
					Terminal.ecrireString("sommet->"+(s.getIndex()+1)+"  ");
					Terminal.ecrireStringln("s.getSuccesseurs()[i]="+s.getSuccesseurs()[i]);
					Terminal.ecrireStringln("tableauMarquage[i]="+tableauMarquage[i]);
					*/
						if (s.getSuccesseurs()[i]==1
								&& tableauMarquage[i]==0){
							
							//Terminal.ecrireStringln("successeur trouvé->"+ i);
							//Terminal.ecrireStringln("getIndex->"+s.getSuccesseurs()[i]);
							return sommetTab[i];
						}
						
				}
							
				return s;
	}
				
	

	
	
	public void afficheListeSommets(){
		// affiche les sommets
		for (int i = 0; i < nbSommet; i++) {
			Terminal.ecrireStringln("Sommet "+(i+1)+" "+sommetTab[i].getNom());
			Terminal.ecrireStringln("Successeurs: ");
			sommetTab[i].afficheSuccesseurs();
		}
	}
	
	
	
	public Sommet choixSommet(){
		int choix;
		Terminal.ecrireString("entrez le n° du Sommet choisi ->");
		choix= Terminal.lireInt();
		choix--;
		return sommetTab[choix];
	}
	
	
	
	
	public void entreSuccesseurs(){
		
		for (int i = 0; i < this.nbSommet; i++) {
			
			entreSuccesseurSommet(this.sommetTab[i]);
			
		}
		
	}
	
	
	
	
	private void entreSuccesseurSommet(Sommet s){
		int nbSuccessseurs;
		Terminal.ecrireStringln("Combien de successeurs du Sommet "+ s.getNom()+" ?");
		nbSuccessseurs=Terminal.lireInt();
		
		// regle longueur du tableau des successeurs du sommet
		s.setTabSuccesseurs(nbSuccessseurs, nbSommet);
		
		for (int i = 0; i < nbSuccessseurs; i++) {
			Terminal.ecrireStringln("Entrez le numéro du successeur "+(i+1)
					+" du Sommet "+ s.getNom());
			s.setSuccesseur((Terminal.lireInt()-1), 1);
		}
		
		s.afficheSuccesseurs();
		
		
	}
	
	
	/*
	 *  affiche le tableau de marquage des Sommets
	 */
	public void afficheTableauMarquage(int[] tab){
	Terminal.ecrireString("tableauMarquage=[");
	for (int i = 0; i < tab.length; i++) {
		Terminal.ecrireString("-"+tab[i]+"-");
	}
	Terminal.ecrireStringln("]");
	}	
	
	

}
