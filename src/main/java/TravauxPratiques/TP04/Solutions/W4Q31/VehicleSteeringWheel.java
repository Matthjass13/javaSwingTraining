package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: VehicleSteeringWheel.java
 * Description: VehicleSteeringWheel
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class VehicleSteeringWheel extends Vehicle4Wheel{
  protected SteeringWheel steeringWheel ;
  protected Engine engine ;
  public VehicleSteeringWheel() {
    super() ;

    steeringWheel = new SteeringWheel(this) ;
    engine = new Engine(this) ;
  }
  public SteeringWheel getSteeringWheel() {
    return steeringWheel;
  }
  
  public String toString(){
	  
	  String result = steeringWheel.toString() ;
	  result += engine.toString() ;
	  result += super.toString() ;
	  
	  return result ;
  }
}
