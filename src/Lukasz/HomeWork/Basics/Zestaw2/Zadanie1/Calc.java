package Lukasz.HomeWork.Basics.Zestaw2.Zadanie1;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        String[] tab = {"km -> mile", "kg -> pound", "kW -> KM"};
        System.out.println("Dostępne przeliczenia:");

        for (String units : tab) {
            System.out.println(units);
        }

        Calc.inputBaseUnit();
        Calc.inputTargetUnit();
        Calc.inputNumber();

        double result = Calc.calcUnit();

        System.out.println(result);

    }

    public static String inputBaseUnit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać jednostkę bazową: ");
        return sc.nextLine();
    }

    public static String inputTargetUnit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać jednostkę docelową: ");
        return sc.nextLine();
    }

    public static double inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać wartość: ");
        return sc.nextDouble();
    }

    public static double calcUnit() {

        if (inputBaseUnit().equals("km") && inputTargetUnit().equals("mile")) {
            return 0.62137 * inputNumber();

        } else if (inputBaseUnit().equals("kg") && inputTargetUnit().equals("pound")) {
            return 2.2046 * inputNumber();

        } else {
            return 1.36 * inputNumber();
        }
    }
}