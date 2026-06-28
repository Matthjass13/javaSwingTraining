package TravauxPratiques.TP1.Solutions;

/*
* Practical Work Week 1
* Exercise W1Q3 � 1
* Author: M�lanie Zufferey
* Date creation: 11.02.09
* Date last modification: 27.02.09
*/

public class W1q31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i < 3; i++ )
		{
			for (int j = 3; j > 0; j-- )
			{ 
				for ( int k = 1; k <= 6; k=k+2 )
					System.out.print( '*' );

				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		
		int i, j, k ;	
			
		i = 1 ;
		while (i < 3)
		{
			j = 3 ;
			while (j > 0 )
			{ 
				k = 1 ;
				while (k <= 6 )
				{
					System.out.print( '*' );
					k = k+2 ;
				}

				System.out.println();
				j-- ;
			}
			System.out.println();
			i++ ;
		}


	}

}
