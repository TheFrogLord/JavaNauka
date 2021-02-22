package Lukasz.SDA_Advanced.zajecia11.Generic.Zadanie1_Class;

public class Soda implements Product {
    private double price;
    private int kcal;
    private String taste;
    private String manufacturer;

    public Soda(double price, int kcal, String taste, String manufacturer) {
        this.price = price;
        this.kcal = kcal;
        this.taste = taste;
        this.manufacturer = manufacturer;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getKcal() {
        return kcal;
    }

    @Override
    public String getDescription() {
        return manufacturer + " " + taste;
    }
}
