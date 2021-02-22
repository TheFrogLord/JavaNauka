package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy;

public class CityStrategy implements EngineStrategy {

    @Override
    public void configureEngineController(EngineController controller) {

        controller.setMaxSpeed(50);
        controller.setPowerLimit(50);
        controller.setCurrentMode("CITY_MODE");

    }
}
