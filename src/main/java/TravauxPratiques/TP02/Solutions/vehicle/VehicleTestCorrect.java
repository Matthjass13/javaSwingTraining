package TravauxPratiques.TP02.Solutions.vehicle;
public class VehicleTestCorrect {
	
	public static void main(String args[]) {
		
		Vehicle myBike = new Vehicle("Blue bike", 20);
		Vehicle myCar = new Vehicle("Red alfa", 100);
		
		myBike.numberOfPassengers = 1;
		myCar.numberOfPassengers = 4;
				
		myCar.setName("Green Porsche");
		
		myBike.setSpeed(-10);
		myCar.setSpeed(220);
				
	}

}