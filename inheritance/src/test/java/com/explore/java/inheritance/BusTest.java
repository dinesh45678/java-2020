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

    // camel case
    @Test
    public void testAccess()
    {
        Bus bus = new Bus("bus222", 10);
        // bus.name - no access
        // bus.numberOfWheels - no acess
        Assert.assertEquals(bus.getNumberOfWheels(), 10);
        Assert.assertEquals(bus.getName(), "bus222");
    }
}

