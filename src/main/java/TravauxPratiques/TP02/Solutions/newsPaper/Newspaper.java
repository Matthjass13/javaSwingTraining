package TravauxPratiques.TP02.Solutions.newsPaper;

/**
 * PW Week 2
 * Exercise W2Q3 � 2
 * 
 * Class: Newspaper.java
 * Description: Creation of a newspaper 
 * Auteur:	M�lanie Zufferey & Jean Hennebert
 * Date of creation: 20.02.2009
 * Last update: 01.03.2010
 * 
 */

public class Newspaper {
	
	private String name ;
	private String date ;
	private int nbPages ;
	private Article [] articles ;
	private Ad [] ads ;
	private int cptArticles = 0 ;
	private int cptAds = 0 ;
	
	/**
	 * Newspaper's constructor
	 * @param name
	 * @param date
	 * @param nbPage
	 * @param nbArticles
	 * @param nbAds
	 */
	public Newspaper(String name, String date, int nbPage, int nbArticles, int nbAds)
	{
		this.name = name ;
		this.date = date ;
		this.nbPages = nbPage ;
		
		articles = new Article[nbArticles] ;
		ads = new Ad[nbAds] ;
	}
	/**
	 * Method to add as article in the newspaper	
	 * @param article
	 */
	public void addArticle(Article article)
	{
		//if there is still room to add the article
		if (cptArticles < articles.length)
		{
			//put the article in the array and increment the cptArticles
			articles[cptArticles] = article ;
			cptArticles++ ;
		}
		else
			System.out.println("The newspaper is full you can't add a new article");
	}
	
	/**
	 * Method to add as ad in the newspaper
	 * @param ad
	 */
	public void addAd(Ad ad)
	{
		//if there is still room to add the ad
		if (cptAds < ads.length)
		{
			//put the ad in the array and increment the cptAds
			ads[cptAds] = ad ;
			cptAds++ ;
		}
		else
			System.out.println("The newspaper is full you can't add a new ad");
	}
	
	/**
	 * Method to display the ads of the newspaper
	 * @return
	 */
	public String displayAds()
	{
		String result = "" ;
		//read the array and store each ad to display
		for (int i=0 ; i<ads.length ; i++)
		{
			result = result + ads[i];			
		}
		
		return result ;
	}
	
	/**
	 * Method to display the article of the newspaper
	 * @return
	 */
	public String displayArticles()
	{
		String result = "" ;
		//read the array and store each article to display
		for (int i=0 ; i<articles.length ; i++)
		{
			result = result + articles[i];
		}
		
		return result ;
	}
		
	/**
	 * toString method
	 */
	public String toString()
	{
		return "Newspaper : \n Name : " + name + "\n Date : " + date + "\n Number of pages : " + nbPages  + "\n" + displayArticles() + "\n Ads : \n" + displayAds() + "\n" ; 
	}
	

}
