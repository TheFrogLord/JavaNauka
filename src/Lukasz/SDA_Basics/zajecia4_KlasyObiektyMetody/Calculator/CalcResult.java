package Lukasz.SDA_Basics.zajecia4_KlasyObiektyMetody.Calculator;

public class CalcResult {

    public static void main(String[] args) {

        //Calculator calculator = new Calculator();

        double sum = Calculator.add(1, 3, 5); // korzystamy z metody statycznej

        /*
        int sum1 = calculator.add(2, 4);
        double sum2 = calculator.add(2.5, 3.0);

        int sum3 = calculator.add(3, 1, 5);
        double sum4 = calculator.add(1.5, 0.86, 2.5);

         */

        System.out.println(sum);

    }
}
