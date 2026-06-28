package TravauxPratiques.TP1.Solutions;


/**
* Practical Work Week 1
* Exercise W1Q3 � 4
 * Class: Restaurant.java
 * Description: simulate a restaurant with tables
 * Autor:  Christian Jungius
 * Date of creation:  03.12.2009
 * Last update: 10.02.2010
 */

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		Table tables [];
		int manyTables = 0;
		int choice;
		int manyPersons;
		boolean free = false;
		int manySeats;
		int which;
		
		System.out.println("How many tables in your Restaurant?");
		manyTables = in.nextInt();
		tables = new Table[manyTables];

		for (int i = 0; i < tables.length; i++) {
			System.out.println("How many persons can seat around the table " + (i+1) +  " ?");
			manySeats = in.nextInt();
			tables[i] = new Table(manySeats, i+1);
		}
		
		do {
			System.out.println("Choose: " +
					"\n 1)Take a seat\n 2)Go away\n 3)Show\n 4)End");
			choice = in.nextInt();
			
			switch (choice) {
			case 1:
				// Auswahl setzen: Tisch suchen
				System.out.println("How many persons are you ?");
				manyPersons = in.nextInt();
				free = false;
				for (int i = 0; i < tables.length; i++) {
					// ersten m�glichen Tisch suchen und belegen
					if (manyPersons <= tables[i].getManySeats() 
							&& tables[i].isOccupied() == false) {
						tables[i].setOccupied(true);
						System.out.println("You can seat around the table number "
								+ tables[i].getNumber() );
						free = true;
						break;
					}
				}
				if (free == false) {
					System.out.println("All tables are occupied, " +
							"wait for a moment");
				}
				break;
			case 2:
				// G�ste sind fertig und gehen
				System.out.println("Which table is coming free ?");
				which = in.nextInt();
				
				if (which < 1 || which > tables.length) {
					System.out.println("This table don't exist!");
				}
				else {
					if (tables[which-1].isOccupied()==true) {
						tables[which-1].setOccupied(false);
						System.out.println("We hope, you have pleasure to eat here.");
					}
					else
						System.out.println("The table wasn't occupied...");
				}
				
				break;
			case 3:
				// Alle anzeigen
				for (int i = 0; i < tables.length; i++) {
					System.out.println(tables[i].toString());
				}
				break;
			case 4:
				System.out.println("Thank you for your visit.");
				break;

			default:
				System.out.println("Bad choice. Choose a number between 1 and 4.");
				break;
			}
			
			
		} while (choice != 4);
		
	}

}
