package TravauxPratiques.TP1.Solutions;

/**
* Practical Work Week 1
* Exercise W1Q3 � 4
 * Class: Table.java
 * Description: simulate tables with seats for a restaurant
 * Autor:  Christian Jungius
 * Date of creation:  03.12.2009
 * Last update: 10.02.2010
 */
public class Table {
	private int manySeats;
	private boolean occupied;
	private int number;
	
	// Konstruktoren
	public Table (int manySeats, int number) {
		this.manySeats = manySeats;
		this.number = number;
		occupied = false;
	}
	
	public Table (int number) {
		this.manySeats = 4;
		this.number = number;
		occupied = false;
	}

	// Getter und Setter
	public int getManySeats() {
		return manySeats;
	}

	public void setManySeats(int manySeats) {
		this.manySeats = manySeats;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString () {
		String status = null;
		if (occupied)
			status = "occupied";
		else
			status = "free";
		
		return "The table " + number + " with " + manySeats +
		" seat(s) is " + status;  
	}
	

}
