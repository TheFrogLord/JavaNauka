package Lukasz.HomeWork.Basics.Zestaw1.Zadanie5;

import java.util.Scanner;

public class MoreLess {

    public static void main(String[] args) {

        System.out.println("Prosze podać liczbę od 1 do 100:");

        for (; ; ) {

            int number = inputNumber();
            boolean cond1 = isBigger(number);
            boolean cond2 = isSmaller(number);

            if (cond1) {
                System.out.println("Nie trafiłeś, podaj mniejszą liczbę:");
            } else if (cond2) {
                System.out.println("Nie trafiłeś, podaj większą liczbę:");
            } else {
                System.out.println("Super, trafiłeś.");
                break;
            }
        }
    }

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean isBigger(int number) {
        double random = Math.round(Math.random() * 99 + 1);

        return number > random;
    }

    public static boolean isSmaller(int number) {
        double random = Math.round(Math.random() * 99 + 1);

        return number < random;
    }
}
