package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Handlebars.java
 * Description: Handlebars
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Handlebars extends Object{
  private double width ;
  public Handlebars(Object owner) {

    if(owner instanceof Motorcycle)
      width = 0.45 ;

    if(owner instanceof Bicycle)
      width = 0.25 ;
  }
  public double getWidth() {
    return width;
  }

  public String toString(){
    return "Handlebars width : " + width + "\n" ;
  }
}
