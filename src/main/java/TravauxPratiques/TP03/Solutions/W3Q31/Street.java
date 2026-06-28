package TravauxPratiques.TP03.Solutions.W3Q31;

/**
 * Exercise W3Q3 � 1
 * 
 * Class: Steet.java
 * Description: Creation of a street
 * Auteur:	M�lanie Zufferey
 * Date of creation: 20.02.2009
 * Last update: 08.03.2010
 * 
 */

public class Street {
	
	private String name ;
	private House[] houses ;
	private Street[] connectionStreets = new Street[2] ;
	int cptHouses = 0 ;
	int cptConnection = 0 ;
	
	/**
	 * Street's constructor
	 * @param name
	 * @param nbHouses
	 */
	public Street(String name, int nbHouses)
	{
		this.name = name ;
		houses = new House[nbHouses] ;		
	}
	
	/**
	 * Method to add a house in the street
	 * The house must have a unique number in the street
	 * @param house
	 */
	public void addHouse(House house)
	{
		if (cptHouses < houses.length)
		{
			boolean isPossible = true ;	
			for (int i=0 ; i<cptHouses ; i++)
				if(houses[i].getNumber() == house.getNumber())
					isPossible = false ;
			
			if (isPossible)
			{
				houses[cptHouses] = house ;
				cptHouses++ ;
			}
			else
				System.out.println("You can't add that house, the street " + name + " already as a house with the number " + house.getNumber());
		}
		else
			System.out.println("The street is full you can't add a new house");
	}
	
	/**
	 * Method to add a connection in the street
	 * A street is connected to two OTHER streets
	 * If street1 is connected to street2, 
	 * street2 is also connected to street1
	 * @param connectionStreet
	 */
	public void addConnection(Street connectionStreet)
	{
		//testing if a street is not already connected to a street
		if (isConnectedTo(connectionStreet))
		{
			System.out.println("You can't add that connection, the street " + connectionStreet.getName() + " is already connected to " + name);
			return ;
		}
		//testing if the street is not connected to itself
		if(this == connectionStreet) {
			System.out.println("You can't connect a street to itself");
			return;
		}
		//adding the connection
		if (cptConnection < connectionStreets.length)
		{
			//in the street
			connectionStreets[cptConnection] = connectionStreet ;
			cptConnection++ ;
			//update the connectionStreets of the connectionStreet
			connectionStreet.connectionStreets[connectionStreet.cptConnection] = this ;
			connectionStreet.cptConnection++ ;
		}
		else
			System.out.println("The street already has "+ connectionStreets.length + " connections, you can't add a new one");
	}
	
	/**
	 * Method to check if a connection street is already connected
	 * @param newStreet
	 * @return
	 */
	public boolean isConnectedTo(Street newStreet)
	{
		for (int i=0 ; i<cptConnection ; i++)
			if(connectionStreets[i] == newStreet)
				return true;
		
		return false;
	}
		
	//Getter, setter
	public String getName() {
		return name;
	}
	
	/**
	 * Method to list the houses of the street
	 * @return
	 */
	public String listHouses()
	{
		String result = "" ;
		//read the array and store each houses to list
		for (int i=0 ; i<cptHouses ; i++)
		{
			result = result + houses[i];
		}
		
		return result ;
	}
	
	/**
	 * Method to list the houses of the street
	 * @return
	 */
	public String listConnectionsName()
	{
		String result = "" ;
		//read the array and store each connections to list
		for (int i=0 ; i<cptConnection ; i++)
		{
			result = result + connectionStreets[i].getName()+"\n";
		}
		
		return result ;
	}
		
	/**
	 * toString method
	 */
	public String toString()
	{
		return "Street :\nName : " + name + "\n" + listHouses() + "\n";
	}
}
