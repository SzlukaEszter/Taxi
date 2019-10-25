package com.codecool.cars;

import com.codecool.driver.PassangerInfo;

public class GasolineCar extends DrivableCar {

    private int maintenanceCost = 20;
    public static final int COST = 350;


    public GasolineCar(PassangerInfo driver) {
        super(driver);
    }

    public void increaseCost() {
        maintenanceCost += Math.round((float)maintenanceCost * 0.1f);
        System.out.println("current maintenance cost: " + maintenanceCost);
    }

    @Override
    public void beforeSpendWeek() {

    }


    @Override
    public void afterSpendWeek() {
        increaseCost();
    }

    @Override
    public int getIncome() {
        return getPassangersForWeek() - maintenanceCost;
    }
}
