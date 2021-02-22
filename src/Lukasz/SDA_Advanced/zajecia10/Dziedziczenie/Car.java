package Lukasz.SDA_Advanced.zajecia10.Dziedziczenie;

public class Car extends Vehicle {

    private int numberOfSeats;
    private String carType;

    public Car(int numberOfWheels, String fuelType, String manufacturer, int numberOfSeats, String carType) {
        //bardzo ważne: zbędne jeżeli dziedziczymy konstruktor bezparametrowy
    super(numberOfWheels, fuelType, manufacturer);
    this.numberOfSeats = numberOfSeats;
    this.carType = carType;
    }

    public void switchOnEngine() {
        System.out.println("Engine started");
    }

    public void run() {
        switchOnEngine();
        System.out.println(manufacturer + "started");
    }

    public void showDescription() {
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Car type: " + carType);
        super.showDescription();

    }
}
