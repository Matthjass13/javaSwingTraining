package TravauxPratiques.TP05.Solutions.Shipping;

/**
 * TP Week 5
 * River.java
 * Description: Cargo by river
 * Authors: David Russo
 * Date of creation: 21.03.2011
 * Last update: 
 * 
 */




public class River extends Cargo
{
    public River(int distance)
    {
        super(distance) ;
        
        limit = 300000 ;        
    }
    
    public int cost()
    {
        return distance * total_weight ;
    }
}
