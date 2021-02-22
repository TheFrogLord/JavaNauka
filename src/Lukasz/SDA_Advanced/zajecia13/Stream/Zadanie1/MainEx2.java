package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainEx2 {

    public static void main(String[] args) {

        CarFinder carFinder = new CarFinder();
        List<Car> cars = carFinder.findAll();

        /**
         * 1. Sprawdź czy najstarszy samochod to tez najslabsze auto? Nie da
         *    sie tego zrobic w ramach jednego lancucha wywolan!
         * 2. Policz ile samochodow jest konkretnej marki - Collectors.groupingBy
         * 3. Policz ile samochodow ma wiecej niz 10 lat
         * 4. Ile samochodow jest starszych od sredniej wieku? Tu tez nie uda
         *    sie zrobic tego jednym wywolaniem
         */

        //1.
        Car oldest = cars.stream().min(Comparator.comparingInt(car -> car.getYearOfProduction())).get();
        Car fastest = cars.stream().min(Comparator.comparingInt(car -> car.getHorsePower())).get();
        System.out.println("Czy najstarszy rowniez najslabszy?: " + oldest.equals(fastest));

        //2.
        Map<String, Long> carsCountedByProducer = cars.stream()
                .collect(Collectors.groupingBy(car -> car.getProducer(), Collectors.counting()));

        //3.
        long carsOlderThanTenYears = cars.stream()
                .filter(car -> LocalDate.now().getYear() - car.getYearOfProduction() > 10).count();

        //4.
    }
}
