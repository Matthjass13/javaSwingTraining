package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Carriage.java
 * Description: Carriage
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */
 
public class Carriage extends Vehicle4Wheel{
  private Horse[] horses ;
  public Carriage() {
    super() ;

    horses = new Horse[4] ;

    for(int i=0 ; i<4 ; i++)
      horses[i] = new Horse(this) ;
  }
  public Horse[] getHorses() {
    return horses;
  }

  public String toString(){
    String result = "Carriage of 4 horses : \n" ;

    for(int i=0 ; i<horses.length ; i++)
      result += horses[i].toString() ;
    
    result += super.toString() ;
    
    return result ;
  }
}
