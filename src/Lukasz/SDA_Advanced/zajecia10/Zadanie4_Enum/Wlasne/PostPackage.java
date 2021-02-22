package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum.Wlasne;

import java.time.LocalDate;

public class PostPackage {
    private String packageNumber;
    private String packageStatus;
    private String statusChangeDate;

    public PostPackage(String packageNumber, String packageStatus, String statusChangeDate) {
        this.packageNumber = packageNumber;
        this.packageStatus = packageStatus;
        this.statusChangeDate = statusChangeDate;
    }

    public void showPackage() {
        System.out.println("Numer paczki :" + packageNumber);
        System.out.println("Status paczki: " + packageStatus);
        System.out.println(statusChangeDate);
    }

    public String statusChange(String status) {
        packageStatus = status;
        return packageStatus;
    }

    public String showPackageNumber(String number, String newStatus) {
        if (packageNumber.equals(number)) {
            packageStatus = newStatus;
            statusChangeDate = "Data aktualizacji: " + LocalDate.now().toString();
            return packageStatus;
        }
        return packageNumber;
    }
}

