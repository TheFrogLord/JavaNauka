package Lukasz.SDA_Basics.zajecia3_Tablice;

public class Zadanie17 {

    public static void main(String[] args) {

        int[][] tab = new int[10][10];

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] row : tab) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();

        }
    }
}
