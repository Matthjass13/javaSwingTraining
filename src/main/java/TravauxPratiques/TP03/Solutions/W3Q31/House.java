package TravauxPratiques.TP03.Solutions.W3Q31;

/**
 * Exercise W3Q3 � 1
 * 
 * Class: House.java
 * Description: Creation of a house
 * Auteur:	M�lanie Zufferey
 * Date of creation: 20.02.2009
 * Last update: 08.03.2010
 * 
 */

public class House {
	
	private int number ;
	private int inhabitantsNumber ;	
	private String familyName ;	
	
	/**
	 * House's constructor
	 * @param number
	 * @param inhabitantsNumber
	 * @param familyName
	 */
	public House(int number, int inhabitantsNumber, String familyName)
	{
		this.number = number ;
		this.inhabitantsNumber = inhabitantsNumber ;
		this.familyName = familyName ;
		
	}
		
	//Getter, setter
	public int getNumber() {
		return number;
	}
	
	/**
	 * toString method
	 */
	public String toString()
	{
		return "House :\nNumber : " + number + "\nInhabitantsNumber : " + inhabitantsNumber + "\nFamily name : " + familyName + "\n";
	}
}
