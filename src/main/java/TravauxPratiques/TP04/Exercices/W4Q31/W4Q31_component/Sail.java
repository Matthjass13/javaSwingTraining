package TravauxPratiques.TP04.Exercices.W4Q31.W4Q31_component;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Sail.java
 * Description: Sail
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Sail extends Object{
  private double area ;
  public Sail(Object owner) {
    area = 35 ;
  }
  public double getArea() {
    return area ;
  }

  public String toString(){
    return "Sail area : " + area + "\n" ;
  }
}
