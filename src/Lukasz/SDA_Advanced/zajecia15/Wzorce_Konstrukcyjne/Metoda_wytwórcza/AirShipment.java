package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public class AirShipment extends Shipment {

    public AirShipment(Package aPackage, String destinationCountry) {
        super(aPackage, destinationCountry);
    }

    @Override
    public String getType() {
        return "Air shipment";
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
        return "$12";
    }
}
