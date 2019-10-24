package com.codecool;

import com.codecool.cars.GasolineCar;
import com.codecool.driver.Driver;

public class Main {

    public static void main(String[] args) {
	    Company company = new Company();
	    int totalPassangers = company.getRidesForWeeks(52);
        System.out.println(totalPassangers);


    }

}
