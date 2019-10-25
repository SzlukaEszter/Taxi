package com.codecool.cars;

import java.util.UUID;

public abstract class Car {
    protected UUID id = UUID.randomUUID();

    public abstract int getPassangersForWeek();
    public abstract void beforeSpendWeek();
    public abstract void afterSpendWeek();
    public abstract int getIncome();
}
