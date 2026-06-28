package TravauxPratiques.TP03.Solutions.W3Q32;

/**
 * Exercise W3Q3 � 2
 * 
 * Class: Company.java
 * Description: Company 
 * Auteur:	Jean Hennebert et M�lanie Zufferey
 * Date of creation: 27.02.2009
 * Last update: 08.03.2010
 * 
 */

public class Company {
	
	private String name;
	private Position topLevelPosition;
	private Position[] positions;
	private int nPosition;
	public static final int MAX_POSITIONS = 10;
	
	/**
	 * Constructor
	 * @param name
	 */
	Company(String name) {
		this.name = name;
		positions = new Position[MAX_POSITIONS];
		nPosition = 0;
	}
	
	//Getters - Setters
	public String getName() {
		return name;
	}
	
	public void setTopLevelPosition(Position p) {
		if(topLevelPosition == null) {
			this.topLevelPosition = p;			
		} else {
			System.out.println("sorry, this company has already one top level position");
		}
	}
	
	/**
	 * Method to add a position
	 * @param p
	 */
	public void addPosition(Position p) {
		//We go through the array to see if and where there is a room to put the position
		for(int i=0; i<MAX_POSITIONS; i++) {
			if(positions[i]==null) {
				positions[i]=p;
				nPosition++;
				return;
			}
		}
		System.out.println("Sorry, max number of position has been reached");
	}
	
	/**
	 * Method to diplay the responsibilities of a function
	 * @param function
	 * @return the responsibilities of the function
	 */
	public String displayResponsibilities(Function function)
	{					
		String responsibilities = "" ;
		boolean isResponsibleFor = false ;
		for(int i=0 ; i<function.getResponsibleFor().length ; i++)
		{
			if (function.getResponsibleFor()[i] != null)
			{
				responsibilities += function.getResponsibleFor()[i].getFEmployee().getName()+ "\n" ;
				isResponsibleFor = true ;
			}			
		}
	
		if (isResponsibleFor)
			return "The employe " + function.getFEmployee().getName() + " is responsible for\n" + responsibilities ;
		else
			return "The employe " + function.getFEmployee().getName() + " is responsible for nobody" ;
	}
	
	/**
	 * Method to diplay the dependencies of a function
	 * @param function
	 * @return the dependencies of the function
	 */
	public String displayDependencies(Function function)
	{
		if (function.getDependsTo()!=null)
			return "The employe " + function.getFEmployee().getName()+ " depends from " + function.getDependsTo().getFEmployee().getName();
		return "The employe " + function.getFEmployee().getName()+ " depends from nobody";
	}

	/**
	 * toString method
	 */
	public String toString() {
		String s = "company name=" + name + " nPosition=" + nPosition + "(top level not included)\n";
		if(topLevelPosition!=null) {
			s += "topLevelPosition " + topLevelPosition + "\n";
		}
		for(int i=0; i<nPosition; i++) {
			s += "pos[" + i + "] " + positions[i] + "\n";
		}
		return s;
 	}
}
