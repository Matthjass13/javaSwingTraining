package TravauxPratiques.TP02.Solutions.newsPaper;

/**
 * PW Week 2
 * Exercise W2Q3 � 2
 * 
 * Class: Photo.java
 * Description: Creation of a photo 
 * Auteur:	M�lanie Zufferey & Jean Hennebert
 * Date of creation: 20.02.2009
 * Last update: 01.03.2010
 * 
 */

public class Photo {
	
	private String name ;
	private String photograph ;
	private int width ;
	private int height ;
	
	/**
	 * Photo's constructor
	 * @param name
	 * @param photograph
	 * @param width
	 * @param heigt
	 */
	public Photo(String name, String photograph, int width, int heigt)
	{
		this.name = name ;
		this.photograph = photograph ;
		this.width = width ;
		this.height = heigt ;
	}
	
	/**
	 * toString method
	 */
	public String toString()
	{
		return "   Photo :\n   Name : " + name + "\n   Photograph : " + photograph + "\n   Width : " + width + "\n   Height : " + height + "\n" ;
	}

}
