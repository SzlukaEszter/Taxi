package com.codecool.cars;

import com.codecool.driver.Driver;

public abstract class DrivableCar extends Car {

    protected Driver driver;

    public DrivableCar(Driver driver) {
        this.driver = driver;
    }
}
