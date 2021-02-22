package Lukasz.SDA_Basics.zajecia2_Petle;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę podać liczbę gałązek: ");
            int numberOfStars = scanner.nextInt();

            for(int i = 1; i <= numberOfStars; i++) {

                for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
