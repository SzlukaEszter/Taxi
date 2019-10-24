package com.codecool.driver;

import java.util.List;
import java.util.Random;

public class Driver implements PassangerInfo {
    private String mobileNumber;
    private String name;
    private int age;
    private int salary;
    private List<String> phoneBook;
    private Experience experience;
    private com.codecool.phoneBookManager phoneBookManager;
    private Random random = new Random();



    public Driver(String name, com.codecool.phoneBookManager phoneBookManager) {
        this.name = name;
        this.phoneBookManager = phoneBookManager;
        this.mobileNumber = generateMobileNumber();
        this.age = getRandomInRange(18, 60);
        this.salary = 0;
        this.phoneBook = phoneBookManager.getPhoneBook();
        this.experience = getRandomExperience();
    }

    private String generateMobileNumber(){
        int mobileNumber = getRandomInRange(10000, 100000);
        return String.valueOf(mobileNumber);
    }

    private int getRandomInRange(int min, int max){
        int generated = random.nextInt((max-min)+1)+min;
        return generated;
    }

    private Experience getRandomExperience(){
        Experience [] experiences = Experience.values();
        return experiences[random.nextInt(experiences.length)];
    }

    public int getPassangersPerWeek() {
        return experience.getPassangersPerWeek();
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void updatePhoneBook() {
        phoneBook = phoneBookManager.getPhoneBook();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public List<String> getPhoneBook() {
        return phoneBook;
    }
}
