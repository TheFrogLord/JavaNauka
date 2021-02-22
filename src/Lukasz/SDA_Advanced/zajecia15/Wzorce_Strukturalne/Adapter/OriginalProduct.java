package Lukasz.SDA_Advanced.zajecia15.Wzorce_Strukturalne.Adapter;

public class OriginalProduct {

    private int price;
    private String name;

    public OriginalProduct(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
