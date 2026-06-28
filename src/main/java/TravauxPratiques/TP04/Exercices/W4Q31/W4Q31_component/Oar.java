package TravauxPratiques.TP04.Exercices.W4Q31.W4Q31_component;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Oar.java
 * Description: Oar
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Oar extends Object{
  private double width ;
  public Oar(Object owner) {
    width = 0.25 ;
  }
  public double getWidth() {
    return width;
  }

  public String toString(){
    return "Oar width : " + width + "\n" ;
  }
}
