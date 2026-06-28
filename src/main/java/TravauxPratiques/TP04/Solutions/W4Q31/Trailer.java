package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Trailer.java
 * Description: Trailer
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Trailer extends Object{
  private double weight ;
  public Trailer(Object owner) {
    weight = 27 ;
  }
  public double getWeight() {
    return weight;
  }

  public String toString(){
    return "Trailer weight : " + weight + "\n" ;
  }
}
