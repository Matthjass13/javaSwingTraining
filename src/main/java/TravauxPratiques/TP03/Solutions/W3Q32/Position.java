package TravauxPratiques.TP03.Solutions.W3Q32;

/**
 * Exercise W3Q3 � 2
 * 
 * Class: Position.java
 * Description: Position 
 * Auteur:	Jean Hennebert et M�lanie Zufferey
 * Date of creation: 27.02.2009
 * Last update: 08.03.2010
 * 
 */

public class Position {
	
	public static final int MAX_FUNCTIONS = 10;
	private String name;
	private Function[] functions;
	private int nFunctions;
	
	/**
	 * Constructor
	 * @param name
	 */
	Position(String name) {
		this.name = name;
		functions = new Function[MAX_FUNCTIONS];
		nFunctions = 0;
	}
	
	/**
	 * Method to add a function
	 * @param f
	 */
	public void addFunction(Function f) {
		for(int i=0; i<MAX_FUNCTIONS;i++) {
			if(functions[i]==null) {
				functions[i]=f;
				nFunctions++;
				return;
			}
		}
		System.out.println("Sorry, max number of functions has been reached");
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		String s = "name=" + name + " nFunctions=" + nFunctions + "\n";
		for(int i=0; i<nFunctions; i++) {
			s += "function[" + i + "] " + functions[i] + "\n";
		}
		return s;
	}
}
