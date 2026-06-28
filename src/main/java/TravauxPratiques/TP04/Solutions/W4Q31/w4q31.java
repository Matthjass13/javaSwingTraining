package TravauxPratiques.TP04.Solutions.W4Q31;

/**
 * Exercise W4Q3 � 1
 * 
 * Class: w4q31.java
 * Description: Test with main
 * Author:	Sabine Mathieu
 * Date of creation: 15.03.2010
 * Last update: 15.03.2010
 * 
 */

public class w4q31 {
  Plane airplane = new Plane() ;
  Boat boat = new Boat() ;
  Carriage carriage = new Carriage() ;
  Truck truck = new Truck() ;
  Motorcycle motorcycle = new Motorcycle() ;
  Sled sled= new Sled() ;
  Bicycle bicycle= new Bicycle() ;
  Sailboat sailboat= new Sailboat() ;
  Car car= new Car() ;

  public w4q31() {
  System.out.println("----------------------------------------") ;
  System.out.println(airplane.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(boat.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(carriage.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(truck.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(motorcycle.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(sled.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(bicycle.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(sailboat.toString()) ;
  System.out.println("----------------------------------------") ;
  System.out.println(car.toString()) ;
  System.out.println("----------------------------------------") ;
  }
  public static void main(String[] args) {
    w4q31 w4q31_test = new w4q31();
  }
}
