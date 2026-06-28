package TravauxPratiques.TP04.Solutions.W4Q33;

/**
 * Exercise W3Q3 � 3
 * 
 * Class: TestGolfSierre.java
 * Description: Test 
 * Auteur:	Jean Hennebert
 * Date of creation: 16.03.2009
 * Last update: 08.03.2010
 * 
 */

public class TestGolfSierre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GolfParcours golfSierre = new GolfParcours("Golf of Sierre", GolfParcours.GolfType.NINE_HOLES);
		
		// hole 1
		GolfHole h1 = new GolfHole(1, "Par 4 de 316 m?tres ...", 4, 15, 290, 316, "Implenia");
		GolfBunker bh1 = new GolfBunker("bunker middle of hole 1");
		GolfWaterHazard whh1 = new GolfWaterHazard("water hazard hole 1");
		GolfWaterHazard whh1h9 = new GolfWaterHazard("water hazard hole 1 and 9");
		h1.addBunker(bh1);
		h1.addWaterHazard(whh1);
		h1.addWaterHazard(whh1h9);
		golfSierre.addHole(h1);
		
		// hole 2
		GolfHole h2 = new GolfHole(2, "Le trou le plus court du parcours ...", 3, 17, 108, 125, "ACA");
		GolfBunker bh2_1 = new GolfBunker("bunker hole 2.1");
		GolfBunker bh2_2 = new GolfBunker("bunker hole 2.2");
		h2.addBunker(bh2_1);
		h2.addBunker(bh2_2);
		golfSierre.addHole(h2);
		
		// holes 3 to 9 to be completed
		// some holes can share the same GolfBunker or GolfWaterHazard objects
		// for example hole 1 and hole 9 will share object whh1h9
		
		System.out.println(golfSierre);
	}
}
