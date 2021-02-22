package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public class PostalShipmentCreator implements ShipmentCreator
{
    @Override
    public Shipment create(Package pack) {
        return new PostalShipment(pack, pack.getAddress());
    }
}
