package TravauxPratiques.TP02.Solutions.newsPaper;

/**
 * PW Week 2
 * Exercise W2Q3 � 2
 * 
 * Class: Test.java
 * Description: Testing the cration of Newspapers 
 * Auteur:	M�lanie Zufferey & Jean Hennebert
 * Date of creation: 20.02.2009
 * Last update: 01.03.2010
 * 
 */

public class TestNewspaper {

	public static void main(String[] args) {
		
		//Article constructor with author, title, text, number of photos 
		Article article1 = new Article("Zuber", "Titre 1", "BlaBla 1", 2); 
		Article article2 = new Article("Emery", "Titre 2", "BlaBla 2", 1);
		Article article3 = new Article("Zufferey", "Titre 3", "BlaBla 3", 1);
		Article article4 = new Article("Epiney", "Titre 4", "BlaBla 4", 0);
		//Ad constructor with author, title, text, company, number of photos
		Ad ad1 = new Ad("Ruedin", "Gruyeres AOC", "BlaBlaBla", "Migros" ,2) ; 
		Ad ad2 = new Ad("Zuber", "NF", "BlaBlaBla", "Nouvelliste" ,2) ;
		Ad ad3 = new Ad("Antille", "Edelweiss", "BlaBlaBla", "ChocVillars" ,1) ;
		
		Photo photo1 = new Photo("Photo 1", "Constantin", 5, 15) ;
		Photo photo2 = new Photo("Photo 2", "Constantin", 10, 13);
		Photo photo3 = new Photo("Photo 3", "Constantin", 15, 5) ;
		Photo photo4 = new Photo("Photo 4", "Constantin", 9, 15) ;
		Photo photo5 = new Photo("Photo 5", "Constantin", 5, 15) ;
		Photo photo6 = new Photo("Photo 6", "Constantin", 5, 15) ;
		Photo photo7 = new Photo("Photo 7", "Constantin", 5, 15) ;
		Photo photo8 = new Photo("Photo 8", "Constantin", 5, 15) ;
		
		article1.addPhoto(photo1) ;
		article1.addPhoto(photo2) ;
		article1.addPhoto(photo3) ;
		
		article2.addPhoto(photo4) ;
		
		article3.addPhoto(photo5) ;
		
		ad1.addPhoto(photo4) ;
		ad1.addPhoto(photo5) ;
		ad1.addPhoto(photo6) ;
		
		ad2.addPhoto(photo6) ;
		ad2.addPhoto(photo7) ;
		
		ad3.addPhoto(photo8) ;
		
		Newspaper nouvelliste = new Newspaper("Nouvelliste", "20.02.2009", 3, 3, 2) ;
		
		nouvelliste.addArticle(article1) ;
		nouvelliste.addArticle(article2) ;
		nouvelliste.addArticle(article3) ;
		nouvelliste.addArticle(article4) ;
		
		nouvelliste.addAd(ad1);
		nouvelliste.addAd(ad2);
		nouvelliste.addAd(ad3) ;

		System.out.println(nouvelliste);
	}
}
