package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Diagram;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Invoker invoker = new Invoker();

        while (true) {

            int operation = Integer.parseInt(sc.nextLine());
            int a = 0;
            int b = 0;

            switch (operation) {

                case 1:
                    a = Integer.parseInt(sc.nextLine());
                    b = Integer.parseInt(sc.nextLine());
                    invoker.setCommand(new SumCommand(a, b));
                    break;

                case 2:
                    a = Integer.parseInt(sc.nextLine());
                    b = Integer.parseInt(sc.nextLine());
                    invoker.setCommand(new SubCommand(a, b));
                    break;

                case 5:
                    invoker.invoke();
                    return;

                default:
                    System.out.println("Błędna operacja.");

            }
        }
    }
}
