package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum.Trener;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PackageList packageList = new PackageList();

        while (true) {
            System.out.println("Lista paczek: ");
            packageList.displayPackages();
            System.out.println("Dostępne statusy: ");
            displayStatuses();

            System.out.println("Podaj numer paczki: ");
            String number = scanner.nextLine();

            System.out.println("Podaj numer nowego statusu");
            int newStatusIndex = scanner.nextInt();
            scanner.nextLine();

            packageList.updateStatus(number, PackageStatus.values()[newStatusIndex - 1]);

            System.out.println("Czy kontynuować? T/N");
            String shouldContinue = scanner.nextLine();
            if ("N".equalsIgnoreCase(shouldContinue)) {
                return;
            }
        }
    }

    private static void displayStatuses() {
        int index = 1;
        for (PackageStatus status: PackageStatus.values()) {
            System.out.println(index++ + ". " + status.getLabel());
        }
    }
}
