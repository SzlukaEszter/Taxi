package com.codecool.cars;

import com.codecool.driver.PassangerInfo;

public class ElectricCar extends DrivableCar {

    public ElectricCar(PassangerInfo driver) {
        super(driver);
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
