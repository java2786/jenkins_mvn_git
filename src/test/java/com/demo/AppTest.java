package com.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void nameShouldBeSame()
    {
    	String name = "Arun";
        Assert.assertSame( name, "Arun" );
    }
}
