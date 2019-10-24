package com.codecool.cars;

import com.codecool.driver.Driver;
import com.codecool.driver.PassangerInfo;

public abstract class DrivableCar extends Car {

    protected PassangerInfo driver; // TODO interface type

    public DrivableCar(PassangerInfo driver) {
        this.driver = driver;
    }

    @Override
    public int getPassangersForWeek() {
        return driver.getPassangersPerWeek();
    }
}
