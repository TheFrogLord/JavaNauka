package Lukasz.SDA_Advanced.zajecia10.Dziedziczenie;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4, "diesel", "Opel", 5, "sedan");

        Vehicle vehicle = new Vehicle(2, "human", "Romet");

        vehicle.showDescription();
        car.showDescription();

        vehicle.run();
        car.run();

        //vehicle.switchOnEngine(); - nie da się bo to klasa car dziedziczy po klasie vehicle
        car.switchOnEngine();
    }
}
