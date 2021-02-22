package Lukasz.HomeWork.Advanced.Exceptions.Zadanie1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        for (; ; ) {
            scanner.nextInt();
            if (!scanner.hasNextInt()) {
                throw new IllegalValueType();

            } else {
                System.out.println("Ok");
            }
        }
    }
}
