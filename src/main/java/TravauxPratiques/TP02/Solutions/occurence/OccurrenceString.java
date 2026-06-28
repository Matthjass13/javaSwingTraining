package TravauxPratiques.TP02.Solutions.occurence;

/**
 * PW Week 2
 * Exercise W2Q3 � 3
 * 
 * Class: OccurrenceString.java 
 * Description: classDescription 
 * Autor: ReJ 
 * 
 * Preconditions: -keyword String with keywords separated with only one colon
 * 				  - at least one keyword into the string
 * 
 * Date of creation: 18 janv. 2010 
 * Last update: 10 f�v. 2010
 */

public class OccurrenceString {
	private String chaineKeyword ;
	private String chaineText ;
	private String [] tableOccurrence ;
	private int [] countOccurrence ;
	
	// Constructor
	public OccurrenceString(String s1, String s2){
		chaineKeyword = s1 ;
		chaineText = s2 ;
	}
	
	// count the number of words delimited with a colon
	private int countWords() {
		int number=1 ; 		// at least one keywords (the last of the String)
		int position=-1 ;
		boolean ok = true ;
		
		// count the number of keywords into the String
		do {
			position = chaineKeyword.indexOf(",", position + 1) ;
			
			if (position == -1)
				ok = false ;
			else
				++number ;
			}
		while (ok) ;
	
		return number ;
	}
	
	// split the keywords into a table of strings
	public void insertIntoTable(){
		int number = countWords() ;
		int lastPosition, newPosition ;
		boolean ok = true ;
		tableOccurrence = new String[number] ;
		countOccurrence = new int[number] ;
		int i = 0 ;
		
		lastPosition = 0 ;
		
		do {
			newPosition = chaineKeyword.indexOf(",", lastPosition) ;
			
			if (newPosition == -1){
				ok = false ;
			
				// last word and spaces deleted
				tableOccurrence[i] = chaineKeyword.substring(lastPosition) ;
				tableOccurrence[i].trim();
			}		
			else{
				// extraction of the substring with spaces deleted 
				tableOccurrence[i] = chaineKeyword.substring(lastPosition, newPosition) ;
				tableOccurrence[i].trim();
				
				lastPosition = newPosition + 1 ;
				++i ;		
			}
		}
		while (ok) ;
			
	}
	
	// main method for calculating the number of occurrences of each words into the text
	public void calculateOccurrence(){
		int number ; 		
		int position ;
		boolean ok ;

		// for each words of the table, search for apparitions into the text
		for (int i = 0 ; i<tableOccurrence.length ; i++){
			number = 0 ; 		
			position = -1 ;
			ok = true ;
			
			// count the number of occurrences 
			do {
				position = chaineText.indexOf(tableOccurrence[i], position + 1) ;
				
				if (position == -1)
					ok = false ;
				else
					++number ;
				}
			while (ok) ;
			
			countOccurrence[i] = number ;
		}
	}
	
	// method preparing the output
	public String toString() {
		String s = "";
		
		for (int i=0 ; i<tableOccurrence.length ; i++){
			s += "\n"  + tableOccurrence[i] + " is appearing " + countOccurrence[i] + " time(s)." ;
		}
		
		return s ;
	}
}
