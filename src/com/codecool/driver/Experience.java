package com.codecool.driver;

public enum Experience {

    BEGINNER(15),
    ADVANCED(25),
    PROFESSIONAL(40);

    private int PassangersPerWeek;


    Experience(int passangersPerWeek){
        this.PassangersPerWeek = passangersPerWeek;
    }

    public int getPassangersPerWeek() {
        return PassangersPerWeek;
    }
}
