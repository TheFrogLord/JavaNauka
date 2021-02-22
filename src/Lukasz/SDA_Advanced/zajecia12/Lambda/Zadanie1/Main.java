package Lukasz.SDA_Advanced.zajecia12.Lambda.Zadanie1;

/*Napisz wyrażenie lambda które podniesie liczbe do podanej potegi
  (interfejs MathOperation, gdzie a to liczba potęgowana, a b to do której
   potęgi) - użyj funkcji Math.pow*/

public class Main {

    public static void main(String[] args) {

        MathOperation mathPowLambda = (a, b) -> Math.pow(a, b);
        System.out.println(mathPowLambda.powNumber(2.7, 3));

    }
}
