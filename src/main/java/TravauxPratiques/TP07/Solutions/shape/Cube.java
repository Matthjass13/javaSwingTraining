package TravauxPratiques.TP07.Solutions.shape;

/**
 * TP Week 7
 * Exercise W7Q3  � 2
 * 
 * Class: Cube.java
 * Description: Definition of class Cube
 * Auteur: Deitel
 * Date of creation: 
 * Last update: 20.04.2009
 * 
 */
 
public class Cube extends ThreeDimensionalShape 
{
   // three-argument constructor
   public Cube( int x, int y, int side )
   {
      super( x, y, side, side, side );
   } // end three-argument Cube constructor

   // overridden methods
   public String getName()
   {
      return "Cube";
   } // end method getName

   public int getArea()
   {
      return ( int ) ( 6 * getSide() * getSide() );
   } // end method getArea

   public int getVolume()
   {
      return ( int ) ( getSide() * getSide() * getSide() );
   } // end method getVolume

   // set method
   public void setSide( int side )
   {
      setDimension1( side );
      setDimension2( side );
      setDimension3( side );
   } // end method setSide

   // get method
   public int getSide()
   {
      return getDimension1();
   } // end method getSide
   
   public String toString()
   {
      return String.format( "%s %s: %d\n", 
         super.toString(), "side", getSide() );
   } // end method toString
} // end class Cube

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