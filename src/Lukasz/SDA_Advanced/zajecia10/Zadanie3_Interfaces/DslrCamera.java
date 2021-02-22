package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces;

public class DslrCamera implements PhotoCamera {
    private String manufacturer;
    private String model;

    public DslrCamera(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public void takePhoto() {
        System.out.println("Professional photo is taken and saved on memory card.");
    }
}
