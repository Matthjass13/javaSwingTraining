package TravauxPratiques.TP05.Solutions.Shipping;

/**
 * TP Week 5
 * Air.java
 * Description: Cargo by air
 * Authors: David Russo
 * Date of creation: 21.03.2011
 * Last update: 
 * 
 */




public class Air extends Cargo
{
    public Air(int distance)
    {
        super(distance) ;
        
        limit = 80000 ;
    }
    
    public int cost() 
    {
        return 10 * distance * total_volume ;
    }
}
