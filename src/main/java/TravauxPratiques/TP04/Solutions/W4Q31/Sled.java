package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Sled.java
 * Description: Sled
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Sled extends Vehicle{
  private IceSkating[] iceSkatings ;
  private Horse[] horses ;
  public Sled() {
    iceSkatings = new IceSkating[2] ;
    horses = new Horse[4] ;

    for(int i=0 ; i<2 ; i++)
      iceSkatings[i] = new IceSkating(this) ;

    for(int i=0 ; i<4 ; i++)
      horses[i] = new Horse(this) ;
  }
  public IceSkating[] getIceSkatings() {
    return iceSkatings;
  }

  public String toString(){
    String result = "Sled with two iceSkatings:\n"  ;

    for(int i=0 ; i<iceSkatings.length ; i++)
    	result +=  iceSkatings[i].toString() ;

    for(int i=0 ; i<horses.length ; i++)
    	result += horses[i].toString() ;
    
    return result ;
  }
}
