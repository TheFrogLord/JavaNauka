package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum.Wlasne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PostPackage packageOne = new PostPackage("01/12/20", PackageStatus.NADANA.getPackageName(),
                "Data: 12.12.2020");

        PostPackage packageTwo = new PostPackage("02/12/20", PackageStatus.W_TRANSPORCIE.getPackageName(),
                "Data: 11.12.2020");

        PostPackage packageThree = new PostPackage("03/12/20", PackageStatus.OCZEKUJE_NA_ODBIOR.getPackageName(),
                "Data: 04.11.2020");

        PostPackage packageFour = new PostPackage("04/12/20", PackageStatus.W_DORECZENIU.getPackageName(),
                "Data: 10.10.2020");

        PostPackage packageFive = new PostPackage("05/12/20", PackageStatus.DORECZONA.getPackageName(),
                "Data: 06.12.2020");

        System.out.println("Status paczek: ");

        PostPackage[] array = {packageOne, packageTwo, packageThree, packageFour, packageFive};

        while (true) {
            int index = 1;

            for (PostPackage packages : array) {
                System.out.println("Paczka " + index++);
                packages.showPackage();
                System.out.println();
            }

            System.out.println("Wybierz number paczki:");
            String number = sc.nextLine();
            System.out.println("Podaj nowy status: ");
            String newStatus = sc.nextLine();

            int index1 = 1;

            for (PostPackage postPackage : array) {
                postPackage.showPackageNumber(number, newStatus);
                System.out.println("Paczka " + index1++);
                postPackage.showPackage();
                System.out.println();
            }
            System.out.println("Czy kontynuować? [TAK/NIE]");
            String exit = sc.nextLine();
            if ("NIE".equals(exit));
            return;
        }
    }
}
