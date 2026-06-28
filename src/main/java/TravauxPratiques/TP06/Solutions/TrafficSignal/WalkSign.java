package TravauxPratiques.TP06.Solutions.TrafficSignal;

/**
 * TP Week 6
 * Exercise W6Q3-1
 * 
 * Class : WalkSign
 * Description: WalkSign
 * Author : Florian Doche and Sabine Mathieu
 * Date of creation: 25.03.2010
 * Last update: 25.03.2010
 * 
 */

public class WalkSign extends TrafficSignal {

	public WalkSign(int state) {
		this.state = state;
	}
	
	public String getMessage() {

	    switch (state) {
	      case STOP: 
	    	  return "don't walk";
	      case GO: 
	    	  return "walk";
	      case CAUTION: 
	      case CAUTION2:
	    	  return "flashing don't walk";
	      default: 
	    	  return "illegal state";
	    }
	}
}
