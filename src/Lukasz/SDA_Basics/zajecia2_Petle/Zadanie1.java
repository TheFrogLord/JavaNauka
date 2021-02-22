package Lukasz.SDA_Basics.zajecia2_Petle;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbę całkowitą: ");

            Integer intNumber = scanner.nextInt();
            System.out.println("Twoje liczby to: ");

                for (int i = 2; i < intNumber; i++) {

                if (i % 2 == 0) {
                System.out.print(i + ", ");
            }

        }

    }
}
