/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: ChocolateEgg.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

import java.util.Random;

public class ChocolateEgg extends Egg implements Wrappable, Hideable {

	Colors color;
	Pattern pattern;
	
	public ChocolateEgg (float weight) {
		super(weight);
	}
	
	public ChocolateEgg () { // "Zufallsei" anlegen
		super(20);
		Random r = new Random();
		color = Colors.values()[r.nextInt(Colors.values().length)];
		pattern = Pattern.values()[r.nextInt(Pattern.values().length)];
	}
	
	@Override
	public Colors getColor() {
		return color;
	}

	@Override
	public Pattern getPattern() {
		return pattern;
	}

	@Override
	public void setColor(Colors color, Pattern pattern) {
		this.color = color;
		this.pattern = pattern;
	}
	
	public String toString () {
		return super.toString() + "Packing: " + color + ", " + pattern;
	}
	
}
