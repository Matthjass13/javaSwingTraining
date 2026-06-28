package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Vehicle4Wheel.java
 * Description: Vehicle4Wheel
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Vehicle4Wheel extends VehicleWheel{
  public Vehicle4Wheel() {
    super() ;

    wheels = new Wheel[4] ;

    for(int i=0 ; i<4 ; i++){
    	wheels[i] = new Wheel(this) ;
    }
  }
  
  public String toString() {
	  return super.toString() ;
  }
}
