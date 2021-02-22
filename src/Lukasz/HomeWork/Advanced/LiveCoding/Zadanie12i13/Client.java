package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie12i13;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        Manufacturer one = new Manufacturer("Toyota", 1935, "Japan");
        Manufacturer two = new Manufacturer("BMW", 1921, "Germany");
        Manufacturer three = new Manufacturer("Ford", 1918, "USA");
        Car first = new Car("RedArrow", "Sedan", 14000, 2012,
                Arrays.asList(one, two), EngineType.V12);
        Car second = new Car("BlueOne", "Hatchback", 18000, 1997,
                Arrays.asList(three), EngineType.S6);

        CarService carService = new CarService();
        carService.addCar(first);
        carService.addCar(second);
        System.out.println(first.getManufacturerList());

        System.out.println(carService.carsWithV12());
        System.out.println(carService.carsBefore1999(2020));


    }
}
