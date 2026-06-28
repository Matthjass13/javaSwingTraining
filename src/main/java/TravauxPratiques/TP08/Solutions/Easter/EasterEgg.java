/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: EasterEgg.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

public class EasterEgg extends HensEgg implements Hideable, Colorable {

	private Colours color;
	
	public EasterEgg(float weight, ShellColor shellColor, Status status) {
		super(weight, shellColor, status);
	}

	public EasterEgg () {
		super();
	}
	
	@Override
	public void paint(Colours color) {
		if (status == Status.HARDBOILED) {
			this.color = color;
			System.out.println("\t" + color + " dyed.");
		}
		else
			System.out.println("\tPlease boil the egg first...");
		
	}
	
	public String toString () {
		return super.toString() + " Painting: " + color;
	}
}
