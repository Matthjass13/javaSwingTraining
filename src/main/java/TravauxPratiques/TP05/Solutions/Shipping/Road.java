package TravauxPratiques.TP05.Solutions.Shipping;

/**
 * TP Week 5
 * Road.java
 * Description: Cargo by Road
 * Authors: David Russo
 * Date of creation: 21.03.2011
 * Last update: 
 * 
 */


public class Road extends Cargo
{
    public Road(int distance)
    {
        super(distance) ;
        
        limit = 38000 ;
    }
    
    public int cost()
    {
        return 4 * distance * total_weight ;
    }
}
