package TravauxPratiques.TP04.Exercices.W4Q31.W4Q31_component;

import TravauxPratiques.TP04.Solutions.W4Q31.*;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Wheel.java
 * Description: Wheel
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Wheel extends Object{
  private double inch ;
  public Wheel(Object owner) {

    if(owner instanceof Car)
      inch = 18.0 ;

    if(owner instanceof Truck)
      inch = 35.0 ;

    if(owner instanceof Bicycle)
      inch = 1.5 ;

    if(owner instanceof Motorcycle)
      inch = 6.0 ;

    if(owner instanceof Plane)
      inch = 28.0 ;

    if(owner instanceof Carriage)
      inch = 77.0 ;
  }
  public double getInch() {
    return inch;
  }

  public String toString(){
    String result;
    
	result = "Wheel of : " + inch + " inch(es) \n" ;
	
	return result;	
  }
}
