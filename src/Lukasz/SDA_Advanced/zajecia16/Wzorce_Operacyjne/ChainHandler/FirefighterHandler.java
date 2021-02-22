package Lukasz.SDA_Advanced.zajecia16.Wzorce_Operacyjne.ChainHandler;

public class FirefighterHandler extends AbstractHandler {
    @Override
    public void handleRequest(EmergencyType emergencyType) {
        if (emergencyType.equals(EmergencyType.FIRE)
                || emergencyType.equals(EmergencyType.CAR_ACCIDENT)) {

            System.out.println("Firefighters are on the way");
        }
        next(emergencyType);
    }
}
