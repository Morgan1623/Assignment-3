package Assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class GeometricTest extends Geometric
{
    private Geometric equations;

    @Before
    public void setUp() throws Exception
    {

       equations = new Geometric();
    }

    @Test
    public void perimeterEquality() {
        int result = equations.perimeterSquare(2,2, 2,2);
        Assert.assertEquals(8, result);
    }

    @Test
    public void perimeterIdentity()
    {
        int result = equations.perimeterSquare(2, 2, 2, 2);
        Assert.assertSame(8, result);
    }

    @Test
    public void perimeterFail()
    {
        int result = equations.perimeterSquare(2, 2, 2, 2);
        Assert.assertEquals(2, result);
        Assert.fail("Failing test");
    }

    @Test (timeout = 100)
    public void perimeterTimeout()
    {
        int result = equations.perimeterSquare(2,2,2,2);
        Assert.assertSame(8, result);
    }

    @Ignore
    @Test
    public void volumeDisable()
    {
        int result = equations.perimeterSquare(2,2,2,2);
        Assert.assertEquals(2, result);
    }






}//closes class