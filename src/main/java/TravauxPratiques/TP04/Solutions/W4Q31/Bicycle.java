package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Bicycle.java
 * Description: Bicycle
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Bicycle extends VehicleHandlebars{

  public Bicycle() {
    super() ;
  }

  public String toString(){
    String result = "Bicycle : \n" ;

    result += super.toString() ;
    
    return result ;
  }
}
