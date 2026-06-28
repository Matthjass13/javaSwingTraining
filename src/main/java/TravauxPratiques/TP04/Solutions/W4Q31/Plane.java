package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Plane.java
 * Description: Plane
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Plane extends Vehicle2Wheel{
  private Reactor reactor ;
  public Plane() {
    super() ;

    reactor = new Reactor(this) ;
  }
  public Reactor getReactor() {
    return reactor;
  }

  public String toString(){
    String result = "Plane reactor :\n" ;

    result += reactor.toString() ;
    result += super.toString() ;
    
    return result ;
  }
}
