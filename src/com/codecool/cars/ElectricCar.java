package com.codecool.cars;

import com.codecool.driver.Driver;

public class ElectricCar extends DrivableCar {

    public ElectricCar(Driver d) {
        super(d);
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public int getPassangersForWeek() {
        return 0;
    }

    @Override
    public void spendWeek() {

    }

    @Override
    public int getIncome() {
        return 0;
    }
}
