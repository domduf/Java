package nfa032_avecLanceur;

public class NFA032_avecLanceur {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // voir site http://www.gecif.net/articles/genie_electrique/filtre/#2
    //pour les calculs de filtre 1er et 2nd ordre
    
    //----------------définition des menus------------------------
    
    String choixGeneral[]= { "Nouveau filtre", "Sortir du programme" };
    Menu menuGeneral = new Menu("MENU GENERAL \n Que voulez-vous faire ?", choixGeneral);
    
    //déclaration et init variables   
    boolean fin=false; // pour pouvoir entrer dans la boucle de choix générale
    
    // boucle de calcul tant que l'utilisateur ne veut pas quitter

    while (! fin){
      
      // affiche le menu général et entre le choix
      int choixMenu=menuGeneral.afficheSaisitRetourneChoix();
      
      if (choixMenu==1){
        
        // on appelle le lanceur de filtre en créant l'objet Lanceur
        Terminal.ecrireStringln("Créé un nouveau \"lanceur\" de filtre");
        LanceurFiltre nouveauLanceur = new LanceurFiltre();
        
      }
      
      
      if (choixMenu==2) {
        fin = true;
      }
      

    }
    Terminal.ecrireStringln("Merci et à bientôt...bon filtrage");

  }

}
