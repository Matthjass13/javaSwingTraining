package TravauxPratiques.TP06.Solutions.TrafficSignal;

/**
 * TP Week 6
 * Exercise W6Q3-1
 * 
 * Class : TrafficLight
 * Description: TrafficLight
 * Author : Florian Doche and Sabine Mathieu
 * Date of creation: 25.03.2010
 * Last update: 25.03.2010
 * 
 */

public class TrafficLight extends TrafficSignal {

	public TrafficLight(int state) {
		this.state = state;
	}
	
	public String getMessage() { 

	    switch (state) {
	      case STOP: 
	    	  return "red";
	      case GO: 
	    	  return "green";
	      case CAUTION:
	      case CAUTION2:
	    	  return "yellow";
	      default: 
	    	  return "illegal state";
	    }
	}
}
