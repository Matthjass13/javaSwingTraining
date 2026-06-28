package TravauxPratiques.TP02.Solutions.circle;
/**
 * TP 2
 * Exercise W2Q3 � 1
 * 
 * Class: Circle_Correct.java 
 * Description: classDescription 
 * Autor: Sabine Mathieu
 * 
 * Date of creation: 1 mars 2010 
 * Last update: 1 mars 2010
 */
 
import java.util.Scanner;

public class Circle_Correct {
	
	private int x ;
	private int y ;	
	private int radius ;
	final double pi = Math.PI ;
	Scanner input = new Scanner(System.in) ;
	
	public Circle_Correct(int x, int y, int radius){
		this.x = x ;
		this.y = y ;
		this.radius = radius ;
	}
	
	public boolean compare(Circle_Correct other){
		if(this.x == other.x && this.y == other.y && this.radius == other.radius)
			return true ;

		return false ;
	}
	
	public void lireCercle(){
		System.out.println("x : ");
		x = input.nextInt() ;
		System.out.println("y : ");
		y = input.nextInt()  ;
		System.out.println("Radius : ");
		radius = input.nextInt()  ;
	}
	
	public void readcircle(int nX, int nY, int nR){
		x = nX ; y = nY ; radius = nR ;
	}
	
	public void move(int nX, int nY){
		if (nX > 0)
			x = nX ;
		
		if (nY > 0)
			y = nY ;
	}
	
	public void setradius(int NewRadius){
		radius = NewRadius ;
	}
	
	public void display(){
		System.out.println("Value of x and y : (" + x + ","  + y + ")" ) ;
		System.out.println("Radius : " + radius);
	}	
	
	public double perimeter(){
		return 2*pi*radius ;
	}	
	
	public String toString(){
		return "Value of x and y : (" + x + ","  + y + ")\nRadius: " + radius ;
	}
}
