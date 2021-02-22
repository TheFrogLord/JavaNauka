package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum.Wlasne;

public enum PackageStatus {
    OCZEKUJE_NA_ODBIOR("Oczekuje na odbiór."),
    NADANA("Paczka nadana"),
    W_TRANSPORCIE("Paczka w transporcie"),
    W_DORECZENIU("Paczka w doręczeniu"),
    DORECZONA("Paczka doręczona");

    private String name;

    PackageStatus(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return this.name;
    }

}
