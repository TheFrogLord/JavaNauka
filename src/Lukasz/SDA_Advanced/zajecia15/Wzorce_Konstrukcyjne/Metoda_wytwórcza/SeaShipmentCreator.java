package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public class SeaShipmentCreator implements ShipmentCreator {

    @Override
    public Shipment create(Package pack) {
        return new SeaShipment(pack, pack.getAddress());
    }
}
