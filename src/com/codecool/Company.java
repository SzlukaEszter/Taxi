package com.codecool;

import com.codecool.cars.Car;
import com.codecool.cars.ElectricCar;
import com.codecool.cars.GasolineCar;
import com.codecool.cars.SelfDrivingCar;
import com.codecool.driver.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company implements phoneBookManager{

    private List<Driver> drivers = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<SelfDrivingCar> selfDrivingCars = new ArrayList<>();
    private int totalPassenger;
    private int budget;
    private int nameGenerator;
    private List<String> phoneBook = new ArrayList<>();

    public Company() {
        this.totalPassenger = 0;
        this.budget = 0;
        this.nameGenerator = 1;
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
        d.setSalary(gc.getCost());
        cars.add(gc);
    }

    private void initElectricCar() {
        Driver d = hireDriver();
        ElectricCar ec = new ElectricCar(d);
        d.setSalary(ec.getCost());
        cars.add(ec);

    }

    private void initSelfDrivingCar() {
        SelfDrivingCar sc = new SelfDrivingCar();
        cars.add(sc);
        selfDrivingCars.add(sc);
    }

    private Driver hireDriver() {
        Driver d = new Driver("DeNiro" + nameGenerator, this::getPhoneBook);
        nameGenerator++;

        // TODO save number to phonebook Done
        phoneBook.add(d.getMobileNumber());
        drivers.add(d);
        return d;
    }
    @Override
    public List<String> getPhoneBook(){
        // TODO done
        return phoneBook;
    }

    private void buyCar(){
        // TODO Done
        if (budget >= SelfDrivingCar.COST){
            if (new Random().nextBoolean() == true) {
                initSelfDrivingCar();
            }
            else {
                initElectricCar();
            }
        }
    }

    private void setSelfDrivingCarsOperational(boolean operational){
        // TODO
        for (SelfDrivingCar selfDrivingCar : selfDrivingCars) {
            selfDrivingCar.setOperational(operational);
        }
    }

    public int getRidesForWeeks(int weeks) {
        // TODO
        return 0;
    }

}
