package Lukasz.SDA_Advanced.zajecia10.Dziedziczenie;

public class Vehicle {

    private int numberOfWheels;
    private String fuelType;
    protected String manufacturer;

    public Vehicle(int numberOfWheels, String fuelType, String manufacturer) {
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.manufacturer = manufacturer;
    }

    public void showDescription() {
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public void run() {
        System.out.println("Vehicle started");
    }
}
