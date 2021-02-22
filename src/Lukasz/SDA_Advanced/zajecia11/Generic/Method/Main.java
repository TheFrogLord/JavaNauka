package Lukasz.SDA_Advanced.zajecia11.Generic.Method;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate[] dates = {LocalDate.now(),
                LocalDate.parse("2020-12-30"),
                LocalDate.parse("2019-12-31")};

        String[] strings = {"Ala", "ala", "Za"};

        Integer[] numbers = {1, 20, 9, 2};

        System.out.println(ArrayUtils.findMax(dates));
        System.out.println(ArrayUtils.findMax(strings));
        System.out.println(ArrayUtils.findMax(numbers));

        System.out.println(ArrayUtils.findMin(dates));
        System.out.println(ArrayUtils.findMin(strings));
        System.out.println(ArrayUtils.findMin(numbers));

        ArrayUtils.findBigger(numbers, 5);
        System.out.println();
        ArrayUtils.showArray(dates);


    }
}
