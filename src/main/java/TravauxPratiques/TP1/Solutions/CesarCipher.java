package TravauxPratiques.TP1.Solutions;

/*
* Practical Work Week 1
* Exercise W1Q3 � 3
* Author: Jean Hennebert
* Date creation: 
* Date last modification: 27.02.09
*/



public class CesarCipher {
	
	public static String cipher(String input, int shiftValue)
	{
		// Initialize the output 
		String result = "";
	
		// Get an array of characters
		byte[] byteArray = input.getBytes();
		int[] inputPositions = new int[byteArray.length];
		int[] outputPositions = new int[byteArray.length];
	
		// convert the byteArray to an array of int
		for( int i=0; i<byteArray.length; i++ )
		{
			inputPositions[i] = (char)byteArray[i];
		}

		// do the shift leaving white space untouched
		for( int i=0; i<byteArray.length; i++ )
		{
			if(inputPositions[i] == ' ') {
				outputPositions[i] = inputPositions[i]; //leave white space untouched
			} else {
				int shifted = (inputPositions[i] - 'a' + shiftValue); //normalize according to 'a' and add the shift
				if(shifted >= 26) //perform cycling
					shifted = shifted - 26;
				outputPositions[i] = shifted + 'a'; //de-normalize according to 'a'
			}
			result += Character.toString((char) outputPositions[i]);
		}		
		return result;
	}
	
	//this method works probably only on lowercase !!!
	public static String decipher(String input, int shiftValue)
	{
		// Initialize the output 
		String result = "";
	
		// Get an array of characters
		byte[] byteArray = input.getBytes();
		int[] inputPositions = new int[byteArray.length];
		int[] outputPositions = new int[byteArray.length];
	
		// convert the byteArray to an array of int
		for( int i=0; i<byteArray.length; i++ )
		{
			inputPositions[i] = (char)byteArray[i];
		}

		// do the shift leaving white space untouched
		for( int i=0; i<byteArray.length; i++ )
		{
			if(inputPositions[i] == ' ') {
				outputPositions[i] = inputPositions[i]; //leave white space untouched
			} else {
				int shifted = (inputPositions[i] - 'a'- shiftValue); //normalize according to 'a' and remove the shift
				if(shifted < 0)
					shifted = 26 + shifted;					
				outputPositions[i] = shifted + 'a'; //de-normalize according to 'a'
			}
			result += Character.toString((char) outputPositions[i]);
		}
		
		return result;
	}
	
	
	public static void main(String args[]) {
		int cesarKey = 3;
		String inputString = "the quick brown fox jumps over the lazy dog";
		String cipheredString = CesarCipher.cipher(inputString,cesarKey);
		System.out.println("input   : " + inputString);
		System.out.println("cipher  : " + cipheredString);
		System.out.println("decipher: " + CesarCipher.decipher(cipheredString,cesarKey));
	}

	
}
