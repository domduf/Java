package nfa032_avecLanceur;

public enum TypeComposant {
  
  
  resistif("composant passif","Ohms"),
  capacitif("composant capacitif","Farads"),
  selfique("composant selfique","Henrys");
  
  
  private String nom;
  private String unite;
  
  private TypeComposant(String n, String u) {
    this.nom = n;
    this.unite=u;
  }
  
  public String donneType() {
    return this.nom;
    
  }
  
  public String donneUnite(){
    return this.unite;
  }
  

}
