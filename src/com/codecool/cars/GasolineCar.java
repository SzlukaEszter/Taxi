package com.codecool.cars;

import com.codecool.driver.PassangerInfo;

public class GasolineCar extends DrivableCar {

    private int maintenanceCost = 20;
    private static final int COST = 350;


    public GasolineCar(PassangerInfo driver) {
        super(driver);
    }

    public void increaseCost() {
        maintenanceCost += Math.round((float)maintenanceCost * 0.1f);
        System.out.println("current maintenance cost: " + maintenanceCost);
    }

    @Override
    public int getCost() {
        return COST;
    }

    @Override
    public int getPassangersForWeek() {
        return driver.getPassangersPerWeek();
    }

    @Override
    public void spendWeek() {
        increaseCost();
    }

    @Override
    public int getIncome() {
        return getPassangersForWeek() - maintenanceCost;
    }
}
