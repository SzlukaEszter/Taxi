package com.codecool.cars;

import java.util.UUID;

public abstract class Car {
    protected UUID id = UUID.randomUUID();

    public abstract int getCost();
    public abstract int getPassangersForWeek();
    public abstract void spendWeek();
    public abstract int getIncome();
}
