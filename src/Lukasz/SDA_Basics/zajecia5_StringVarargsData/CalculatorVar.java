package Lukasz.SDA_Basics.zajecia5_StringVarargsData;

public class CalculatorVar {

    public static void main(String[] args) {

        double sum = CalculatorVar.add(1.4, 2.5, 0.4);
        double sub = CalculatorVar.sub(2, 3, 1);
        double mult = CalculatorVar.mult(2, 3, 2);

        System.out.println("Suma double: " + sum);
        System.out.println("Różnica wynosi: " + sub);
        System.out.println("Iloczyn wynosi: " + mult);

    }

    public static double add(double... n) {
        double sum = 0;
        for (double number : n) {
            sum += number;
        }
        return sum;
    }

    public static double sub(double... n) {
        //int i = 0;
        for (double number : n) {
            n[0] -= number;
        }
        return n[0];
    }

    public static double mult(double... n) {
        double mult = 1;
        for (double number : n) {
            mult *= number;
        }
        return mult;
    }
}
