package week1.test;

import org.junit.Before;
import org.junit.Test;

import week1.DollarsAndCentsCounter;

import static org.junit.Assert.assertEquals;

/**
 * Testprogram for Dollars and Cents Counter.
 * Lab Exercise SoftwareSystems
 * @author Jip Spel
 * @version $Revision: 1.0 $
 */
public class DollarsAndCentsCounterTest {
    /** Testvariabele for a <tt>DollarsAndCentsCounter</tt> object. */
    private DollarsAndCentsCounter counter;

    /**
     * Sets the instance variable <tt>counter</tt> to a well-defined initial value.
     */
    @Before
    public void setUp() {
		System.out.println("----setup----");

        counter = new DollarsAndCentsCounter();
        counter.reset();
    }

    /**
     * Test the method <tt>dollars()</tt>
     */
    @Test
    public void testDollars() {
		System.out.println("----testdollars----");

        counter.add(5, 0);
        assertEquals(5, counter.dollars());
        counter.add(0, 100);
        assertEquals(6, counter.dollars());
    }

    /**
     * Test the method <tt>cents()</tt>
     */
    @Test
    public void testCents() {
		System.out.println("----testcents----");

        counter.add(0, 5);
        assertEquals(5, counter.cents());
        counter.add(0, 95);
        assertEquals(0, counter.cents());
    }

    /**
     * Test the method <tt>add(dollars, cents)</tt>
     */
    @Test
    public void testAdd() {
		System.out.println("----testadd----");

        counter.add(0, 10);
        assertEquals(0, counter.dollars());
        assertEquals(10, counter.cents());
        counter.add(2, 95);
        assertEquals(3, counter.dollars());
        assertEquals(5, counter.cents());
    }

    /**
     * Test the method <tt>reset()</tt>
     */
    @Test
    public void testReset() {
		System.out.println("----testreset----");

        counter.add(22, 33);

        counter.reset();
        assertEquals(0, counter.dollars());
        assertEquals(0, counter.cents());
    }
}
