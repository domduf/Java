package nfa032_avecLanceur;

public class Filtre2 extends Filtre {
  
  
  protected Composant composantA;
  protected Composant composantB;
  protected Composant composantC;
  protected String[] lesChoixProposes = {"choix Des Composants", "sortir"};  
  
  
  
  // constructeur du filtre ordre 2
  Filtre2() {
    super(2);
    this.ceQueJePropose=new Menu("Menu Filtre ordre 2 ", this.lesChoixProposes);
    Terminal.ecrireStringln("dans le lanceur de filtre 1");
  }
  
  // methodes d'instances
  
  /**
   *  oriente vers la methode spécifique au voeux
   * @param voeux
   */
  public void faitDonc(int voeux){
    
    
    
    if (voeux==1) {// choix Des Composants
      
      this.choixDesComposants();
      
    }
    
    
  }
  
  public void choixDesComposants(){
    Terminal.ecrireStringln("à implémenter pour les trois composants dans Filtre2");
  }

  
  
}
