package TravauxPratiques.TP1.Solutions;
/*
* Practical Work Week 1
* Exercise W1Q3 � 2
* Author: M�lanie Zufferey
* Date creation: 11.02.09
* Date last modification: 27.02.09
*/



import java.util.Scanner;

public class W1q32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		//choose a random number in the range 1 to 1000		
		int number = (int)(Math.random()*1000)+1;
		boolean correct = false ;
		
		System.out.println("I have a number between 1 and 1000. /n Can you guess my number? Enter your Guess : ");
				
		//loop to continue the game until the number is correct
		do {
			int guess = input.nextInt() ;
					
			if (guess == number)
			{
				System.out.println( "Correct!" );
				correct = true ;
			}
			else
				if ( guess > number )
		            System.out.println( "Too High. Try a lower number." );
		        else
		        	System.out.println( "Too Low. Try a higher number." );
		}while (correct == false) ;		
	}	
}
