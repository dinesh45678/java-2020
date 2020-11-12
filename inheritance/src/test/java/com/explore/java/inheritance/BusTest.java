package com.explore.java.inheritance;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class BusTest
{

    @Test
    public void testConstructor()
    {
        Bus bus = new Bus("bus111", 6);
        Assert.assertEquals(bus.getNumberOfWheels(), 6);
        Assert.assertEquals(bus.getName(), "bus111");
    }
}

