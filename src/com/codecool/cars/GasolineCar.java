package com.codecool.cars;

import com.codecool.driver.Driver;

public class GasolineCar extends DrivableCar {

    private int maintenanceCost = 10;
    private static final int COST = 350;


    public GasolineCar(Driver driver) {
        super(driver);
    }

    public void increaseCost() {
        maintenanceCost += Math.round((float)maintenanceCost * 0.1f);
        System.out.println("current maintenacne cost: " + maintenanceCost);
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
