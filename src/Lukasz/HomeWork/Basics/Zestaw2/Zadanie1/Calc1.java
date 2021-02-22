package Lukasz.HomeWork.Basics.Zestaw2.Zadanie1;

import java.util.Scanner;

public class Calc1 {

    public static void main(String[] args) {

        String[] tab = {"km -> miles", "kg -> pound", "kW -> KM"};
        System.out.println("Dostępne przeliczenia:");

        for (String units : tab) {
            System.out.println(units);
        }

        Calc1 kmToMiles = new Calc1("km", "miles", 0.62137);
        Calc1 kgToPounds = new Calc1("kg", "pound", 2.2046);
        Calc1 kWToKM = new Calc1("kW", "KM", 1.36);

        String base = inputBaseUnit();

        String target = inputTargetUnit();

        double number = inputNumber();

        double result = kmToMiles.converter();
        System.out.println(result);
    }

    public String baseUnit;
    public String targetUnit;
    public double calculate;

    public Calc1 (String baseUnit, String targetUnit, double calculate) {

        this.baseUnit = baseUnit;
        this.targetUnit = targetUnit;
        this.calculate = calculate;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public void setTargetUnit(String targetUnit) {
        this.targetUnit = targetUnit;
    }

    public void setCalculate(double calculate){
        this.calculate = calculate;
    }

    public static String inputBaseUnit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać jednostkę bazową:");
        return sc.nextLine();
    }

    public static String inputTargetUnit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać jednostkę docelową:");
        return sc.nextLine();
    }

    public static double inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać wartość: ");
        return sc.nextDouble();
    }

    public double converter() {
        if (baseUnit.equals("km") && targetUnit.equals("miles")) {
            return calculate * inputNumber();
        }
        else if (baseUnit.equals("kg") && targetUnit.equals("pound")) {
            return calculate * inputNumber();
        }
        else {
            return calculate * inputNumber();
        }
    }

    public void showCalc1() {
        System.out.println("Jednostka bazowa: " + inputBaseUnit());
        System.out.println("Jednostka wyjściowa: " + inputTargetUnit());
        System.out.println("Przelicznik: " + calculate);
    }
}
