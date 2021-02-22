package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne.Trudne;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public void addProduct(int id, String name, BigDecimal price, int quantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                int currentQuantity = product.getQuantity();
                product.changeQuantity(currentQuantity + quantity);
                return;
            }
        }
        products.add(new Product(id, name, price, quantity));
    }

    public void displayAllProducts() {
        System.out.println("Produkty w magazynie: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void sellProduct(int id, int quantity) {
        Product productToSell = null;
        for (Product product : products) {
            if (product.getId() == id) {
                productToSell = product;
            }
        }
        if (productToSell == null) {
            System.out.println("Produkt nie istnieje");
            return;
        }
        if (productToSell.getQuantity() < quantity) {
            System.out.println("W magazynie brak wystarczajacej ilosci produktu");
            return;
        }
        System.out.println("Rozpoczynam proces sprzedażowy");
        System.out.println("Cena transakcji " + productToSell.getPrice(quantity));
        productToSell.changeQuantity(productToSell.getQuantity() - quantity);

        if (productToSell.getQuantity() == 0) {
            products.remove(productToSell);
        }
    }

}
