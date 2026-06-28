package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Sailboat.java
 * Description: Sailboat
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Sailboat extends VehicleRudder{
  private Sail sail ;
  public Sailboat() {
    super() ;

    sail = new Sail(this) ;
  }
  public Sail getSail() {
    return sail;
  }

  public String toString(){
    String result = "Sailboat :\n" ;

    result += sail.toString() ;
    result += super.toString() ;
    
    return result ;
  }
}
