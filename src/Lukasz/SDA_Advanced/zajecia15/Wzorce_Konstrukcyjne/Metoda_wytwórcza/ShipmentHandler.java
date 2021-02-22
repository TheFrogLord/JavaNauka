package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public class ShipmentHandler {

    public Shipment handlePackage(Package pack) {
        Shipment shipment = null;

        switch (pack.getPackageSize()) {

            case LARGE:
                shipment = new SeaShipmentCreator().create(pack);
                break;

            case SMALL:
                shipment = new PostalShipmentCreator().create(pack);
                break;

            case MEDIUM:
                shipment = new AirShipmentCreator().create(pack);
                break;
        }

        return shipment;
    }

}
