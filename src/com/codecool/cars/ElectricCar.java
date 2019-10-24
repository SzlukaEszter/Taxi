package com.codecool.cars;

import com.codecool.driver.PassangerInfo;

public class ElectricCar extends DrivableCar {

    private static final int  COST = 400;
    PassangerInfo driver;

    public ElectricCar(PassangerInfo driver) {
        super(driver);
    }

    @Override
    public int getCost() {
        return COST;
    }

    @Override
    public void spendWeek() {}

    @Override
    public int getIncome() {
        return getPassangersForWeek();
    }
}
