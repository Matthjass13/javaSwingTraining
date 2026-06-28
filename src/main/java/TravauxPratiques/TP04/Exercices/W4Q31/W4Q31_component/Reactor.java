package TravauxPratiques.TP04.Exercices.W4Q31.W4Q31_component;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: Reactor.java
 * Description: Reactor
 * Author:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 15.03.2010
 * 
 */

public class Reactor extends Object{
  private double power ;
  public Reactor(Object owner) {
    power = 3500 ;
  }
  public double getPower() {
    return power ;
  }
  
  public String toString(){
    return "Reactor power : " + power + "\n" ;
  }
}
