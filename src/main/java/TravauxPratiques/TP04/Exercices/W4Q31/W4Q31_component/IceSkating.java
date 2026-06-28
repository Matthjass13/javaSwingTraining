package TravauxPratiques.TP04.Exercices.W4Q31.W4Q31_component;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: IceSkating.java
 * Description: IceSkating
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class IceSkating extends Object{
  private double length ;
  public IceSkating(Object owner) {
    length = 3.5 ;
  }
  public double getLength() {
    return length;
  }

  public String toString(){
    return "IceSkating length : " + length + "\n";
  }
}
