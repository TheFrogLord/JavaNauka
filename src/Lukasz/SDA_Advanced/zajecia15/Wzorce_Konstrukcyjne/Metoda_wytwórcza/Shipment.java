package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public abstract class Shipment {

    public Shipment(Package aPackage, String destinationCountry) {
        this.aPackage = aPackage;
        this.destinationCountry = destinationCountry;
    }

    protected Package aPackage;

    protected String destinationCountry;

    public abstract String getType();

    public abstract String getPackageSize();

    public abstract String getCountryOfRecipt();

    public abstract String getPriceOfShipment();
}
