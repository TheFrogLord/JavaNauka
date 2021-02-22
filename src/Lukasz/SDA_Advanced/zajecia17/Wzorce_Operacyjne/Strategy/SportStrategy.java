package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy;

public class SportStrategy implements EngineStrategy {

    @Override
    public void configureEngineController(EngineController controller) {

        controller.setMaxSpeed(250);
        controller.setPowerLimit(100);
        controller.setCurrentMode("SPORT_MODE");

    }
}
