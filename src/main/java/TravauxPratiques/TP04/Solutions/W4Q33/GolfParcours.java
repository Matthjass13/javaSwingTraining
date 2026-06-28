package TravauxPratiques.TP04.Solutions.W4Q33;
/**
 * Exercise W3Q3 � 3
 * 
 * Class: GolfParcours.java
 * Description: The Golf Parcours 
 * Auteur:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 08.03.2010
 * 
 */

public class GolfParcours {
	
	public enum GolfType {NINE_HOLES, EIGHTEEN_HOLES};
	
	private String name;      // the name of the golf
	private GolfType type;    // NINE_HOLES or EIGHTEEN_HOLES
	private GolfHole[] holes; // the array of GolfHoles
	private int maxHoles;     // the max number of holes, 9 or 18
	private int nHoles;       // the current number of holes
	
	/**
	 * Constructor
	 * @param name
	 * @param type
	 */
	public GolfParcours(String name, GolfType type) {
		this.name = name;
		this.type = type;
		if(type==GolfType.NINE_HOLES) {
			maxHoles = 9;
		} else {
			maxHoles = 18;
		}
		holes = new GolfHole[maxHoles];
	}
	
	/**
	 * Method to add a hole
	 * @param hole
	 */
	public void addHole(GolfHole hole) {
		for(int i=0; i<maxHoles; i++) {
			if(holes[i]==null) {
				holes[i]=hole;
				nHoles++;
				return;
			}
		}
		System.out.println("sorry, max number of holes has been reached");
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		String s = "golf name=" + name;
		s += " type=" + type;
		s += " nHoles=" + nHoles + "\n";
		for(int i=0; i<nHoles; i++) {
			s += "hole[" + i + "] " + holes[i] + "\n";
		}
		return s;
	}
}
