package Lukasz.SDA_Advanced.zajecia12.FunctionalInterfaces.Consumer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<LocalDate> dailyFormattedDateLambda = localDate ->
                System.out.println("Data "
                        + localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

//Który wyświetli kwadrat liczby - consumer
        Consumer<Integer> powNumberLambda = number ->
                System.out.println(number * number);

//Który wyświelti Witam Pana/Witam Panią zależnie czy podane imie konczy sie na a
        Consumer<String> helloLambda = name -> System.out.println(name.endsWith("a") ? "Witam Panią" : "Witam Pana");

//Który wyświetli mi czy liczba jest parzysta
        Consumer<Integer> isOddLambda = number -> System.out.println(number % 2 == 0 ? "Parzysta" : "Nieparzysta");






    }
}
