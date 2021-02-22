package Lukasz.SDA_Basics.zajecia3_Tablice;

public class Zadanie16 {

    public static void main(String[] args) {

        double[][] tab = new double[4][5];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

            tab[0][2] = 2.25;
            tab[2][3] = -3;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();

        }
    }
}
