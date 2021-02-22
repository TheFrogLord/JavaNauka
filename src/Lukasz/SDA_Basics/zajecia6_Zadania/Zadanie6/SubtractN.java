package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie6;

import java.util.Scanner;

public class SubtractN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proszę podać liczbę:");
        int number = sc.nextInt();

        double result = 0;

        for (int i = 1; i <= number; i++) {
            result += (1 / i);

        }
        System.out.println(result);
    }
}
