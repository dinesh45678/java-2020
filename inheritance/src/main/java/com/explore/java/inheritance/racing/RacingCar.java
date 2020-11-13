package com.explore.java.inheritance.racing;

import com.explore.java.inheritance.Car;

public class RacingCar extends Car {

    public RacingCar(String name, int numberOfWheels) {
        super(name, numberOfWheels);
        // can  access protected variable
        System.out.println(this.keyName);
    }

    public RacingCar(String name, int numberOfWheels, String engineName) {
        super(name, numberOfWheels, engineName);
    }

    public RacingCar(String name, int numberOfWheels, String engineName, String keyName) {
        super(name, numberOfWheels, engineName, keyName);
    }
}
