package TravauxPratiques.TP06.Solutions.TrafficSignal;

/**
 * TP Week 6
 * Exercise W6Q3-1
 * 
 * Class : TrafficSignal
 * Description: TrafficSignal
 * Author : Florian Doche and Sabine Mathieu
 * Date of creation: 25.03.2010
 * Last update: 25.03.2010
 * 
 */

public abstract class TrafficSignal {
	
	public final static int GO = 0;
	public final static int CAUTION = 1;
	public final static int STOP = 2;
	public final static int CAUTION2 = 3;
	public final static int NUMBER_OF_STATES = 4;
	protected boolean passageRequested = false;
	protected int state = STOP;

	public void changeState() {
		this.state = (state + 1) % NUMBER_OF_STATES;
	}

	public int getState() {
	    return state;    
	}

	public abstract String getMessage();
	  
	public String toString() {
	    return "[" + getClass() + ": " + " " 
	    + getMessage() + "]";
	}
}
