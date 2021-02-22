package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne.Trudne;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private int quantity;

    public Product(int id, String name, BigDecimal price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id +
                ". name=" + name +
                ", price=" + price +
                ", numberOfItems=" + quantity;
    }

    public void changeQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice(int quantity) {
        return price.multiply(BigDecimal.valueOf(quantity)).setScale(2);
    }
}
