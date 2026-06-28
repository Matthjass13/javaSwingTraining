/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: Wrappable.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

public interface Wrappable {
	enum Colors {
		BLUE, RED, YELLOW, GREEN, PINK, PURPLE;
	}
	
	enum Pattern {
		CHECKED, STRIPED, DOTTED;
	}

	public void setColor (Colors color, Pattern pattern);
	public Colors getColor ();
	public Pattern getPattern ();
}
