package nfa032_avecLanceur;

public class LanceurFiltre {


  /**
   * variables d'instances
   */
  private String[] choixMenuLanceur = { 
      "Ordre 1 (2 composants)",
      "Ordre 2 (3 composants)",
      "Ordre 0 (1 composant unique)",
  "RETOUR au menu Géneral"};
  // le menu Lanceur peut évoluer
  private Menu menuLanceur = new Menu("MENU \"Nouveau FILTRE \"",choixMenuLanceur );
  private Filtre filtre;
  //private int ordreFiltre;

  /**
   * constructeur par défaut du lanceur
   */
  public LanceurFiltre() {
    Terminal.ecrireStringln("Dans le lanceur de nouveau filtre");
    lancerLaBoucle();
  }


  /**
   * boucle de choix de filtre
   */
  private void lancerLaBoucle(){

    int tailleMenu = choixMenuLanceur.length; // utile pour l'option sortie (dernière position)
    int choix = menuLanceur.afficheSaisitRetourneChoix();

    if (choix!=tailleMenu) { // si on ne demande pas de sortir


      if (choix==1) {

        filtre = new Filtre1();
      }

      if (choix==2) {

        filtre = new Filtre2();
      }

      if (choix==3) {
        choix=0; // filtre d'ordre 0
        filtre = new Filtre();
      }
      //this.ordreFiltre=choix; //initialise l'ordre du filtre à construire

      Terminal.ecrireStringln("vous avez choisi un filtre d\'ordre "+filtre.getOrdre());

      Terminal.ecrireStringln("instanciation d'un objet Filtre d\'ordre "+choix);

      // va chercher et saisit ce que veut faire l'utilisateur avec ce filtre
      int voeux= filtre.ceQueJePropose.afficheSaisitRetourneChoix();

      // on boucle sur les possibilités instanciées du filtre
      while (voeux != filtre.ceQueJePropose.getNombreChoix()){
        filtre.faitDonc(voeux);
        voeux= filtre.ceQueJePropose.afficheSaisitRetourneChoix();
      }


      //

    }

    else {

      Terminal.ecrireStringln("retour au Menu général et donc destruction du lanceur et des objets créés avec..");

    }


  }


}
