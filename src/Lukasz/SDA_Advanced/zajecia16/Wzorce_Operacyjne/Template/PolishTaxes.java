package Lukasz.SDA_Advanced.zajecia16.Wzorce_Operacyjne.Template;

public class PolishTaxes extends Calculator {

    public void taxOutcome(double baseIncome) {
        double result = 1200;
        System.out.println(result);
    }

    public void healthInsurence(double baseIncome) {
        double result = baseIncome * 0.025;
        System.out.println(result);
    }

    public void retirementInsurence(double baseIncome) {
        double result = baseIncome * 0.195;
        System.out.println(result);

    }

}
