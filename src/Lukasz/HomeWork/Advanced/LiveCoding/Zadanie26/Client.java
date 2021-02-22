package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie26;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        List<Model> models = new ArrayList<>();

        Car one = new Car("Susie", "Fantastic", CarType.CABRIO);
        Car two = new Car("Mac", "Shit", CarType.SEDAN);
        Car three = new Car("Lolypop", "Metallic", CarType.COUPE);

        Model first = new Model("Passat", 1981, cars);
        first.addCar(one);
        first.addCar(two);
        first.addCar(three);

        System.out.println(first.getCars());

        Manufacturer manufacturer1 = new Manufacturer("Opel", 1925, models);
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1912, models);
        Manufacturer manufacturer3 = new Manufacturer("Renault", 1958, models);

        Manufacturer.getManufacturerName();

    }
}
