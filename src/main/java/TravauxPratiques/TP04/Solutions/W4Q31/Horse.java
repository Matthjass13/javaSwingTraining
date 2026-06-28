package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Horse.java
 * Description: Horse
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Horse extends Object{
  private String race ;
  public Horse(Object owner) {

    if(owner instanceof Sled)
      race = "Percheron" ;

    if(owner instanceof Carriage)
      race = "Camargue" ;
  }
  public String getRace() {
	    return race;
	  }

  public String toString(){
    return "Horse race : " + race + "\n" ;
  }
}
