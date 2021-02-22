package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainEx1 {

    public static void main(String[] args) {
        CarFinder carFinder = new CarFinder();
        List<Car> cars = carFinder.findAll();

        //1. Chcemy wyswietlic na konsoli wszystkie unikalne marki, jakie znajduja sie w liscie samochodow
        cars.stream()
                .map(Car::getProducer)//car -> car.getProducer()
                .distinct()
                .forEach(System.out::println);//producer -> System.out.println(producer)

        //2. Chcemy zapisać do nowej kolekcji wszystkie VW
        List<Car> vwCars = cars.stream()
                .filter(car -> "VW".equalsIgnoreCase(car.getProducer()))
                .collect(Collectors.toList());

        //3. Chcemy znaleźć dowolny samochód o mocy ponad 150KM
        Optional<Car> powerfulCar = cars.stream()
                .filter(car -> car.getHorsePower() > 150)
                .findAny();
        powerfulCar.ifPresent(System.out::println);

        //4. Chcemy wyświetlić listę samochodów ale posortowaną
        cars.stream()
                .sorted(Comparator.comparingInt(Car::getYearOfProduction))
                .forEach(System.out::println);

        //5. Chcemy sprawdzic czy w naszej lisce aut znajduje sie jakis Fiat?
        boolean isThereAnyFiat = cars.stream()
                .anyMatch(car -> "Fiat".equalsIgnoreCase(car.getProducer()));

        //6. Chcemy sprawdzic czy kazdy nasz samochod ma jakies dodatkowe wyposazenie?
        boolean allHaveAdditionalOptions = cars.stream()
                .allMatch(car -> !car.getOptions().isEmpty());
        //.noneMatch(car -> car.getOptions().isEmpty());

        //7. Chcemy policzyc sredni wiek naszego auta
        OptionalDouble averageCarYear = cars.stream()
                .mapToInt(car -> LocalDate.now().getYear() - car.getYearOfProduction())
                .average();
        averageCarYear.ifPresent(avg -> System.out.println("Sredni wiek wynosi " + avg));

        //8. Chcemy wyswietlic sume (unikalnych) opcji wszystkich samochodow
        cars.stream()//stream samochodow
                .map(car -> car.getOptions()) //stream list wyposazenia
                .flatMap(options -> options.stream()) //opeacja stream zmienia listy w strumienie, a flatMap sumuje te strumienie
                .distinct()
                .forEach(System.out::println);

        //9. Chcemy odszukać samochód z najmocniejszym silnikiem
        Optional<Car> mostPowerfulCar = cars.stream()
                .max(Comparator.comparingInt(car -> car.getHorsePower()));

        //10. Policzyć wszystkie auta posiadajace odtwarzacz MP3
        long numberOfCarsWithMp3 = cars.stream()
                .filter(car -> !car.getOptions().contains("MP3"))
                .peek(car -> System.out.println(car.getProducer() + " " + car.getModel()))
                .count();

        //11. Policz silnie liczby 5
        int silnia = IntStream.range(1, 6).reduce(1, (n1, n2) -> n1 * n2);
        System.out.println("Silnia dla liczby 5 wynosi " + silnia);

        //12. Policz sumę mocy wszystkich samochodow
        Integer sumOfHorsePower = cars.stream()
                .map(car -> car.getHorsePower())
                .reduce(0, (hp1, hp2) -> hp1 + hp2);

        //13. Polacz w napis marki i modele wszystkich samochodow
        String allCarsModels = cars.stream()
                .map(car -> car.getProducer() + " " + car.getModel())
                .reduce("", (car1, car2) -> car1 + (car1.isEmpty() ? "" : ", ") + car2);


    }
}
