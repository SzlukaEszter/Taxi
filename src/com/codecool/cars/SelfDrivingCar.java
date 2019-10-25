package com.codecool.cars;

import com.codecool.cars.Car;

public class SelfDrivingCar extends Car {
    public static final int COST = 740;
    private boolean isOperational;
    private final int passangersPerWeek = 70;

    public SelfDrivingCar() {
        super();
        this.isOperational = true;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    @Override
    public int getPassangersForWeek() {
        return passangersPerWeek;
    }

    @Override
    public void beforeSpendWeek() {

    }

    @Override
    public void afterSpendWeek() {
        setOperational(true);
    }

    @Override
    public int getIncome() {
        return passangersPerWeek;
    }
}
