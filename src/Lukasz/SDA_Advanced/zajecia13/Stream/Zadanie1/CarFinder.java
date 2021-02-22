package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarFinder {

    private List<Car> cars = new ArrayList<>();

    public CarFinder() {
        cars.add(new Car("Ford", "Focus",
                2018, 200, Arrays.asList("MP3", "climatronic", "GPS")));
        cars.add(new Car("VW", "Golf",
                2014, 140, Arrays.asList("GPS", "leather")));
        cars.add(new Car("VW", "Passat",
                2010, 170, Arrays.asList("MP3", "climatronic")));
        cars.add(new Car("Opel", "Astra",
                2016, 110, Arrays.asList("climatronic")));
        cars.add(new Car("Kia", "Ceed",
                2005, 90, Arrays.asList("MP3")));
        cars.add(new Car("Renault", "Laguna",
                2002, 130, Collections.emptyList()));
    }
    public List<Car> findAll() {
        return cars;
    }
}
