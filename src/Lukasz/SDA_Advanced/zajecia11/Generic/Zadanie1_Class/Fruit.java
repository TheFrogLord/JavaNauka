package Lukasz.SDA_Advanced.zajecia11.Generic.Zadanie1_Class;

public class Fruit implements Product {
    private String type;
    private double price;
    private int kcal;

    public Fruit(String type, double price, int kcal) {
        this.type = type;
        this.price = price;
        this.kcal = kcal;
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
        return type;
    }
}