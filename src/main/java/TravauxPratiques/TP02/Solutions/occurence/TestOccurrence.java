package TravauxPratiques.TP02.Solutions.occurence; /**
 * PW Week 2
 * Exercise W2Q3 � 3
 * 
 * Class: TestOccurrence.java 
 * Description: Test with the main the class OccurrenceString 
 * Autor: ReJ 
 * 
 * Date of creation: 18 janv. 2010 
 * Last update: 10 f�v. 2010
 */

import java.util.Scanner;

public class TestOccurrence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2 ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Input a String with various Keywords : ") ;
		s1 = scan.nextLine() ;
			
		System.out.println("Input a text : ") ;
		s2 = scan.nextLine() ;
		
		OccurrenceString s = new OccurrenceString(s1, s2) ;
		
		s.insertIntoTable() ;
		s.calculateOccurrence() ;
		System.out.println( s.toString()) ;
		

	}

}
