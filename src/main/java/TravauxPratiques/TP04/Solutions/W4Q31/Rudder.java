package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Rudder.java
 * Description: Rudder
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Rudder extends Object{
  private double depth ;
  public Rudder(Object owner) {

    if(owner instanceof Sailboat)
      depth = 2.15 ;

    if(owner instanceof Boat)
      depth = 0.85 ;

  }
  public double getDepth() {
    return depth;
  }

  public String toString(){
    return "Rudder depth : " + depth + "\n" ;
  }
}
