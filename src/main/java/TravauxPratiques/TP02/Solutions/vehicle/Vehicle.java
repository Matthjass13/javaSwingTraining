package TravauxPratiques.TP02.Solutions.vehicle;
/*
 * Practical Work Week 2 - reading and understanding code
 * - Explain the difference between line 11 and 13.
 * - What means 'this' in line 16
 * - Explain the signature of computeDistance in line 38
 * 
 * Author: Jean Hennebert 2009
 */
public class Vehicle {

	public int numberOfPassengers;
	private String name;
	private int speed;
	
	public Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
		validateSpeed();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		validateSpeed();
	}
	
	public int computeDistance(int timeSpentInVehicle) {
		int distance;
		distance = speed * timeSpentInVehicle;
		return distance;
	}
	
	public boolean isRunning() {
		if(speed!=0) {
			return true;
		} else {
			return false;
		}
	}
	
	private void validateSpeed() {
		if(speed<0) {
			System.out.println("A negative speed is not allowed, setting it to 0");
			speed = 0;
		}
		if(speed>120) {
			System.out.println("Your speed is too high, setting it to 120!");
			speed = 120;
		}
	}
	
}
