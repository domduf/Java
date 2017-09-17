package nfa032_avecLanceur;

public class Resistance extends Composant {

  // variable de classe
  static int indice=0;
  
  // variables d'instance
  protected int numero;
  //protected double valeur; // valeur de R
 
  
  public Resistance(){
    super();
    super.type= TypeComposant.resistif;
    super.nom="Resistance";
    
    this.numero=indice;
    indice+=1;
  }
  
  public Resistance(double res) {
 
    super();
    super.type= TypeComposant.resistif;
    super.nom="Resistance";
   
    this.numero=indice;
    indice+=1;
    
    this.valeur = res;
  }
  
  
  public String afficheValeur(){
    
    return "résistance de "+Double.toString(super.valeur)+" Ohms";
    
  }
  
  public void setValeur( double val ){
    super.valeur=val;
  }

}
