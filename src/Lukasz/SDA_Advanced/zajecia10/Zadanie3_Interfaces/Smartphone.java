package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces;

public class Smartphone implements PhotoCamera, GpsNavigation {

    private String manufacturer;
    private String model;

    public Smartphone(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public void navigate(double latitude, double longitude) {
        System.out.println("Navigating to " + latitude + ", " + longitude);
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo is taken and saved.");
    }

    @Override
    public void turnOnFlash() {
        System.out.println("Flash is turned on.");
    }
}
