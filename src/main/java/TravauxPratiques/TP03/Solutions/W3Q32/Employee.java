package TravauxPratiques.TP03.Solutions.W3Q32;

/**
 * Exercise W3Q3 � 2
 * 
 * Class: Employee.java
 * Description: Employee 
 * Auteur:	Jean Hennebert et M�lanie Zufferey
 * Date of creation: 27.02.2009
 * Last update: 08.03.2010
 * 
 */

public class Employee {

	private String name;

	/**
	 * Constructor
	 * @param name
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}

	//Getter - Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		return "employee=" + name;
	}
}
