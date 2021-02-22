package Lukasz.SDA_Advanced.zajecia11.Generic.Zadanie1_Class;

public class Main {

    public static void main(String[] args) {
        Shelf<Soda> shelf = new Shelf<>(
                new Soda(3.5, 200, "orange", "Tymbark"),
                new Soda(4.5, 100, "apple", "Hortex"),
                new Soda(1.0, 300, "grape", "Tymbark"),
                new Soda(2.0, 250, "cola", "CocaCola")
        );

        //1
        shelf.displayAll();
        //2
        shelf.displayCheaperThan(3);
        //3
        shelf.calculateKcal(1, 3);
        //4
        shelf.displayProductInfo(2);
    }
}
