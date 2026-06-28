package TravauxPratiques.TP07.Solutions.shape;

/**
 * TP Week 7
 * Exercise W7Q3  � 2
 * 
 * Class: Shape.java
 * Description: Definition of class Shape
 * Auteur: Deitel
 * Date of creation: 
 * Last update: 20.04.2009
 * 
 */
 
public abstract class Shape 
{
   private int x; // x coordinate
   private int y; // y coordinate

   // two-argument constructor
   public Shape( int x, int y )
   {
      this.x = x;
      this.y = y;
   } // end two-argument Shape constructor

   // set x coordinate
   public void setX( int x )
   {
      this.x = x;
   } // end method setX

   // set y coordinate
   public void setY( int y )
   {
      this.y = y;
   } // end method setY

   // get x coordinate
   public int getX()
   {
      return x;
   } // end method getX

   // get y coordinate
   public int getY()
   {
      return y;
   } // end method getY

   // return String representation of Shape object
   public String toString()
   {
      return String.format( "[%d, %d]", getX(), getY() );
   }

   // abstract methods
   public abstract String getName();
   
   // abstract methods
   public abstract int getArea();
   
} // end class Shape

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