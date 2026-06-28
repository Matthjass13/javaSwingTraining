package TravauxPratiques.TP07.Solutions.shape;

/**
 * TP Week 7
 * Exercise W7Q3  � 2
 * 
 * Class: Sphere.java
 * Description: Definition of class Sphere
 * Auteur: Deitel
 * Date of creation: 
 * Last update: 20.04.2009
 * 
 */

public class Sphere extends ThreeDimensionalShape
{
   // three-argument constructor
   public Sphere( int x, int y, int radius )
   {
      super( x, y, radius, radius, radius );
   } // end three-argument Sphere constructor

   // overridden methods
   public String getName()
   {
      return "Sphere";
   } // end method getName

   public int getArea()
   {
      return ( int ) ( 4 * Math.PI * getRadius() * getRadius() );
   } // end method getArea

   public int getVolume()
   {
      return ( int ) ( 4.0 / 3.0 * Math.PI * 
         getRadius() * getRadius() * getRadius() );
   } // end method getVolume

   // set method
   public void setRadius( int radius )
   {
      setDimension1( radius );
      setDimension2( radius );
      setDimension3( radius );
   } // end method setRadius

   // get method
   public int getRadius()
   {
      return getDimension1();
   } // end method getRadius
   
   public String toString()
   {
      return String.format( "%s %s: %d\n", 
         super.toString(), "radius", getRadius() );
   } // end method toString
} // end class Sphere

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/