/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: Egg.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

abstract public class Egg {
	protected float weight;
	
	public Egg (float weight) {
		this.weight = weight;
	}
	
	public String toString () {
		return "Weight: " + weight + "g ";
	}

}
