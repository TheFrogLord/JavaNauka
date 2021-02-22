package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum.Trener;

public class PackageList {
    private Package[] packages;

    public PackageList() {
        packages = new Package[]{
                new Package("123/2020"),
                new Package("023/2020"),
                new Package("223/2020"),
                new Package("101/2020")
        };
    }

    public void displayPackages() {
        for (Package pac : packages) {
            System.out.printf("%s | %s | %s%n",
                    pac.getNumber(),
                    pac.getLastStatusChange().toString(),
                    pac.getCurrentStatus().getLabel());
        }
    }

    public void updateStatus(String number, PackageStatus newStatus) {
        for (Package pac : packages) {
            if (pac.getNumber().equals(number)) {
                pac.updateStatus(newStatus);
                return;
            }
        }
    }
}
