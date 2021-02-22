package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy;

public class EngineModeResolver {

    public static EngineStrategy getEngineStrategy(int fuelLevel, int currentSpeed) {
        if (fuelLevel > 70 && currentSpeed > 100) {
            return new SportStrategy();
        }
        if (fuelLevel > 50 && currentSpeed < 60) {
            return new CityStrategy();
        }
        if (fuelLevel < 30) {
            return new EcoStrategy();
        }
        return new StandardStrategy();
    }

}
