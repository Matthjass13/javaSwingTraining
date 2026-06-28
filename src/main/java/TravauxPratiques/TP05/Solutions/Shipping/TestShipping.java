package TravauxPratiques.TP05.Solutions.Shipping;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TP Week 5
 * TestShipping.java
 * Description: Testing class
 * Authors: David Russo
 * Date of creation: 21.03.2011
 * Last update: 
 * 
 */
public class TestShipping extends junit.framework.TestCase
{
    /**
     * Default constructor for test class TestShipping
     */
    public TestShipping()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }
    
    public void testShipping()
    {
        Merchandise m1 = new Merchandise(1, 1) ;
        Merchandise m2 = new Merchandise(1, 1) ;
        Merchandise m3 = new Merchandise(1, 1) ;
        
        Air a = new Air(100) ;
        assertEquals(0, a.cost()) ;
        a.add(m1) ;
        assertEquals(1000, a.cost()) ;
        
        for (int i=0 ; i<20 ; i++)
            a.add(new Merchandise(1,1)) ;
            
        assertEquals(16000, a.cost()) ;
        
        River c = new River(100) ;
        assertEquals(0, c.cost()) ;        
        c.add(m2) ;
        assertEquals(100, c.cost()) ;

        Road r = new Road(100) ;
        assertEquals(0, r.cost()) ;
        r.add(m3) ;
        assertEquals(400, r.cost()) ;
        
        r.add(new Merchandise(99999, 99999)) ;
        assertEquals(400, r.cost()) ;
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
}
