package Lukasz.SDA_Basics.zajecia4_KlasyObiektyMetody.Car;

public class Car {

    private String color;
    private int maxSpeed;
    private String brand;

    public Car(String color, int maxSpeed, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
    // modyfikator widoczności, typ zwracany, nazwa, arg
    public String getColor() {
        return this.color;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getBrand() {
        return this.brand;
    }

    public static class Main {

        public static void main(String[] args) {
            Car newCar = new Car("Red", 120, "BMW" );

            String color = newCar.getColor();
            int maxSpeed = newCar.getMaxSpeed();
            String brand = newCar.getBrand();

            System.out.println(color + ", " + maxSpeed + ", " + brand);



        }

    }
    }



