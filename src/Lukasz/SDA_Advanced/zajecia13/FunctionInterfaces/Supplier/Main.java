package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Supplier;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate> dateYearFromNow = new Supplier<LocalDate>() {
            @Override
            public LocalDate get() {
                return LocalDate.now().plusYears(1);
            }
        };
        Supplier<LocalDate> dateYearFromNowLambda = () -> LocalDate.now().plusYears(1);
        System.out.println(dateYearFromNowLambda.get());


        Supplier<String> generateRandomString = () -> {
            Random random = new Random();
            StringBuilder randomString = new StringBuilder();
            for (int i = 0; i < random.nextInt(9) + 1; i++) {
                randomString.append((char) random.nextInt(255));
            }
            return randomString.toString();
        };
        System.out.println(generateRandomString.get());

        /*
        1. Który wylosuje liczbę parzystą
        2. Który wytworzy datę 21 marca z losowym rokiem
        3. Który stworzy nam Stringa składającego się z infomracji o tym,
           który mamy dzień roku - Dziś mamy 5 dzień roku
         */

        //1.
        Random random = new Random();
        Supplier<Integer> oddNumberLambda = () -> random.nextInt() * 2;

        System.out.println(oddNumberLambda.get());

        //2.
        Supplier<LocalDate> randomYearLambda = () -> LocalDate.of(random.nextInt(2025), 3, 21);
        System.out.println(randomYearLambda.get());

        //3.
        Supplier<String> whatDayOfYear = () -> String.format("Dzis mamy %d dzien roku",
                LocalDate.now().getDayOfYear());

        System.out.println(whatDayOfYear.get());
    }

}
