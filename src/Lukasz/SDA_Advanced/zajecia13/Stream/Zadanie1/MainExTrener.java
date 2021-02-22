package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MainExTrener {

    public static void main(String[] args) {
        CarFinder carFinder = new CarFinder();
        List<Car> cars = carFinder.findAll();

        //1. Sprawdź czy najstarszy samochod to tez najslabsze auto? Nie da
        //sie tego zrobic w ramach jednego lancucha wywolan!
        Optional<Car> mostWeakCar = cars.stream()
                .min(Comparator.comparingInt(car -> car.getHorsePower()));
        Optional<Car> oldestCar = cars.stream()
                .min(Comparator.comparingInt(car -> car.getYearOfProduction()));
        if (mostWeakCar.equals(oldestCar) &&
                mostWeakCar.isPresent() && oldestCar.isPresent()) {
            System.out.println("Najstarze auto jest najslabsze");
        }

        //2. Policz ile samochodow jest konkretnej marki - Collectors.groupingBy
        Map<String, Long> carsCountedByProducer = cars.stream()
                .collect(Collectors.groupingBy(car -> car.getProducer(), Collectors.counting()));
        
        //3. Policz ile samochodow ma wiecej niz 10 lat
        long countOlderThan10Years = cars.stream()
                .filter(car -> LocalDate.now().getYear() - car.getYearOfProduction() > 10)
                .count();


        //4. Ile samochodow jest starszych od sredniej wieku? Tu tez nie uda
        //sie zrobic tego jednym wywolaniem
        OptionalDouble averageCarYear = cars.stream()
                .mapToInt(car -> LocalDate.now().getYear() - car.getYearOfProduction())
                .average();

        averageCarYear.ifPresent(avg -> {
           long olderThanAvg = cars.stream()
                   .filter(car -> LocalDate.now().getYear() - car.getYearOfProduction() > avg)
                   .count();
            System.out.println("Mamy " + olderThanAvg + " aut starszych od sredniej wieku");
        });
    }
}
