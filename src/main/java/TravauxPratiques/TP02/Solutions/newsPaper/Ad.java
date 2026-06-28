package TravauxPratiques.TP02.Solutions.newsPaper;

/**
 * PW Week 2
 * Exercise W2Q3 � 2
 * 
 * Class: Ad.java
 * Description: Creation of an ad 
 * Auteur:	M�lanie Zufferey & Jean Hennebert
 * Date of creation: 20.02.2009
 * Last update: 01.03.2010
 * 
 */

public class Ad {
	
	private String author ;
	private String title ;
	private String text ;
	private String company ;
	private Photo [] photos ;
	//to know how many photos you have in the ad
	private int cptPhotos = 0 ;
	
	/**
	 * Ad's constructor
	 * @param author
	 * @param title
	 * @param text
	 * @param company
	 * @param nbPhotos
	 */
	public Ad(String author, String title, String text, String company , int nbPhotos)
	{
		this.author = author ;
		this.title = title ;
		this.text = text ;
		this.company = company ;
		
		photos = new Photo [nbPhotos] ;
	}	
	
	/**
	 * Method to add a photo in the ad
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
			System.out.println("The ad '"+ title + 
					"' is full you can't add a new photo");
	}	
	
	/**
	 * Method to display the photos of the ad
	 * @return
	 */
	public String displayPhotos()
	{
		String result = "" ;
		//read the array and store each photo to display
		for (int i=0 ; i<photos.length ; i++)
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
		return "  Ad :\n  Author : " + author + "\n  Title : " + title + "\n  Text : " + text + "\n  Company : " + company + "\n" + displayPhotos() + "\n" ;
	}

}
