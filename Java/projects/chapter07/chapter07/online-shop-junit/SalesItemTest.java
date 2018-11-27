import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    private SalesItem salesIte1;
    private SalesItem salesIte2;

    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        salesIte1 = new SalesItem("house", 100000);
        salesIte2 = new SalesItem("car", 1000);
        salesIte2.addComment("jack", "too slow", 3);
        salesIte2.addComment("ben", "too old", 2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Java for complete Idiots", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I learned all my Java from it.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void Testone()
    {
        SalesItem salesIte1 = new SalesItem("horse", 20000);
        assertEquals(true, salesIte1.addComment("gibb", "horse smells", 0));
        assertEquals(true, salesIte1.addComment("jack", "great horse", 4));
        assertEquals(2, salesIte1.getNumberOfComments());
    }

    @Test
    public void testSameAuthor()
    {
        SalesItem salesIte1 = new SalesItem("horse", 200);
        assertEquals(true, salesIte1.addComment("jack", "great horse", 3));
        assertEquals(false, salesIte1.addComment("jack", "horse smells", 1));
    }

    @Test
    public void NegativeBound()
    {
        SalesItem salesIte1 = new SalesItem("jack", 100);
        assertEquals(false, salesIte1.addComment("jack", "horse smells", 0));
    }

    @Test
    public void helpfulComment()
    {
        SalesItem salesIte1 = new SalesItem("house", 200);
        assertEquals(true, salesIte1.addComment("jack", "loved it", 5));
        assertEquals(true, salesIte1.findMostHelpfulComment());
        assertEquals(true, salesIte1.getNumberOfComments());
        salesIte1.removeComment(0);
        assertEquals(true, salesIte1.getNumberOfComments());
        salesIte1.upvoteComment(0);
    }

    @Test
    public void testRATING()
    {
        SalesItem salesIte3 = new SalesItem("car", 1000);
        assertEquals(false, salesIte3.addComment("andi", "i liked the car", 0));
    }
}







