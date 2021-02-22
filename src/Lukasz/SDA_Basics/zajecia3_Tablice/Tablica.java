package Lukasz.SDA_Basics.zajecia3_Tablice;

public class Tablica {

    public static void main(String[] args) {

        double[] tablica1 = new double[15]; // [ , , , , , , , , ]

            for (int i = 0; i < tablica1.length; i++) {

                tablica1[i] =  (double) Math.random() * 15 + 5;

                double zmienna = tablica1[i];

                    System.out.print(zmienna + ", ");
        }
                    System.out.println();

    }
}
