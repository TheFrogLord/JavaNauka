package Lukasz.SDA_Basics.zajecia1_Poczatek.zadanie1;

public class Zadanie1 {

    public static void main(String[] args) {

        byte mojaLiczba1 = 39;

        //przekroczyć wartość zmiennej byte

        short mojaLiczba2 = 2020;
        int mojaLiczba3 = 8500;
        long mojaLiczba4 = 24860564;
        float mojaLiczba5 = 1.25F;
        double mojaLiczba6 = 3.245;

        char mojZnak = 'i';
        String mojTekst = "Jedziemy z koksem.";

        //teraz wyświetlę instrukcję

        System.out.println(mojaLiczba2 + " " + mojZnak + " " + mojTekst);
        System.out.println("|");
        System.out.println(mojaLiczba5 + mojaLiczba6);
        System.out.println("|");
        System.out.println(mojaLiczba3 - mojaLiczba4);

    }
}
