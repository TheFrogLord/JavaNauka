package Lukasz.SDA_Advanced.zajecia16.Wzorce_Operacyjne.ChainHandler;

public abstract class AbstractHandler {

    private AbstractHandler handler;

    public void setNext(AbstractHandler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(EmergencyType emergencyType);

    public void next(EmergencyType emergencyType) {
        if (handler != null) {
            handler.handleRequest(emergencyType);
        }

    }

}
