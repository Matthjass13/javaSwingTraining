/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: HensEgg.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

import java.util.Random;

public class HensEgg extends Egg {
	private ShellColor shellColor;
	protected Status status;

	enum Status {
		RAW, HARDBOILED;
	}
	
	enum ShellColor {
		WHITE, BROWN;
	}
	
	public HensEgg (float weight, ShellColor shellColor, Status status) {
		super (weight);
		this.shellColor = shellColor;
		this.status = status;
	}
	
	public HensEgg () {
		super (60);
		Random r = new Random();
		shellColor = ShellColor.values()[r.nextInt(ShellColor.values().length)];
		status = Status.values()[r.nextInt(Status.values().length)];
	}
	
	public String toString () {
		return super.toString() + "Shell color " + shellColor +
		       " Status: " + status;
	}
	
	public Status getStatus () {
		return status;
	}
	
}
