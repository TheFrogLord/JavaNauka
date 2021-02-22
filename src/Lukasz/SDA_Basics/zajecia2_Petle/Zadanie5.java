package Lukasz.SDA_Basics.zajecia2_Petle;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbę całkowitą: ");

        int liczba = scanner.nextInt();
        int wykladnik = 0;
        double result = 0;

        while (result < liczba) {
            result = Math.pow(2, wykladnik);
            if (result < liczba) {
                System.out.print(result + ", ");
                wykladnik++;
            }
        }
    }
}
