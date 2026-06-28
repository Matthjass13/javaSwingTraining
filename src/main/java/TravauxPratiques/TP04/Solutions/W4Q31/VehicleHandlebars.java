package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: VehicleHandlebars.java
 * Description: VehicleHandlebars
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class VehicleHandlebars extends Vehicle2Wheel{
  protected Handlebars handlebars ;
  public VehicleHandlebars() {
    super() ;

    handlebars = new Handlebars(this) ;
  }
  public Handlebars getHandlebars() {
    return handlebars;
  }
  
  public String toString(){
	  String result = handlebars.toString() ;
	  
	  result += super.toString() ;
	  
	  return result ;
  }
}
