package Lukasz.SDA_Advanced.zajecia16.Wzorce_Operacyjne.ChainHandler;

public class PoliceHandler extends AbstractHandler {

    @Override
    public void handleRequest(EmergencyType emergencyType) {
        if (emergencyType.equals(EmergencyType.FIRE)
                || emergencyType.equals(EmergencyType.CAR_ACCIDENT)
                || emergencyType.equals(EmergencyType.THEFT)
                || emergencyType.equals(EmergencyType.BEATING)) {

            System.out.println("Police requested accepted");
        }
        next(emergencyType);
    }
}
