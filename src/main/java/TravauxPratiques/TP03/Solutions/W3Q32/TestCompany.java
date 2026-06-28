package TravauxPratiques.TP03.Solutions.W3Q32;

/**
 * Exercise W3Q3 � 2
 * 
 * Class: TestCompany.java
 * Description: Test 
 * Auteur:	Jean Hennebert et M�lanie Zufferey
 * Date of creation: 27.02.2009
 * Last update: 08.03.2010
 * 
 */

public class TestCompany {

	public static void main(String[] args) {
		Company myCorp = new Company("MyCorp 2009");
		
		Employee smith = new Employee("Smith John");
		Employee jaton = new Employee("Jaton Vincent");
		Employee vernier = new Employee("Vernier Fabian");
		Employee jaquet = new Employee("Jaquet Marcel");
		Employee kaiser = new Employee("Kaiser Daniel");
		Employee cham = new Employee("Cham Dominique");
		Employee reyA = new Employee("Rey Alain");
		Employee reyZ = new Employee("Rey Zo�");
		Employee elsig = new Employee("Elsig Fran?oise");
		Employee aquil = new Employee("Aquil Armand");
		Employee jacobs = new Employee("Jacobs Jacques");
		Employee deitel = new Employee("Deitel Dani?le");
		Employee chase = new Employee("Chase Chantal");
		
		Function ceo = new Function("Chief Executive Officer", smith, null);
		Function sales = new Function("Sales", jaton, ceo);
		Function procurement = new Function("Procurement", vernier, ceo);
		Function finance = new Function("Finance", jaquet, ceo);
		Function magazines = new Function("Magazines", kaiser, sales);
		Function books = new Function("Books", cham, sales);
		Function asia = new Function("Asia", reyA, procurement);
		Function euUsa = new Function("EU + USA", reyZ, procurement);
		Function accounting = new Function("Accounting", elsig, finance);
		Function salesRep1 = new Function("Sales Rep.", aquil, books);
		Function salesRep2 = new Function("Sales Rep", jacobs, books);
		Function eu = new Function("EU", deitel, euUsa);
		Function usa = new Function("USA", chase, euUsa);
		
		Position topManagement = new Position("Top Management");
		Position divisionDirectors = new Position("Division Directors");
		Position areaManager = new Position("Area Manager");
		Position officers = new Position("Officers");
		
		topManagement.addFunction(ceo);
		divisionDirectors.addFunction(sales) ;
		divisionDirectors.addFunction(procurement) ;
		divisionDirectors.addFunction(finance) ;
		areaManager.addFunction(magazines);
		areaManager.addFunction(books);
		areaManager.addFunction(asia);
		areaManager.addFunction(euUsa);
		areaManager.addFunction(accounting);
		officers.addFunction(salesRep1);
		officers.addFunction(salesRep2);
		officers.addFunction(eu);
		officers.addFunction(usa);
		
		myCorp.setTopLevelPosition(topManagement);
		myCorp.addPosition(divisionDirectors);
		myCorp.addPosition(areaManager);
		myCorp.addPosition(officers);
		
		System.out.println(myCorp.displayDependencies(ceo)) ;
		System.out.println(myCorp.displayResponsibilities(ceo)) ;
		
		System.out.println("Company = " + myCorp);
	}
}
