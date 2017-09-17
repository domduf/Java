package nfa032_avecLanceur;

/*
 * enum de la fonction du filtre
 */
public enum FonctionFiltre {
  
  passeTOUT("passe-TOUT",0),// PASSE-TOUT... c'est un fil de cuivre
  passeHaut("passe-haut",1),// attenue BF
  passeBas("passe-bas",2),// attenue HF
  plateau("plateau",3), //  gain min, gain Max, freq, pente
  passeBande("passe-bande",4), // Gain + sur bande freq
  coupeBande("coupe-bande",5); // Gain - sur bande freq
  
  
  private String nom;
  private int numero;
  
  private  FonctionFiltre(String no, int nu){
    this.nom=no;
    this.numero=nu;
  }
  
  public String getFonction(){
    return this.nom;
  }
  
  public int getNumeroFonction(){
    return this.numero;
  }

}
