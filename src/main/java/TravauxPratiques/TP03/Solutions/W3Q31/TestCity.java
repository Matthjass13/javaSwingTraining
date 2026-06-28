package TravauxPratiques.TP03.Solutions.W3Q31;

/**
 * Exercise W3Q3 � 1
 * 
 * Class: TestCity.java
 * Description: Test the city class
 * Auteur:	M�lanie Zufferey
 * Date of creation: 20.02.2009
 * Last update: 08.03.2010
 * 
 */

public class TestCity {

	public static void main(String[] args) {

		//Creation of a city (name, number of streets
		City sierre = new City("Sierre", 3) ;
		
		//Creation of 3 streets (name, number of houses)
		Street street1 = new Street("Street 1", 2);
		Street street2 = new Street("Street 2", 1);
		Street street3 = new Street("Street 3", 3);
		Street street4 = new Street("Street 4", 3);
		
		//Creation of 6 houses (house's number, number of inhabitants, family name)
		House house1 = new House(1, 4, "Emery") ;
		House house2 = new House(2, 4, "Vernier") ;
		House house3 = new House(3, 4, "Rey") ;
		House house1a = new House(1, 4, "Epiney") ;
		House house2a = new House(2, 4, "Smith") ;
		House house1b = new House(1, 4, "Chose") ;
		
		//Adding houses in the streets
		street1.addHouse(house1) ;
		street1.addHouse(house2) ;

		street2.addHouse(house1) ;
		
		street3.addHouse(house1) ;
		street3.addHouse(house2) ;
		street3.addHouse(house1) ;
		street3.addHouse(house3) ;
		street3.addHouse(house3) ;
		
		//Adding connections in the streets
		street1.addConnection(street2);
		street1.addConnection(street3);
		street1.addConnection(street4);
		
		//Adding streets in the city
		sierre.addStreet(street1) ;
		sierre.addStreet(street1) ;
		sierre.addStreet(street2) ;
		sierre.addStreet(street3) ;
		sierre.addStreet(street3) ;
		
		//Printing the connections of a street
		System.out.println(sierre.listConnections(street1)) ;
		
		//Printing the city
		System.out.println(sierre);
	}
}
