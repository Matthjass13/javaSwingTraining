package TravauxPratiques.TP04.Solutions.W4Q33;

/**
 * Exercise W3Q3 � 3
 * 
 * Class: GolfBunker.java
 * Description: Bunker 
 * Auteur:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 08.03.2010
 * 
 */

public class GolfBunker {

	private String name;
	
	/**
	 * Constructor
	 * @param name
	 */
	GolfBunker(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for the name variable
	 * @return name
	 */ 
	public String getName() {
		return name;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		return "name=" + name;
	}
}
