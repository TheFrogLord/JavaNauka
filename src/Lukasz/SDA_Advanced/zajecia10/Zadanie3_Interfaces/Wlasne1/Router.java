package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne1;

public class Router implements ElectricDevice {

    private String manufacturer;
    private int numberOfSlots;

    public Router(String manufacturer, int numberOfSlots) {
        this.manufacturer = manufacturer;
        this.numberOfSlots = numberOfSlots;
    }

    @Override
    public void turnOn() {
        System.out.println(manufacturer + " router device is turned on.");

    }

    @Override
    public void turnOff() {
        System.out.println(manufacturer + " router device is turned off.");

    }
}
