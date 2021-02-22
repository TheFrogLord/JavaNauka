package Lukasz.SDA_Basics.zajecia3_Tablice;

public class Zadanie11 {
    public static void main(String[] args) {

        int[] tab = {2, 5, 7, 8, -2, 10, 4, 1, 9, 6};
        int sum = 0;
        double sum1 = 0;
        double srednia = 0;
        int ileParzystych = 0;
        int max = tab[0];
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {

            if (i % 2 == 1) {
                sum +=  tab[i];
            }
            if (tab[i] % 2 == 0) {
                sum1 += tab[i];
                ileParzystych++;
            }
            if (tab[i] > max) {
                max = tab[i];

            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.print("Suma nieparzystych: " + sum + "\nSrednia parzystych: " + (sum1 / ileParzystych) +"\n");
        System.out.println("Wartość minimalna w tablicy to: " + min);
        System.out.println("Wartość maksymalna w tablicy to: " + max);
    }
}
