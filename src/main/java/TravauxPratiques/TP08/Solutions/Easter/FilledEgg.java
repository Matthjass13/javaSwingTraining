/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: FilledEgg.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

import java.util.Random;

public class FilledEgg extends ChocolateEgg {
	Flavor flavorFilling;
	FillingTyp fillingTyp;
	
	enum Flavor {
		SCHOKOLADE, ZARTBITTER, ERDBEER, VANILLE, KROKANT;
	}
	
	enum FillingTyp {
		MARZIPAN, CREAM, ALCOHOLIC;
	}
	
	public FilledEgg () {
		super();
		super.weight = 20;
		Random r = new Random();
		flavorFilling = Flavor.values()[r.nextInt(Flavor.values().length)];
		fillingTyp = FillingTyp.values()[r.nextInt(FillingTyp.values().length)];
	}
	
	public FilledEgg (float weight, FillingTyp fillingTyp, Flavor flavorFilling) {
		super(weight);
		this.fillingTyp = fillingTyp;
		this.flavorFilling = flavorFilling;
	}
	
	public String toString () {
		return super.toString() + " Filling flavor: " + flavorFilling
		    + ", Typ: " + fillingTyp;
	}
}
