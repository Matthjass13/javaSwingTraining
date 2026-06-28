package TravauxPratiques.TP04.Exercices.W4Q31.W4Q31_component;

import TravauxPratiques.TP04.Solutions.W4Q31.Car;
import TravauxPratiques.TP04.Solutions.W4Q31.Motorcycle;
import TravauxPratiques.TP04.Solutions.W4Q31.Truck;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Engine.java
 * Description: Engine
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Engine extends Object{
  private double liter ;
  public Engine(Object owner) {

    if(owner instanceof Car)
      liter = 1.65 ;

    if(owner instanceof Truck)
      liter = 4.85 ;

    if(owner instanceof Motorcycle)
      liter = 0.75 ;
  }
  public double getLiter() {
    return liter;
  }

  public String toString(){
    return "Engine of : " + liter + " liter\n" ;
  }
}
