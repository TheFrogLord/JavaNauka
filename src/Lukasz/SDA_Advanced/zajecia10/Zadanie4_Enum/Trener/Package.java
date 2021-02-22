package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum.Trener;

import java.time.LocalDateTime;

public class Package {

    private String number;
    private PackageStatus currentStatus;
    private LocalDateTime lastStatusChange;

    public Package(String number) {
        this.number = number;
        this.currentStatus = PackageStatus.WAITING_FOR_PICKUP;
        this.lastStatusChange = LocalDateTime.now();
    }

    public String getNumber() {
        return number;
    }

    public PackageStatus getCurrentStatus() {
        return currentStatus;
    }

    public LocalDateTime getLastStatusChange() {
        return lastStatusChange;
    }

    public void updateStatus(PackageStatus newStatus) {
        this.currentStatus = newStatus;
        this.lastStatusChange = LocalDateTime.now();
    }
}
