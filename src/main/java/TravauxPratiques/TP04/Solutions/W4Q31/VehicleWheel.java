package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: VehicleWheel.java
 * Description: VehicleWheel
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class VehicleWheel extends Vehicle{
  protected Wheel[] wheels ;
  public VehicleWheel() {
	  super();
  }
  public Wheel[] getWheels() {
    return wheels;
  }
  
  public String toString(){
	  String result ;
	  
	  result = super.toString() ;
	  
	  for(int i=0 ; i<wheels.length ; i++){
		  result += wheels[i].toString() ;
      }
  
  return result;
  }
}
