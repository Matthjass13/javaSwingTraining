/**
 * Autor: Christiane Jungius
 * Modul: 632-1
 * Datum: 05.04.2010
 * Datei: EasterEggFactory.java
 */
package TravauxPratiques.TP08.Solutions.Easter;

import java.util.Random;
import java.util.Scanner;


public class EasterEggFactory {

	private Egg eggs [];

	enum Typ {
		CHOCOLATE_EGG, EASTER_EGG, FILLED_EGG, HENS_EGG, HOLLOW_EGG;
	}
	
	public EasterEggFactory (int num) {
		eggs = new Egg [num];
	}
	
	public void createSet () {
		Random r = new Random ();
		Typ typ;
		
		for (int i = 0; i < eggs.length; i++) {
			typ = Typ.values()[r.nextInt(Typ.values().length)];
			switch (typ) {
			case CHOCOLATE_EGG:
				eggs[i] = new ChocolateEgg();
				break;
			case EASTER_EGG:
				eggs [i] = new EasterEgg();
				break;
			case FILLED_EGG:
				eggs [i] = new FilledEgg();
				break;
			case HENS_EGG:
				eggs [i] = new HensEgg();
				break;
			case HOLLOW_EGG:
				eggs [i] = new HollowEgg();
				break;
			default:
				break;
			}
		}
	}
	
	public void paint () {

		Random r = new Random();
		Colorable.Colours color;
		
		for (int i = 0; i < eggs.length; i++) {
			if (eggs[i] instanceof Colorable) {
				color = EasterEgg.Colours.values()[r.nextInt(EasterEgg.Colours.values().length)];
				((EasterEgg)eggs [i]).paint(color);
			}
		}
		System.out.println(); // Blank line
	}
	
	
	public void print () {
		int schoggi = 0;
		int easterEgg = 0;
		
		
		for (int i = 0; i < eggs.length; i++) {
			System.out.println(eggs[i].toString());
			
			if (eggs[i] instanceof Hideable) {
				if (eggs[i] instanceof ChocolateEgg) {
					schoggi++;
				}
				if (eggs[i] instanceof EasterEgg && 
						((EasterEgg)eggs[i]).getStatus() == HensEgg.Status.HARDBOILED )
					easterEgg++;
				
			}
		}
		
		System.out.println("\n" + schoggi + " are chocolate eggs");
		System.out.println(easterEgg + " are (real) Easter eggs");
		System.out.println("The remaining eggs are either hen eggs " +
				"or not yet cooked.");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		
		System.out.println("How many eggs to pack in the basket?");
		num = in.nextInt();
		
		EasterEggFactory eef = new EasterEggFactory (num);
		eef.createSet();
		eef.paint();
		eef.print();
	}
}
