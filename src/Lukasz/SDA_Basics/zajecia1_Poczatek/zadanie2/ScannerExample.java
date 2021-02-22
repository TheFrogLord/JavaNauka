package Lukasz.SDA_Basics.zajecia1_Poczatek.zadanie2;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać imię: ");
        String imie = scanner.nextLine();

        System.out.println("Proszę podać nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.println("Proszę podać wiek: " );
        int wiek = scanner.nextInt();

        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);

            if (wiek > 30) {
                System.out.println("Gościu jesteś stary, twój wiek to: " + wiek + " lat");
            }
            else {
                System.out.println("Wiek: " + wiek);
            }

    }
}
