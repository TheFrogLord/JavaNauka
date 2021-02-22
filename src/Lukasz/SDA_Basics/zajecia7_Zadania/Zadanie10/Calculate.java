package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie10;

public class Calculate {

    public void calc(int number) {

        int result = 0;

        while (number != 0) {
            result += number % 10;
            number = number / 10;
        }
        System.out.println("Wynik sumy cyfr: " + result);
    }
}
