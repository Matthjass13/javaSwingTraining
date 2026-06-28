package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: SteeringWheel.java
 * Description: SteeringWheel
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
public class SteeringWheel extends Object{
  private double diameter ;
  public SteeringWheel(Object owner) {

    if(owner instanceof Car)
      diameter = 0.32 ;

    if(owner instanceof Truck)
      diameter = 0.38 ;

  }
  public double getDiameter() {
    return diameter;
  }

  public String toString(){
    return "Steering wheel diameter : " + diameter + "\n" ;
  }
}
