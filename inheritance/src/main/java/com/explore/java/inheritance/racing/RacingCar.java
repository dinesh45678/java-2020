package com.explore.java.inheritance.racing;

import com.explore.java.inheritance.Car;
import com.explore.java.inheritance.MyException;

public class RacingCar extends Car {

    public RacingCar(String name, int numberOfWheels) {
        super(name, numberOfWheels);
        // can  access protected variable
        System.out.println(this.keyName);
        if (this.getNumberOfWheels() > 10 || super.getNumberOfWheels() <2) {
            throw new MyException("no.of wheels should be between  in the range of 2 to 10");
        }
        System.out.println("Successfully created the instance  of RacingCar with name: {"+ name + "} and no.of wheels: {"+ numberOfWheels);
    }

    public RacingCar(String name, int numberOfWheels, String engineName) {
        super(name, numberOfWheels, engineName);
    }

    public RacingCar(String name, int numberOfWheels, String engineName, String keyName) {
        super(name, numberOfWheels, engineName, keyName);
    }
}
