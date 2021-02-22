package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy;

public class EcoStrategy implements EngineStrategy{

    @Override
    public void configureEngineController(EngineController controller) {

        controller.setMaxSpeed(90);
        controller.setPowerLimit(30);
        controller.setCurrentMode("ECO_MODE");

    }
}
