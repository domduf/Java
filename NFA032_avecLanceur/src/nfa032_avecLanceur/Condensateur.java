package nfa032_avecLanceur;

public class Condensateur extends Composant {
  
  //variable de classe
  static int indice=0;
  
  //variables d'instance
  protected int numero;
  protected double valeur;// valeur en Farad
  
  public Condensateur(){
    super();
    super.type=TypeComposant.capacitif;
    super.nom="Condensateur";
    
    this.numero=indice;
    indice+=1;
  }
  
  public Condensateur(double val){
    super();
    super.type=TypeComposant.capacitif;
    super.nom="Condensateur";
    
    this.numero=indice;
    indice+=1;
    
    this.valeur =val;
  }

}
