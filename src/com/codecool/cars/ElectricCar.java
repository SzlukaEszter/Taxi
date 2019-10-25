package com.codecool.cars;

import com.codecool.driver.PassangerInfo;

public class ElectricCar extends DrivableCar {

    public static final int  COST = 400;
    PassangerInfo driver;

    public ElectricCar(PassangerInfo driver) {
        super(driver);
    }

    @Override
    public void afterSpendWeek() {

    }

    @Override
    public int getIncome() {
        return getPassangersForWeek();
    }
}
