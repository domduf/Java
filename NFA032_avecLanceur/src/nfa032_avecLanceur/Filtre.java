package nfa032_avecLanceur;

public class Filtre  {

  protected Composant composantUnique;
  protected String[] choixComposant={"Resistance", "Condensateur", "Self"};
  protected Menu menuComposant = new Menu("Choisissez Votre composant", choixComposant);

  protected int ordre;
  protected FonctionFiltre fonction;
  protected float attenuation[];
  protected float phase[];
  protected float freqBasse;
  protected float freqHaute;
  protected float pasDeMesure;
  protected Menu ceQueJePropose;
  protected String[] lesChoixProposes = {"choix du Composant","calcul Tableau Attenuation",
      "calcul du Tableau Phase",
      "affiche le Tableau des Attenuations ","affiche le Tableau de rotation de Phase","affiche le composant", "sortir"};



  /**
   * constructeur par défaut
   */
  Filtre(){
    this.fonction=FonctionFiltre.passeTOUT;
    this.ordre=0;
    Terminal.ecrireStringln("dans le lanceur de filtre 0");
    this.ceQueJePropose=new Menu("Menu Filtre ordre 0 ", this.lesChoixProposes);
  }

  /**
   * constructeur 
   * @param o ordre
   */
  Filtre(int o){
    this.ordre=o;
  }




  /**
   * 
   * @return ordre du filtre
   */
  public int getOrdre(){
    return this.ordre;
  }




  // methodes d'instances

  /**
   *  oriente vers la methode spécifique au voeux
   * @param voeux
   */
  public void faitDonc(int voeux){


    if (voeux==1) {// choix Des Composants
      this.choixDesComposants(composantUnique);

    }

    if (voeux==2){// calcul Tableau Attenuation
      this.calculTableauAttenuation();

    }

    if(voeux==3){//calcul du Tableau Phase
      this.calculTableauPhase();

    }

    if(voeux==4){// affiche attenuations
      this.afficheTableauAttenuation();

    }

    if(voeux==5){// affiche phase
      this.afficheTableauPhase();
    }
    
    if(voeux==6){// affiche phase
      this.afficheComposants(this.composantUnique);
    }

  }


  /** 
   * affiche la fonction du filtre
   */
  public void afficheFonction(){

    if (this.ordre==0) {
      Terminal.ecrireStringln("ce filtre d'ordre "+this.getOrdre()+
          " a pour fonction"+this.fonction.getFonction());

    }

  }

  /**
   * choixDesComposants
   */
  public void choixDesComposants(Composant c){


    Terminal.ecrireStringln("Quel type de composant voulez-vous ?");

    //Composant.afficheTypesDeComposant();

    int choixComposant = menuComposant.afficheSaisitRetourneChoix();

    if (choixComposant==1) {

      c=new Resistance();

      Terminal.ecrireStringln("Entrez sa valeur:");
      
      try {
              double valeur = Terminal.lireDouble();
      Terminal.sautDeLigne();
      c.setValeur(valeur);
      Terminal.ecrireStringln(donneNomEtValeurComposant(c));
      } 
      
      catch (TerminalException e) {
        this.messageErreurEntree(e,c);
      }

    } 

    
    
    
    if (choixComposant==2) {

      c=new Condensateur();

      Terminal.ecrireStringln("Entrez sa valeur:");
      
      try {
        double valeur = Terminal.lireDouble();
        Terminal.sautDeLigne();
        c.setValeur(valeur);
        Terminal.ecrireStringln(donneNomEtValeurComposant(c));
        
      } catch (TerminalException e) {
        this.messageErreurEntree(e, c);
        
      }
      
      


    }

    if (choixComposant==3) {

      c=new Inductance();
      Terminal.ecrireStringln("Entrez sa valeur:");
      
      try {
      double valeur = Terminal.lireDouble();
      Terminal.sautDeLigne();
      c.setValeur(valeur);
      Terminal.ecrireStringln(donneNomEtValeurComposant(c));

      } 
      
      catch (TerminalException e) {
        this.messageErreurEntree(e, c);
      }

    } 
    


  }
  
  
  public void afficheComposants(Composant c) {
    
    donneNomEtValeurComposant(c);
    
  }
  
  /**
   * donne le Nom Et la Valeur du Composant
   * @param c
   * @return
   */
  public String donneNomEtValeurComposant(Composant c){
   return (c.nom+ " "+c.getValeur()
        + " "+c.type.donneUnite());
  }
  


  /**
   * clacul le Tableau des Attenuations
   */
  public void calculTableauAttenuation(){
    Terminal.ecrireStringln("Pour les attenuations, soyons tranquilles... aucune.." +
        "et hop !");
  }

  /**
   * calcul Tableau Phase
   */
  public void calculTableauPhase(){
    Terminal.ecrireStringln("Pour la phase, ça ne tourne pas... calme plat" +
        "et hop !");

  }

  /**
   * affiche Tableau Attenuation
   */
  public void afficheTableauAttenuation(){

    Terminal.ecrireStringln("0dB ---------------");

  }

  /**
   * affiche Tableau Phase
   */
  public void afficheTableauPhase(){

  }
  
 /**
  * 
  * @param e
  */
  public void messageErreurEntree(TerminalException e, Composant c){
    Terminal.ecrireStringln("Ré-essayez SVP, mauvaise valeur entrée -> "+e.toString());
    choixDesComposants(c);
  }

}
