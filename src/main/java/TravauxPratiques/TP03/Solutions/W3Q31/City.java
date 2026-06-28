package TravauxPratiques.TP03.Solutions.W3Q31;

/**
 * Exercise W3Q3 � 1
 * 
 * Class: City.java
 * Description: Creation of a city
 * Auteur:	M�lanie Zufferey
 * Date of creation: 20.02.2009
 * Last update: 08.03.2010
 * 
 */
 
public class City {
	
	private String name ;
	private Street[] streets ;
	private int cptStreets = 0 ;
	
	/**
	 * City's constructor
	 * @param name
	 * @param nbStreets
	 */
	public City(String name, int nbStreets)
	{
		this.name = name ;
		streets = new Street[nbStreets] ;
	}
	
	/**
	 * Method to add a street in the city
	 * The street must have a unique name in the city
	 * @param street
	 */
	public void addStreet(Street street)
	{
		if (cptStreets < streets.length)
		{
			if(!hasStreet(street))
			{
				streets[cptStreets] = street ;
				cptStreets++ ;
			}
			else
				System.out.println("You can't add that street, the city " + name + " already as a house with that name " + street.getName());
		}
		else
			System.out.println("The city is full you can't add a new street");
	}
	
	/**
	 * Method to list the houses of the street
	 * @return
	 */
	public String listStreets()
	{
		String result = "" ;
		//read the array and store each connections to list
		for (int i=0 ; i<cptStreets ; i++)
		{
			result = result + streets[i];
		}
		
		return result ;
	}
	
	public String listConnections(Street street)
	{
		return street.getName() + " is connected with \n" + street.listConnectionsName();
	}
	
	/**
	 * toString method
	 */
	public String toString()
	{
		return "City :\nName : " + name + "\n" + listStreets() + "\n";
	}
	
	public boolean hasStreet(Street s) {
		for(int i=0; i<cptStreets;i++) {
			if(streets[i].getName().equals(s.getName())) {
				return true;
			}
		}
		return false;
	}
}