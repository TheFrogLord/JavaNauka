package Lukasz.SDA_Basics.zajecia2_Petle;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proszę podać literę lub znak:");
        String sign = sc.nextLine();

        /* do {
            System.out.println("Proszę podać kolejną literę lub znak:");
            String sign1 = sc.nextLine();
            sign = sign1;

        } while (!sign.equals("x"));
            System.out.println("Podałeś x więc koniec programu");
            return;


        while (!sign.equals("x")) {
            System.out.println("Proszę podać kolejną literę lub znak:");
            String sign1 = sc.nextLine();
            sign = sign1;
        }
        System.out.println("Podałeś znak (x), więc program się zamyka.");

         */
        for ( ; ; ) {
            if (!sign.equals("x")) {
                System.out.println("Proszę podać kolejną literę lub znak:");
                String sign1 = sc.nextLine();
                sign = sign1;
            }
            else {
                System.out.println("Wpisałeś literę (x). Program zakończony.");
                break;
            }

        }
    }
}
