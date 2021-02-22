package Lukasz.SDA_Basics.zajecia3_Tablice;

public class Zadanie12 { // zrób to jeszcze raz tylko inny sposób (Zadanie 12)

    public static void main(String[] args) {

        int[] tab = {0, 2, 1, 5, 3, 4, 2, 1, 0, 5, 3, 2, 2, 4, 1};
        int[] resultTab = {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < tab.length; i++) {
            int liczba = tab[i];
            resultTab[liczba]++;
        }
        for (int i = 0; i < resultTab.length; i++) {
            System.out.println(i + ":" + resultTab[i] + ", ");


        }

    }
}
