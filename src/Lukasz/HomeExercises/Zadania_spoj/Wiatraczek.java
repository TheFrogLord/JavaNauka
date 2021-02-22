package Lukasz.HomeExercises.Zadania_spoj;

import java.util.Scanner;

public class Wiatraczek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            n = sc.nextInt();
            sc.nextLine();

            if (n > 0) {
                Wiatraczek.rightSpin(n);
                System.out.println();
            } else if (n < 0) {
                Wiatraczek.leftSpin(Math.abs(n));
                System.out.println();
            } else {
                return;
            }
        }
    }

    public static void rightSpin(int n) {
        int k = n * 2 - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j <= i || j == n
                        || (j >= n && j <= k)) {
                    System.out.print('*');
                } else {
                    System.out.print('.');
                }
            }
            k--;
            System.out.println();
        }

        k = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j >= i + n || j == n - 1
                        || (j < n && j >= k)) {
                    System.out.print('*');
                } else {
                    System.out.print('.');
                }
            }
            k--;
            System.out.println();
        }
    }

    public static void leftSpin(int n) {
        int k = n * 2 - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j < i || (j >= n && j < k)) {
                    System.out.print('.');
                } else {
                    System.out.print('*');
                }
            }
            k--;
            System.out.println();
        }

        k = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j > i + n || (j < n && j > k)) {
                    System.out.print('.');
                } else {
                    System.out.print('*');
                }
            }
            k--;
            System.out.println();
        }
    }
}
