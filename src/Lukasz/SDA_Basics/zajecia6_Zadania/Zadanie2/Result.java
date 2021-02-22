package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie2;


import java.util.Scanner;

public class Result {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BMICalculator calc = new BMICalculator();
        System.out.println("Proszę podać wzrost [cm]: ");
        float height = sc.nextFloat();

        System.out.println("Proszę podać masę [kg]: ");
        int mass = sc.nextInt();
        sc.nextLine();

        String result = calc.calcBMI(height, mass);
        System.out.println(result);
    }
}
