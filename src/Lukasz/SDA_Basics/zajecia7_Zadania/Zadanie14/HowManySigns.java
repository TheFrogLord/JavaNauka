package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie14;

import java.util.Scanner;

public class HowManySigns {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą literkę:");
        char letter1 = sc.next().charAt(0);

        System.out.println("Podaj drugą literkę:");
        char letter2 = sc.next().charAt(0);

        int distabce = Math.abs(letter1 - letter2) - 1;

        System.out.println("Ilość znaków między literami wynosi: " + distabce);
    }


}
