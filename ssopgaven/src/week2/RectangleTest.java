package week2;

import org.junit.Before;
import org.junit.Test;


import week2.Rectangle;

import static org.junit.Assert.assertEquals;


/**
 * Testprogram for Rectangle.
 * Lab Exercise SoftwareSystems
 * @author Stephan B
 * @version 1
 */
public class RectangleTest {
    private Rectangle vierkantje;
    private Rectangle foutVierkantje;

     /**
     * 
     */
    @Before
    public void init(){
    vierkantje = new Rectangle(1,1);
     }

    
     /**
     */
    @Test(expected = AssertionError.class)	
    public void testConstructor() {
        foutVierkantje = new Rectangle(-1,1);
        foutVierkantje = new Rectangle(1,-1);
        foutVierkantje = new Rectangle(-1,-1);
        foutVierkantje = new Rectangle(0,0);
        foutVierkantje = new Rectangle(1,0);
        foutVierkantje = new Rectangle(0,1);
        foutVierkantje = new Rectangle(-1,0);
        foutVierkantje = new Rectangle(0,-1);
        foutVierkantje = new Rectangle(1,1);
  }

    /**
     */
    @Test
    public void testQueries() {
        assertEquals(1, vierkantje.width());
        assertEquals(1, vierkantje.length());
        assertEquals(1, vierkantje.area());
        assertEquals(4, vierkantje.perimeter());
    }

}
