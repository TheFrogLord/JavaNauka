package Lukasz.SDA_Advanced.zajecia11.Generic.Zadanie1_Class;

public class Shelf<T extends Product> {

    private T[] products;

    public Shelf(T ... products) {
        this.products = products;
    }
    //1
    public void displayAll() {
        System.out.println("All products");
        for (T product: products) {
            System.out.println(product.getDescription());
        }
    }
    //2
    public void displayCheaperThan(double maxPrice) {
        System.out.println("Products cheaper than " + maxPrice);
        for (T product: products) {
            if (product.getPrice() < maxPrice) {
                System.out.println(product.getDescription());
            }
        }
    }
    //3
    public void calculateKcal(int ... indexes) {
        double sumOfKcal = 0;
        for (int index : indexes) {
            sumOfKcal += products[index].getKcal();
        }
        System.out.println("Sum of kcal : " + sumOfKcal);
    }
    //4
    public void displayProductInfo(int index) {
        T product = products[index];
        System.out.println(product.getDescription());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Kcal: " + product.getKcal());
    }
}
