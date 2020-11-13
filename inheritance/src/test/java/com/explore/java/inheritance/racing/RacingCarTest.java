package com.explore.java.inheritance.racing;

import org.junit.Assert;
import org.junit.Test;

public class RacingCarTest {

    @Test
    public void testConstructor() {
        RacingCar racingCar = new RacingCar("rCar", 4);
        Assert.assertEquals(racingCar.getNumberOfWheels(), 4);
        Assert.assertEquals(racingCar.getName(), "rCar");
        RacingCar racingCar2 = new RacingCar("car22", 4, "racingEngine");
        Assert.assertEquals(racingCar2.getNumberOfWheels(), 4);
        Assert.assertEquals(racingCar2.getName(), "car22");
        // access default field of RacingCar - engineName
        Assert.assertEquals(racingCar2.getEngineName(), "racingEngine");
    }

    @Test
    public void testAccess() {
        RacingCar racingCar = new RacingCar("rCar", 4, "racingEngine", "racingKey");
        // racingCar.keyName :  error since RacingCarTest is not extending Car
        Assert.assertEquals(racingCar.getNumberOfWheels(), 4);
        Assert.assertEquals(racingCar.getName(), "rCar");
        Assert.assertEquals(racingCar.getEngineName(), "racingEngine");
        Assert.assertEquals(racingCar.getKeyName(), "racingKey");
    }
}
