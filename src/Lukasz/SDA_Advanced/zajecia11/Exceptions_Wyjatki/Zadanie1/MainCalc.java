package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki.Zadanie1;

import static Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki.Zadanie1.Calculator.sqrtNumber;

public class MainCalc {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(3, 1);
        try {
            System.out.println(calculator.divide());
        }catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
           exception.printStackTrace();
        }

        System.out.println(sqrtNumber(5));

        PeselValidator peselValidator = new PeselValidator("84529558745");

    }
}
