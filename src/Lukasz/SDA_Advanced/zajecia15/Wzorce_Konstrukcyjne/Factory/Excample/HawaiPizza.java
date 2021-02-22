package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Factory.Excample;

public class HawaiPizza implements Pizza {

    private Thickness thickness;

    public HawaiPizza(Thickness thickness) {
        this.thickness = thickness;
    }

    @Override
    public String getReceipt() {
        return "Receipt: \n"
                + "1. Ananas" + ", "
                + "2. Szynka" + ", "
                + "3. Kukurydza \n"
                + "Rodzaj ciasta: " + thickness;
    }
}
