package com.explore.java.inheritance;

public class Bus extends Vehicle{
    public Bus(String name, int numberOfWheels) throws CheckedException {
        super(name, numberOfWheels);
        if(name == null || name.length() < 4) {
            throw new CheckedException();
        }
    }
}
