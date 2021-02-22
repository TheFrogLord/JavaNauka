package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public class AirShipmentCreator implements ShipmentCreator {
    @Override
    public Shipment create(Package pack) {
        return new AirShipment(pack, pack.getAddress());
    }
}
