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

    public Company(int numberOfCars) {
        this.totalPassenger = 0;
        this.budget = 0;
        this.nameGenerator = 1;
        initCars(numberOfCars);
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
        d.setSalary(GasolineCar.COST);
        cars.add(gc);
    }

    private void initElectricCar() {
        Driver d = hireDriver();
        ElectricCar ec = new ElectricCar(d);
        d.setSalary(ElectricCar.COST);
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
        phoneBook.add(d.getMobileNumber());
        drivers.add(d);
        return d;
    }
    @Override
    public List<String> getPhoneBook(){
        return phoneBook;
    }

    private void buyCar(){
        if (budget >= SelfDrivingCar.COST){
            if (new Random().nextBoolean() == true) {
                setSelfDrivingCarsOperational(false);
                initSelfDrivingCar();
                budget -= SelfDrivingCar.COST;
            }
            else {
                initElectricCar();
                budget -= ElectricCar.COST;
            }
        }
    }

    private void setSelfDrivingCarsOperational(boolean operational){
        for (SelfDrivingCar selfDrivingCar : selfDrivingCars) {
            selfDrivingCar.setOperational(operational);
        }
    }

    private void spendWeek() {
        buyCar();
        int ridesPerWeek = 0;
        for (Car car : cars) {
            ridesPerWeek += car.getPassangersForWeek();
            budget += car.getIncome();
            car.afterSpendWeek();
        }
        System.out.println( "Rides: " + ridesPerWeek + " Budget: " + budget + " Cars " + cars.size());
        System.out.println();
        totalPassenger += ridesPerWeek;
    }


    public void rideForWeeks(int weeks) {
        for (int i = 0; i < weeks; i++) {
            System.out.println("Week: " + i);
            spendWeek();
        }
    }

}
