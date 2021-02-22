package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Factory.Excample;

public class PizzaReceiptFactory {

    Pizza getPizza(PizzaTypeEnum type, Thickness thickness) {

        switch (type) {
            case HAWAI:
                return new HawaiPizza(thickness);

            case MARGERITTA:
                return new MargerittaPizza(thickness);

            default:
                throw new RuntimeException("Pizza not found!");
        }
    }
}
