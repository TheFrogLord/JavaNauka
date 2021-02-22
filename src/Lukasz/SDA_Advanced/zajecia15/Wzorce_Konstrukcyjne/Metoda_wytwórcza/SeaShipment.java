package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public class SeaShipment extends Shipment{

    public SeaShipment(Package aPackage, String destinationCountry) {
        super(aPackage, destinationCountry);
    }

    @Override
    public String getType() {
        return "Sea shipment";
    }

    @Override
    public String getPackageSize() {
        return aPackage.getPackageSize().toString();
    }

    @Override
    public String getCountryOfRecipt() {
        return destinationCountry;
    }

    @Override
    public String getPriceOfShipment() {
        return "$120";
    }
}
