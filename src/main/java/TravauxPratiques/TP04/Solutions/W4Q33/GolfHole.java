package TravauxPratiques.TP04.Solutions.W4Q33;

/**
 * Exercise W3Q3 � 3
 * 
 * Class: GolfHole.java
 * Description: The Golf hole 
 * Auteur:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 08.03.2010
 * 
 */

public class GolfHole {
	
	public static final int MAX_BUNKERS = 10;
	public static final int MAX_WATER_HAZARD = 10;
	
	private int number;
	private String description;
	private int par;
	private int handicap;
	private int distLadies;
	private int distMen;
	private String sponsor;
	private int nBunkers;
	private GolfBunker[] bunkers;
	private int nWaterHazards;
	private GolfWaterHazard[] waterHazards;
	
	/**
	 * Constructor
	 * @param number
	 * @param description
	 * @param par
	 * @param handicap
	 * @param distLadies
	 * @param distMen
	 * @param sponsor
	 */
	GolfHole(int number, String description, int par, int handicap, 
			int distLadies, int distMen, String sponsor) {
		this.number = number;
		this.description = description;
		this.par = par;
		this.handicap = handicap;
		this.distLadies = distLadies;
		this.distMen = distMen;
		this.sponsor = sponsor;
		nBunkers = 0;
		bunkers = new GolfBunker[MAX_BUNKERS];
		nWaterHazards = 0;
		waterHazards = new GolfWaterHazard[MAX_WATER_HAZARD];
	}
	
	/**
	 * Method to add a bunker
	 * @param bunker
	 */
	public void addBunker(GolfBunker bunker) {
		for(int i=0; i<MAX_BUNKERS; i++) {
			if(bunkers[i]==null) {
				bunkers[i] = bunker;
				nBunkers++;
				return;
			}
		}
		System.out.println("sorry, max number of bunker has been reached");
	}
	
	/**
	 * Method to add a Water Hazard
	 * @param waterHazard
	 */
	public void addWaterHazard(GolfWaterHazard waterHazard) {
		for(int i=0; i<MAX_WATER_HAZARD; i++) {
			if(waterHazards[i]==null) {
				waterHazards[i] = waterHazard;
				nWaterHazards++;
				return;
			}
		}
		System.out.println("sorry, max number of water hazard has been reached");
	}

	//Getters
	public int getNumber() {
		return number;
	}

	public String getDescription() {
		return description;
	}

	public int getPar() {
		return par;
	}

	public int getHandicap() {
		return handicap;
	}

	public int getDistLadies() {
		return distLadies;
	}

	public int getDistMen() {
		return distMen;
	}
	
	public String getSponsor() {
		return sponsor;
	}

	public int getNBunkers() {
		return nBunkers;
	}

	public GolfBunker[] getBunkers() {
		return bunkers;
	}

	public int getNWaterHazards() {
		return nWaterHazards;
	}

	public GolfWaterHazard[] getWaterHazards() {
		return waterHazards;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		String s = "number=" + number;
		s += " description=" + description;
		s += " par=" + par;
		s += " handicap=" + handicap;
		s += " distLadies=" + distLadies;
		s += " distMen=" + distMen;
		s += " sponsor=" + sponsor;
		s += " nBunkers=" + nBunkers;
		s += " nWaterHazards=" + nWaterHazards + "\n";
		for(int i=0; i<nBunkers; i++) {
			s += "bunker[" + i + "] " + bunkers[i] + "\n";
		}
		for(int i= 0; i<nWaterHazards; i++) {
			s += "waterHazard[" + i + "] " + waterHazards[i] + "\n";
		}
		return s;
	}
}
