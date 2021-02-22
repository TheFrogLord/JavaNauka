package Lukasz.SDA_Advanced.zajecia16.Wzorce_Operacyjne.ChainHandler;

public class EmergencyMedicalServiceHandler extends AbstractHandler{
    @Override
    public void handleRequest(EmergencyType emergencyType) {
        if (emergencyType.equals(EmergencyType.FIRE)
                || emergencyType.equals(EmergencyType.CAR_ACCIDENT)
                || emergencyType.equals(EmergencyType.BEATING)) {

            System.out.println("Medical service coming out");
        }
        next(emergencyType);
    }
}
