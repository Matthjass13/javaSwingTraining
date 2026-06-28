package TravauxPratiques.TP03.Solutions.W3Q32;

/**
 * Exercise W3Q3 � 2
 * 
 * Class: Function.java
 * Description: Function 
 * Auteur:	Jean Hennebert et M�lanie Zufferey
 * Date of creation: 27.02.2009
 * Last update: 08.03.2010
 * 
 */

public class Function {
	
	private String name;
	private Employee fEmployee;
	private Function dependsTo;
	private Function[] responsibleFor;
	
	public static final int MAX_RESPONSIBILITIES = 10;

	/**
	 * Constructor
	 * @param name
	 * @param employee
	 * @param dependsTo
	 */
	public Function(String name, Employee employee, Function dependsTo) {
		this.name = name;
		fEmployee = employee;
		this.dependsTo = dependsTo;
		if(dependsTo!=null) 
			dependsTo.addResponsibility(this);
		responsibleFor = new Function[MAX_RESPONSIBILITIES];
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public Employee getEmployee() {
		return fEmployee;
	}
			
	public Employee getFEmployee() {
		return fEmployee;
	}

	public Function getDependsTo() {
		return dependsTo;
	}

	public Function[] getResponsibleFor() {
		return responsibleFor;
	}

	/**
	 * Method to add a responsibility
	 * @param newResponsibility
	 */
	private void addResponsibility(Function newResponsibility) {
		for(int i=0; i<MAX_RESPONSIBILITIES; i++) {
			if(responsibleFor[i]==null) {
				responsibleFor[i]=newResponsibility;
				return;
			}
		}
		System.out.println("Sorry, could not add function, limit has been reached");
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		String s = "functionName=" + name + " " + fEmployee;
		if(dependsTo!=null) {
			s += " depends to " + dependsTo.name;
		} else {
			s += " depends to nobody";
		}
		return s;
	}
}
