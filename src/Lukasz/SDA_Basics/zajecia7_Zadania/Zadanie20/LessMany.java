package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie20;

import java.util.Random;
import java.util.Scanner;

public class LessMany {

    Scanner sc = new Scanner(System.in);
    Random number = new Random();

    public void compare(int inputNumber) {

        int random = number.nextInt(100);

        for (; ; ) {

            if (inputNumber == random) {
                System.out.println("Bingo!");
                break;

            } else if (inputNumber > random) {
                System.out.println("Za dużo.");

            } else {
                System.out.println("Za mało.");
            }
            inputNumber = sc.nextInt();
        }
    }
}
