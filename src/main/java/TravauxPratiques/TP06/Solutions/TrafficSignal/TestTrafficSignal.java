package TravauxPratiques.TP06.Solutions.TrafficSignal;

/**
 * TP Week 6
 * Exercise W6Q3-1
 * 
 * Class : TestTrafficSignal
 * Description: TestTrafficSignal
 * Author : Florian Doche and Sabine Mathieu
 * Date of creation: 25.03.2010
 * Last update: 25.03.2010
 * 
 */

public class TestTrafficSignal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WalkSign w1 = new WalkSign(TrafficSignal.STOP);
	    TrafficLight t1 = new TrafficLight(TrafficSignal.GO);
	    
		for (int i = 0; i <= 4; i++) {
			
			System.out.println(w1);
			System.out.println(t1);
			System.out.println("************************");
			
			w1.changeState();
	      
			t1.changeState();
	    }
	}
}
