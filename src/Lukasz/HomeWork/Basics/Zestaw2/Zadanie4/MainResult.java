package Lukasz.HomeWork.Basics.Zestaw2.Zadanie4;

import java.util.Scanner;

public class MainResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać hasło:");

        for (; ; ) {

            String password = sc.nextLine();
            boolean resultA = Digit.isValid(password);
            boolean resultB = Letter.isValid(password);
            boolean resultC = UpperLetter.isValid(password);
            boolean resultD = SpecialSign.isValid(password);

            if (!resultA || !resultB || !resultC || !resultD) {
                System.out.println("UWAGA! Twoje hasło powinno zawierać minimum: " +
                        "wielką literę, małą literę, cyfrę i znak specjalny!");
                System.out.println("Spróbuj ponownie: ");

            } else {
                System.out.println("Gratulacje! Twoje nowe hasło to: " + password);
                break;
            }
        }
    }
}
