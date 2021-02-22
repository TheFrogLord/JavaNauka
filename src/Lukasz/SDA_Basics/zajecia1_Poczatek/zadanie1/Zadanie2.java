package Lukasz.SDA_Basics.zajecia1_Poczatek.zadanie1;

public class Zadanie2 {
    public static void main(String[] args) {

        //Wyrażenie I

        int dzienUrodzenia = 21; // dzień urodzenia
        int rokUrodzenia = 1981; // rok urodzenia
        int miesiacUrodzenia = 5;

        double absResult = Math.abs(Math.pow(4,2) - 4 * rokUrodzenia);
        double mianownik = Math.PI * miesiacUrodzenia;
        double licznik = dzienUrodzenia - Math.sqrt(absResult);
        double x = licznik / mianownik;

        System.out.println("1. Wyrażenie I: ");
        System.out.println("x= " + x);
        System.out.println();

            //Wyrażenie II

            int a1 = 2;
            int b1 = 4;
            double alfa = 90;
            double sinAlfa = Math.sin(alfa);

            double p = a1 * b1 * sinAlfa;

            System.out.println("2. Wyrażenie II: ");
            System.out.println("P = " + p / 2);
            System.out.println();

                //Wyrażenie III

                double z = 1 + x + (4 * x);

                System.out.println("3. Wyrażenie III: ");
                System.out.println("Z = " + Math.round(z));




    }
}
