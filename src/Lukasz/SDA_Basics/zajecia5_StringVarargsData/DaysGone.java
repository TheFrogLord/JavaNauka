package Lukasz.SDA_Basics.zajecia5_StringVarargsData;

import java.time.LocalDate;
import java.util.Scanner;

public class DaysGone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać liczbę dni:");
        int daysNumber = sc.nextInt();

        LocalDate futureDate = LocalDate.now().plusDays(daysNumber);
        System.out.println("After " + daysNumber + " days will be " + futureDate.getMonth());
    }
}
