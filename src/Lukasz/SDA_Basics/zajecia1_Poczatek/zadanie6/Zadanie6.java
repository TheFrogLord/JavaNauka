package Lukasz.SDA_Basics.zajecia1_Poczatek.zadanie6;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbę od 1 do 7:");

        Integer dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Mamy poniedziałek");
                break;

            case 2:
                System.out.println("Mamy wtorek");
                break;

            case 3:
                System.out.println("Mamy środę");
                break;

            case 4:
                System.out.println("Mamy czwartek");
                break;

            case 5:
                System.out.println("Mamy piątek");
                break;

            case 6:
                System.out.println("Mamy sobotę");
                break;

            case 7:
                System.out.println("Mamy niedzielę");
                break;

            default:
                System.out.println("Gościu, nie ma takiego dnia tygodnia");
        }


    }
}
