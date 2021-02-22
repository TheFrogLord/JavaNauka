package Lukasz.SDA_Basics.zajecia2_Petle;

import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String math;

        do {
            System.out.println("Proszę podać działanie:");
            math = sc.nextLine();

            switch (math) {
                case "+":
                    System.out.println("Proszę podać pierwszą liczbę:");
                        double first = sc.nextDouble();
                        sc.nextLine();

                    System.out.println("Proszę podać drugą liczbę");
                        double second = sc.nextDouble();
                        sc.nextLine();

                    System.out.println("Suma wynosi: " + (first + second));
                        break;

                case "-":
                    System.out.println("Proszę podać pierwszą liczbę:");
                        double first1 = sc.nextDouble();
                        sc.nextLine();

                    System.out.println("Proszę podać drugą liczbę");
                        double second1 = sc.nextDouble();
                        sc.nextLine();

                    System.out.println("Różnica wynosi: " + (first1 - second1));
                        break;

                case "*":
                    System.out.println("Proszę podać pierwszą liczbę:");
                        double first2 = sc.nextDouble();
                        sc.nextLine();

                    System.out.println("Proszę podać drugą liczbę");
                        double second2 = sc.nextDouble();
                        sc.nextLine();

                    System.out.println("Iloczyn wynosi: " + (first2 * second2));
                        break;

                case "/":
                    System.out.println("Proszę podać pierwszą liczbę:");
                        double first3 = sc.nextDouble();
                        sc.nextLine();

                    System.out.println("Proszę podać drugą liczbę");
                        double second3 = sc.nextDouble();
                        sc.nextLine();

                        if (second3 != 0) {
                            System.out.println("Iloraz wynosi: " + (first3 / second3));
                        }
                            else {
                                System.out.println("Nie możesz dzielić przez zero.");
                            }
                        break;

                default:
                    System.out.println("Nie ma takiego dzialania");

            }

        } while (!math.equals("x"));

            System.out.println("Wyszedłeś z programu.");
            return;
    }
}
