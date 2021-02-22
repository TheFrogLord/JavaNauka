package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Factory.Excample;

public class MargerittaPizza implements Pizza{

    private Thickness thickness;

    public MargerittaPizza(Thickness thickness) {
        this.thickness = thickness;
    }

    @Override
    public String getReceipt() {
        return "Receipt Margeritta: \n"
                + "1. Ser" + ", "
                + "1. Sos \n"
                + "4. " + thickness;
    }
}
