package nfa032_avecLanceur;

public class Inductance extends Composant{  
  
  //variable de classe
  static int indice=0;
  
  //variables d'instance
  protected int numero;
  protected double inductance; // valeur en Henry
  
  
  public Inductance (){
    super();
    super.type=TypeComposant.selfique;
    super.nom="Self";
    
    this.numero=indice;
    indice+=1;
  }  
  
  public Inductance (double val){
    super();
    super.type=TypeComposant.selfique;
    super.nom="Self";
    
    this.numero=indice;
    indice+=1;
    
    this.valeur =val;
  }
}
