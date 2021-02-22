package Lukasz.HomeExercises.Zadania_spoj;

import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int nSilnia = 1;
        int D = sc.nextInt();

        while (D > 0) {
            int number = Integer.parseInt(sc.nextLine());

            for (int j = 1; j <= number; j++) {
                nSilnia = nSilnia * j;
            }
            System.out.println(nSilnia % 100 / 10 + " " + nSilnia % 10);
            nSilnia = 1;
            D--;
        }
    }
}
