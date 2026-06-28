package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: VehicleRudder.java
 * Description: VehicleRudder
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class VehicleRudder extends Vehicle{
  protected Rudder rudder ;
  public VehicleRudder() {

    rudder = new Rudder(this) ;
  }
  public Rudder getRudder() {
    return rudder;
  }

  public String toString(){
	  return rudder.toString() ;
  }

}
