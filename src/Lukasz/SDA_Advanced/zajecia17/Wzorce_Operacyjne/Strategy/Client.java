package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy;

import static Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Strategy.EngineModeResolver.getEngineStrategy;

public class Client {

    public static void main(String...  args) {
        EngineController engineController = new EngineController();

        EngineStrategy engineStrategy = getEngineStrategy(80, 120);
        engineStrategy.configureEngineController(engineController);
        engineController.displayInfo();

        getEngineStrategy(70, 90).configureEngineController(engineController);
        engineController.displayInfo();

        getEngineStrategy(30, 30).configureEngineController(engineController);
        engineController.displayInfo();

        getEngineStrategy(10, 140).configureEngineController(engineController);
        engineController.displayInfo();

        getEngineStrategy(50, 50).configureEngineController(engineController);
        engineController.displayInfo();

        getEngineStrategy(100, 90).configureEngineController(engineController);
        engineController.displayInfo();
    }


}
