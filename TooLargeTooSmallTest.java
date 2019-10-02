

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TooLargeTooSmallTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmallTest
{
    /**
     * Default constructor for test class TooLargeTooSmallTest
     */
    public TooLargeTooSmallTest()
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

    @Test
    public void TestGameRun()
    {
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall();
        assertEquals(true, tooLarge1.run());
    }
}

