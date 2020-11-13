package com.explore.java.inheritance;

public class Car extends Vehicle{

    // default scope
    String engineName;

    protected String  keyName;

    public Car(String name, int numberOfWheels) {
        super(name, numberOfWheels);
    }

    public Car(String name, int numberOfWheels, String engineName) {
        super(name, numberOfWheels);
        this.engineName = engineName;
    }

    public Car(String name, int numberOfWheels, String engineName, String keyName) {
        super(name, numberOfWheels);
        this.engineName = engineName;
        this.keyName = keyName;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
}
