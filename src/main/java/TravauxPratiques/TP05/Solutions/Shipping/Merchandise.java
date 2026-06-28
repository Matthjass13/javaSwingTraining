package TravauxPratiques.TP05.Solutions.Shipping;

/**
 * TP Week 5
 * Merchandise.java
 * Description: 
 * Authors: David Russo
 * Date of creation: 21.03.2011
 * Last update: 
 * 
 */




public class Merchandise {
    private int weight;
    private int volume; 
    
    public Merchandise(int weight, int volume)
    {
        this.weight = weight;
        this.volume = volume; 
    }
    
    public int weight ()
    {   //return the weight in kg
        return weight; 
    }   
    
    public int volume ()
    {   // return volume in dm3
        return volume;
    } 
}

