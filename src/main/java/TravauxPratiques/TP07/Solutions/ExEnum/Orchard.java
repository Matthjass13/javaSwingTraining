package TravauxPratiques.TP07.Solutions.ExEnum;
/**
 * TP Week 5
 * Exercise W5Q3 1
 *
 * Class: Orchard.java
 * Description: Creation of an Orchard
 * Authors: Christiane Jungius and Melanie Zufferey
 * Date of creation: 26.02.2009
 * Last update: 22.03.2010
 *
 */

import java.util.Random;

public class Orchard {
	
	public final int MAX_FRUITS ;
	public final int NUM_WORKERS ;

	private Random r = new Random();
	private int select_worker = 0;
	public int select_fruit = 0;
	private int worker [] [] ;
	
	/**
	 * Constructor
	 * @param nbWorkers
	 * @param totalFruit
	 */
	public Orchard(int nbWorkers, int totalFruit)
	{
		NUM_WORKERS = nbWorkers ;
		MAX_FRUITS = totalFruit;
		worker = new int [NUM_WORKERS] [Fruit.values().length];
	}
	
	/**
	 * randomly pick fruits
	 */
	public void pick()
	{
		for (int i = 0; i < MAX_FRUITS; i++) {
			select_worker = r.nextInt(NUM_WORKERS);
			select_fruit = r.nextInt(Fruit.values().length);			
			worker[select_worker][select_fruit]++; 
		}
	}
	
	/**
	 * print result of daily work
	 */
	public void displayResult()
	{
		for (int i = 0; i < worker.length; i++) {
			System.out.println("worker " + (i+1) + " collected: ");
			for (int j = 0; j < Fruit.values().length; j++) {
				System.out.println(worker [i][j] + " " + Fruit.values()[j] + "S");
			}
			
		}
	}

}
