package Lukasz.SDA_Basics.zajecia2_Petle;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbę całkowitą");

        int number = scanner.nextInt();

        while (number > 0) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
             }
                number -= 1; // lub number--

         }
    }
}
