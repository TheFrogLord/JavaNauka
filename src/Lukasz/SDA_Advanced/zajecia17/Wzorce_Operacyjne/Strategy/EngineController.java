package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy;

public class EngineController {

    private static final int INITIAL_POWER = 310;
    private int maxSpeed;
    private double powerLimit;
    private String currentMode;

    public EngineController() {
        maxSpeed = 310;
        powerLimit = INITIAL_POWER;
    }

    public EngineController setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public EngineController setCurrentMode(String currentMode) {
        this.currentMode = currentMode;
        return this;
    }

    public EngineController setPowerLimit(double limitPowerPercentage) {
        this.powerLimit = INITIAL_POWER * limitPowerPercentage;
        return this;
    }

    public void displayInfo() {
        System.out.println(currentMode);
        System.out.println("Engine power is limited to: " + powerLimit);
        System.out.println("Speed limit: " + maxSpeed);
    }
}
