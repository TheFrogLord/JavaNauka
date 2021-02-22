package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class Apply {
    public static void main(String[] args) {
        Function<LocalDate, String> formatDate = new Function<LocalDate, String>() {
            @Override
            public String apply(LocalDate dateToFormat) {
                return dateToFormat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
        };

        Function<LocalDate, String> formatDateLambda = dateToFormat ->
                dateToFormat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(formatDateLambda.apply(LocalDate.now()));

        Function<String, Integer> lengthOfLongestWord = text -> {
            String[] words = text.split(" ");
            int max = words[0].length();
            for (String word : words) {
                if (word.length() > max) {
                    max = word.length();
                }
            }
            return max;
        };

/*
1. Która zamieni datę na informację który to dzien tygodnia
2. Która zamieni Stringa na datę
3. Która zamieni liczbę na jej pierwiastek kwadratowy, gdy liczba ujemna
    zwróci -1
*/

        //1
        Function<LocalDate, String> weekdayLambda = dateToFormat ->
                dateToFormat.getDayOfWeek().toString();
        System.out.println(weekdayLambda.apply(LocalDate.now()));

        //2
        Function<String, LocalDate> dataLambda = date ->
                LocalDate.parse(date);
        System.out.println(dataLambda.apply("2020-12-10"));

        //3
        Function<Double, Double> sqrLambda = number ->
            Double.valueOf(Math.sqrt(number));

        System.out.println(sqrLambda.apply(24.0));
    }
}
