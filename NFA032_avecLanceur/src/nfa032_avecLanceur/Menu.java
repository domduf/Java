package nfa032_avecLanceur;

/*
 * permet de construire différents type de menu,
 * de les afficher et de récuperer le choix
 */
public class Menu {

	//variables d'instances
	private String nomDeMenu;
	private String[] tabChoix;



	//constructeurs
	
/**
 * construit un menu avec un nom et un choix parmis n
 * @param nom
 * @param n
 */
	Menu(String nom, int n){
		//construit une chaine de n caracteres par exemple {"1","2","3"}
		//et le menu correspondant
		nomDeMenu=nom;
		String[] tableau=new String[n];
		for(int i=0;i<n;i++){
			tableau[i]="Choix---"+String.valueOf(i+1);
		}
		tabChoix=tableau;
	}

/**
 * Construit un menu avec un nom et des choix dont on entre le tableau de String
 * @param nom
 * @param choix
 */
	Menu(String nom, String[] choix){
		nomDeMenu=nom;
		tabChoix=choix;
	}


	/**
	 * retourne le nom du menu
	 */
	public void getNomMenu(){
		Terminal.ecrireStringln(this.nomDeMenu);
	}
	

	public int getNombreChoix(){
	  return this.tabChoix.length;
	}
	//setter
	public void setNomMenu(){
		Terminal.ecrireStringln("Entrez le nouveau nom pour "+this.nomDeMenu);
		this.nomDeMenu=Terminal.lireString();
	}
	
	
	//methodes d'instances
	
	/**
	 * affiche le menu
	 * @return le nb de choix
	 */
	public int afficherChoixMenu(){

		Terminal.ecrireStringln("--------------------------------------------");
		Terminal.ecrireStringln("--------------------------------------------");

		Terminal.ecrireStringln("-              "+this.nomDeMenu);
		Terminal.ecrireStringln("--------------------------------------------");
		Terminal.ecrireStringln("--------------------------------------------");

		for (int i=0;i<this.tabChoix.length;i++){
			Terminal.ecrireStringln("-"+(i+1)+"- "+tabChoix[i]);
		}
		return this.tabChoix.length;

	}


	/**
	 * Affiche une proposition de choix parmis n valeurs
	 * @param n
	 * @return le choix
	 */
	static int saisirChoix(int n){
		int choix=0;
		boolean fini=false;
		Terminal.ecrireStringln("vous avez le choix entre "+n+ " valeurs.\n" +
				"Entrez votre choix.");

		while (!fini){
			try{
				choix=Terminal.lireInt();

				if (choix<1||choix>n){
					throw new ChoixHorsLimites();
				}
				fini=true;
			}catch (TerminalException e) {
				Terminal.ecrireStringln("Erreur d'entrée-----\nIL FAUT UN ENTIER" +
						" ENTRE 1 et "+n+"\n Recommencez:");
			}catch (ChoixHorsLimites e){
				Terminal.ecrireStringln("Erreur d'entrée--\nRESTEZ DANS LES LIMITES---" +
						" [1-"+n+"]\n Recommencez:");
			}

		}

		return choix;
	}
	
	/**
	 * affiche les choix du menu
	 * saisit l'entrée
	 * et retourne le choix
	 * @return entier
	 */
	public int afficheSaisitRetourneChoix(){
		int retour=0;
		int n=this.afficherChoixMenu();
		
		try{
			
			if (n<1){
				throw new MenuImpossible();
			}
			 retour = saisirChoix(n);
			Terminal.ecrireStringln("votre choix est: "+retour);
			

		}catch (MenuImpossible e){
			Terminal.ecrireStringln("Votre menu est impossible à construire");
		}
		return retour;
		
	}



}


class MenuImpossible extends ArithmeticException{}
class ChoixHorsLimites extends ArithmeticException{}