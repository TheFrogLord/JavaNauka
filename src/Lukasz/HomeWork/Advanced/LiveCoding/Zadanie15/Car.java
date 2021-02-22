package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie15;

import java.util.Scanner;

public enum Car {
    FERRARI("Ferrari", 48000, 280, 260),
    PORSCHE("Porsche", 38000, 260, 280),
    MERCEDES("Mercedes", 120000, 180, 240),
    BMW("Bmw", 24000, 140, 220),
    TOYOTA("Toyota", 14000, 124, 220),
    RENAULT("Renault", 11000, 110, 180);

    private String name;
    private double price;
    private int power;
    private int maxSpeed;
    Scanner sc = new Scanner(System.in);

    Car(String name, double price, int power, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isPremium() {
        return !isRegular();
    }

    public boolean isRegular() {
        return power < 180;
    }

    public boolean isFasterThan(Car otherCar) {

        //return otherCar.getMaxSpeed() < this.maxSpeed; //pierwszy sposób
        int val = BMW.compareTo(otherCar);
        System.out.println("Czy pojazd " + BMW.getName() + " jest szybszy od "
                + otherCar.getName());
        return val < 0;
    }
}
