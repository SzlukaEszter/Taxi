package com.codecool;

public abstract class DrivableCar extends Car {

    Driver driver;

    public DrivableCar(Driver driver) {
        this.driver = driver;
    }
}
