package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Boat.java
 * Description: Boat
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Boat extends VehicleRudder{
  private Oar[] oars ;
  public Boat() {
    super() ;

    oars = new Oar[2] ;

    for(int i=0 ; i<2 ; i++)
      oars[i] = new Oar(this) ;
  }
  public Oar[] getOars() {
    return oars;
  }

  public String toString(){
    String result = "Boat of 2 oars : \n" ;

    for(int i=0 ; i<oars.length ; i++)
      result += oars[i].toString() ;
    
    result += super.toString() ;
    
    return result ;
  }
}
