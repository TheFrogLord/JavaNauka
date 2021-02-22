package Lukasz.SDA_Basics.zajecia1_Poczatek.zadanie4;

public class Zadanie4 {

    public static void main(String[] args) {

        double randomNumber = Math.random() * 50 - 25;

        if (randomNumber < 0) {
            System.out.println("Liczba jest mniejsza od zera i wynosi: " + randomNumber);
        }
        else if (randomNumber > 0) {
            System.out.println("Liczba jest większa od zera i wynosi: " + randomNumber);
        }
        else {
            System.out.println("Równe zero: " + randomNumber);
        }
    }
}
