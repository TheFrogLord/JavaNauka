package Lukasz.SDA_Advanced.zajecia16.Wzorce_Operacyjne.Template;

public class Client {
    public static void main(String[] args) {

        Calculator results = new PolishTaxes();
        results.calculate(4500.20);
    }
}
