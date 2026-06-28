package TravauxPratiques.TP07.Solutions.shape;

/**
 * TP Week 7
 * Exercise W7Q3  � 2
 * 
 * Class: TwoDimensionalShape.java
 * Description: Definition of class TwoDimensionalShape
 * Auteur: Deitel
 * Date of creation: 
 * Last update: 20.04.2009
 * 
 */

public abstract class TwoDimensionalShape extends Shape 
{
   private int dimension1;
   private int dimension2;

   // four-argument constructor
   public TwoDimensionalShape( int x, int y, int d1, int d2 )
   {
      super( x, y );
      dimension1 = d1;
      dimension2 = d2;
   } // end four-argument TwoDimensionalShape constructor

   // set methods
   public void setDimension1( int d )
   {
      dimension1 = d;
   } // end method setDimension1

   public void setDimension2( int d )
   {
      dimension2 = d;
   } // end method setDimension2

   // get methods
   public int getDimension1()
   {
      return dimension1;
   } // end method getDimension1

   public int getDimension2()
   {
      return dimension2;
   } // end method getDimension2

   // abstract method
   public abstract int getArea();
} // end class TwoDimensionalShape

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