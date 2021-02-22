package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne1;

public class Main {

    public static void main(String[] args) {
        Router router = new Router("Technicolor", 5);
        Television tv = new Television("16:9", "LG");

        router.turnOn();
        router.turnOff();

        tv.turnOn();
        tv.adjustBrightness(87);
        tv.turnOff();
    }
}
