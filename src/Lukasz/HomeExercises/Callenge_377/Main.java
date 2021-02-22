package Lukasz.HomeExercises.Callenge_377;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Proszę podać wymiary skrzyni");
        System.out.println("Wymiar X: ");
        int X = sc.nextInt();
        System.out.println("Wymiar Y: ");
        int Y = sc.nextInt();

        System.out.println("Oraz wymiary pudełek:");
        System.out.println("Wymiar x: ");
        int x = sc.nextInt();
        System.out.println("Wymiar y: ");
        int y = sc.nextInt();

        Boxes result = new Boxes();
        result.fitBoxesInCrest(X, Y, x, y);

    }
}
