package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Truck.java
 * Description: Truck
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Truck extends VehicleSteeringWheel{
  private Trailer trailer ;
  public Truck() {
    super() ;

    trailer = new Trailer(this) ;
  }
  public Trailer getTrailer() {
    return trailer;
  }

  public String toString(){
    String result = "Truck trailer : \n" ;

    result += trailer.toString() ;
    result += super.toString() ;
    
    return result ;
  }
}
