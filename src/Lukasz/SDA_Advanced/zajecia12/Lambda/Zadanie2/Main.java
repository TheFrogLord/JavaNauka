package Lukasz.SDA_Advanced.zajecia12.Lambda.Zadanie2;

//Napisz wyrażenie lambda, które zwróci większa z dwóch liczb (MathOperation)

public class Main {

    public static void main(String[] args) {

        /*
        MatOperation isBigger = new MatOperation() {
            @Override
            public double isBigger(double a, double b) {
                return Math.max(a, b);
            }
        };
        */

        MatOperation isBiggerLambda = (a, b) -> Math.max(a, b);
        System.out.println(isBiggerLambda.isBigger(24, 18.5));
    }

}
