package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie15;

import java.util.Arrays;
import java.util.Scanner;

public class HowManyNumbers {

    public static void main(String[] args) {

        Counter result = new Counter();
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Proszę podać liczbę");
            int random = sc.nextInt();
            numbers[i] = random;
        }

        Arrays.sort(numbers);

        String duplicates = "";
        int temp = 0; // licznik duplikatu

        int previous = numbers[0] - 1;

        for (int i = 0 ; i < numbers.length ; i++) {

            if (numbers[i] == previous) {
                if (temp == 0) {
                    temp++;
                    duplicates = duplicates.concat(numbers[i] + ", ");
                }

            } else {
                temp = 0;
            }

        }
        System.out.println("Szukane liczby to: " + duplicates);

        result.doubleNumber(numbers);

    }
}

