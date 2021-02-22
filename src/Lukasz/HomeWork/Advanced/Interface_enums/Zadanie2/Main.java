package Lukasz.HomeWork.Advanced.Interface_enums.Zadanie2;

public class Main {
    public static void main(String[] args) {
        MathOperations sum = new MathOperations() {
            @Override
            public double math(double a, double b) {
                return a + b;
            }
        };
        System.out.println(sum.math(1.5, 2.8));
    }
}
