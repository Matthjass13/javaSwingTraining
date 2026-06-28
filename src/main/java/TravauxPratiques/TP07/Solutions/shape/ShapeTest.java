package TravauxPratiques.TP07.Solutions.shape;

/**
 * TP Week 7
 * Exercise W7Q3  � 2
 * 
 * Class: ShapeTest.java
 * Description: Program tests the Shape hierarchy
 * Auteur: Deitel
 * Date of creation: 
 * Last update: 20.04.2009
 * 
 */
 
public class ShapeTest 
{
   // create Shape objects and display their information
   public static void main( String args[] )
   {
      Shape shapes[] = new Shape[ 4 ];
      shapes[ 0 ] = new Circle( 22, 88, 4 );
      shapes[ 1 ] = new Square( 71, 96, 10 );
      shapes[ 2 ] = new Sphere( 8, 89, 2 );
      shapes[ 3 ] = new Cube( 79, 61, 8 );

      // call method print on all shapes
      for ( Shape currentShape : shapes ) 
      {
         System.out.printf( "%s: %s", 
            currentShape.getName(), currentShape );
         
         if ( currentShape instanceof TwoDimensionalShape )
         {
            TwoDimensionalShape twoDimensionalShape = 
               ( TwoDimensionalShape ) currentShape;

            System.out.printf( "%s's area is %s\n", 
               currentShape.getName(), twoDimensionalShape.getArea() );
         } // end if
         
         if ( currentShape instanceof ThreeDimensionalShape )
         {
            ThreeDimensionalShape threeDimensionalShape = 
               ( ThreeDimensionalShape ) currentShape;
            
            System.out.printf( "%s's area is %s\n", 
               currentShape.getName(), threeDimensionalShape.getArea() );
            System.out.printf( "%s's volume is %s\n",
               currentShape.getName(), 
               threeDimensionalShape.getVolume() );
         } // end if

         System.out.println();
      } // end for
   } // end main
} // end class ShapeTest

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