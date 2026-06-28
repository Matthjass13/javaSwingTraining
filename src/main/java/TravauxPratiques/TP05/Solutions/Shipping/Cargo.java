package TravauxPratiques.TP05.Solutions.Shipping;

/**
 * TP Week 5
 * Cargo.java
 * Description: Mother's class
 * Authors: David Russo
 * Date of creation: 21.03.2011
 * Last update: 
 * 
 */




public class Cargo
{
    private Merchandise merchandises[] = new Merchandise[16] ;
    private int id_next=0 ;
    protected int distance=0 ;
    protected int limit=0 ;
    protected int total_volume=0 ;
    protected int total_weight=0 ;

    public Cargo(int distance)
    {
        this.distance = distance ;
    }
    
    public void add(Merchandise m)
    {

        if (id_next == 16) 
            return ;    // no more place in merchandises[]
            
                        // add merchandise
        merchandises[id_next] = m ;
                        // increase values
        total_weight += merchandises[id_next].weight() ;
        total_volume += merchandises[id_next].volume() ;
        
        if (cost() <= limit) 
            id_next++ ; // limit isn't reached, id_next++ is the next place for a new merchandise
        else
            {           // limit exceeded, decrease values
            total_weight -= merchandises[id_next].weight() ;
            total_volume -= merchandises[id_next].volume() ;
                        // remove the merchandise
            merchandises[id_next] = null ;
            }
    }
    
    public int cost() 
    {
        // never called by derived objects (abstract)
        return -1 ;        
    }
}
