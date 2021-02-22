package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki.Zadanie1;

public class Calculator {

    private double a;
    private double b;

//można robić be konstruktora jak w przykładzie trenera
    public Calculator(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nie dziel przez zero!");
        }
        this.a = a;
        this.b = b;
    }

    public double divide() {
        return a / b;
    }

    public static double sqrtNumber(double number) {
        if (number < 0) {
        throw new NegativeNumberException();
        }
        return Math.sqrt(number);
    }
}
