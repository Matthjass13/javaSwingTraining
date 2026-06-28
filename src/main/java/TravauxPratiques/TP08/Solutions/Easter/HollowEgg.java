/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: HollowEgg.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

public class HollowEgg extends ChocolateEgg {

	public HollowEgg(float weight) {
		super(weight);
	}
	
	public HollowEgg () {
		super();
	}
	
	public String toString () {
		return super.toString() + " Hollow";
	}

}
