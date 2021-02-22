package Lukasz.HomeExercises.Zadania_spoj;

import java.util.Scanner;

public class Macierz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); //liczba wierszy
        int n = sc.nextInt(); //liczba kolumn

        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[][] arrayExit = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayExit[i][j] = array[j][i];
                System.out.print(arrayExit[i][j] + " ");
            }
            System.out.println();

        }
    }
}
