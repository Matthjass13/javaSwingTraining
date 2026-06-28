package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Vehicle2Wheel.java
 * Description: Vehicle2Wheel
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Vehicle2Wheel extends VehicleWheel{
  public Vehicle2Wheel() {
    super() ;

    wheels = new Wheel[2] ;

    wheels[0] = new Wheel(this) ;
    wheels[1] = new Wheel(this) ;
  }
  
  public String toString(){
	  return super.toString() ;
  }
}
