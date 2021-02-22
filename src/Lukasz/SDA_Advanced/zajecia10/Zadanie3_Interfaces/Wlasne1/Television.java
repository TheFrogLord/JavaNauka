package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne1;

public class Television implements ElectricDevice, DeviceWithScreen {
    private String screenRatio;
    private String manufacturer;

    public Television(String screenRatio, String manufacturer) {
        this.screenRatio = screenRatio;
        this.manufacturer = manufacturer;
    }

    @Override
    public void turnOn() {
        System.out.println(manufacturer + " TV turned on");

    }

    @Override
    public void turnOff() {
        System.out.println(manufacturer + " TV turned off");

    }

    @Override
    public void adjustBrightness(int brightness) {
        System.out.println(screenRatio + " ratio ->" + " screen brightness adjust to: " + brightness + " %");

    }
}
