package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum.Trener;

public enum PackageStatus {
    WAITING_FOR_PICKUP("Oczekuje na odbiór"),
    SENT("Nadana"),
    IN_TRANSPORT("W transporcie"),
    IN_DELIVERY("W doręczeniu"),
    DELIVERED("Doręczona");

    private final String label;

    PackageStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
