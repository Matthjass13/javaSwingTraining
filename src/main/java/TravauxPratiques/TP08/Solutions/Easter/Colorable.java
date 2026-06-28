/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: Colorable.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

public interface Colorable {
	enum Colours {
		WHITE, RED_WHITE, GREEN_BLUE, YELLOW_ORANGE, BLUE_LILA, LILA_RED;
	}
	
	void paint (Colours color);
}
