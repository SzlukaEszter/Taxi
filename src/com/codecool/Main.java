package com.codecool;

import com.codecool.cars.GasolineCar;
import com.codecool.driver.Driver;

public class Main {

    public static void main(String[] args) {
	    Company company = new Company();
	    company.rideForWeeks(52);
	    int totalPassangers = company.getTotalPassenger();
        System.out.println("Passangers deliverd in a year: " + totalPassangers);


    }

}
