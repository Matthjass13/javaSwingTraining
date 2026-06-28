package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Motorcycle.java
 * Description: Motorcycle
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Motorcycle extends VehicleHandlebars{
  private Engine engine ;
  
  public Motorcycle() {
    super() ;

    engine = new Engine(this) ;
  }
  public Engine getEngine() {
    return engine;
  }

  public String toString(){
    String result = "Motorcycle :\n" ;

    result += engine.toString() ;
    
    result += super.toString() ;
    
    return result ;
  }
}
