package TravauxPratiques.TP02.Solutions.newsPaper;

/**
 * PW Week 2
 * Exercise W2Q3 � 2
 * 
 * Class: Article.java
 * Description: Creation of an article 
 * Auteur:	M�lanie Zufferey & Jean Hennebert
 * Date of creation: 20.02.2009
 * Last update: 01.03.2010
 * 
 */

public class Article {
	
	private String author ;
	private String title ;
	private String text ;
	private Photo [] photos ;
	//to know how many photos you have in the article
	private int cptPhotos = 0 ;
	
	/**
	 * Article's constructor
	 * @param author
	 * @param title
	 * @param text
	 * @param nbPhotos
	 */
	public Article(String author, String title, String text, int nbPhotos)
	{
		this.author = author ;
		this.title = title ;
		this.text = text ;
		
		photos = new Photo [nbPhotos] ;
	}
	
	/**
	 * Method to add a photo in the article
	 * @param photo
	 */
	public void addPhoto(Photo photo)
	{
		//if there is still room to add the photo
		if (cptPhotos < photos.length)
		{
			//put the photo in the array and increment the cptPhotos
			photos[cptPhotos] = photo ;
			cptPhotos++ ;
		}
		else
		{
			System.out.println("The article '" +
					title + "' is full you can't add a new photo");
		}
	}
	
	/**
	 * Method to display the photos of the article
	 * @return
	 */
	public String displayPhotos()
	{
		String result = "" ;
		//read the array and store each photo to display
		for (int i=0 ; i<cptPhotos ; i++)
		{
			result = result + photos[i];
		}
		
		return result ;
	}
	
	/**
	 * toString method
	 */
	public String toString()
	{
		return "  Articles :\n  Author : " + author + "\n  Title : " + title + "\n  Text : " + text + "\n" + displayPhotos() + "\n";
	}

}
