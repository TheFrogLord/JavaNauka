package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy;

public class StandardStrategy implements EngineStrategy {

    @Override
    public void configureEngineController(EngineController controller) {

        controller.setMaxSpeed(130);
        controller.setPowerLimit(80);
        controller.setCurrentMode("STANDARD_MODE");

    }
}
