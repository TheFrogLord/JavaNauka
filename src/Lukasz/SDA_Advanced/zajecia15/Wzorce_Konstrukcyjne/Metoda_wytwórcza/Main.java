package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Metoda_wytwórcza;

public class Main {
    public static void main(String[] args) {

        Package one = new Package(Size.MEDIUM, "ul. Xxxxxxx 32, 20-134 Aaaaaa", true);
        Package two = new Package(Size.LARGE, "ul. Yyyyyyyyy 14, 22-200 Bbbbb", true);
        Shipment first = new ShipmentHandler().handlePackage(one);

        System.out.println(first);
    }
}
