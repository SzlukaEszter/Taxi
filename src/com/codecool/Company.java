package com.codecool;

import com.codecool.cars.Car;
import com.codecool.cars.ElectricCar;
import com.codecool.cars.GasolineCar;
import com.codecool.cars.SelfDrivingCar;
import com.codecool.driver.Driver;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Driver> drivers = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<SelfDrivingCar> selfDrivingCars = new ArrayList<>();
    private int totalPassenger;
    private int budget;

    public Company() {
        this.totalPassenger = 0;
        this.budget = 0;
        initCars(3);
    }

    public int getTotalPassenger() {
        return totalPassenger;
    }

    private void initCars(int numberOfCars){
        for (int i = 0; i < numberOfCars; i++) {
            initGasolineCar();
            initElectricCar();
            initSelfDrivingCar();
        }

    }

    private void initGasolineCar() {
        Driver d = hireDriver();
        GasolineCar gc = new GasolineCar(d);
        cars.add(gc);
    }

    private void initElectricCar() {
        Driver d = hireDriver();
        ElectricCar ec = new ElectricCar(d);
        cars.add(ec);

    }

    private void initSelfDrivingCar() {
        SelfDrivingCar sc = new SelfDrivingCar();
        cars.add(sc);
        selfDrivingCars.add(sc);
    }

    private Driver hireDriver() {
        Driver d = new Driver();
        drivers.add(d);
        return d;
    }

    public List<String> getPhoneBook(){
        return null;
    }

}
