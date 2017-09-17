package nfa032_avecLanceur;

public class Composant {


  protected TypeComposant type;
  protected String nom;
  protected double valeur;



  // constructeur par défaut
  Composant(){
    this.nom="inconnu";

  }

  Composant(String n, TypeComposant t){
    this.nom=n;
    this.type=t;

  }



  public String getType(){
    return this.type.donneType();
  }

  public double getValeur(){
    return this.valeur;
  }


  public void setValeur(double val){
    this.valeur=val;
  }



  // methode de Classe... 
  public  static String[]  afficheTypesDeComposant(){

    int i=0;
    int c= TypeComposant.values().length;
    String[] tabComposants= new String[c];

    for (TypeComposant type : TypeComposant.values()){

      tabComposants[i]=type.name();
      //Terminal.ecrireStringln("compteur "+i);
      i++;
      //Terminal.ecrireStringln("un type possible est "+ type.name());

    }

    return tabComposants;

    //


  }


}
