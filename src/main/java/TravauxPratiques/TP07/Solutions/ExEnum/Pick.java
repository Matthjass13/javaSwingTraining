package TravauxPratiques.TP07.Solutions.ExEnum;

/**
 * TP Week 5
 * Exercise W5Q3 1
 * 
 * Class: TP07.Solutions.enume.Pick.java
 * Description: Test 
 * Authors: Christiane Jungius and Melanie Zufferey
 * Date of creation: 26.02.2009
 * Last update: 22.03.2010
 * 
 */

public class Pick {

	public static void main(String[] args) {		
		Orchard orchard = new Orchard(5, 1000) ;
		orchard.pick() ;
		orchard.displayResult() ;		
	}
}
