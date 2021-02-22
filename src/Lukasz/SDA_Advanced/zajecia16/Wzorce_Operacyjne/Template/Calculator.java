package Lukasz.SDA_Advanced.zajecia16.Wzorce_Operacyjne.Template;

public abstract class Calculator {



  public void taxOutcome(double baseIncome) {

    }

    public void healthInsurence(double baseIncome) {

    }

    public void retirementInsurence(double baseIncome) {

    }

    public void calculate(double baseIncome) {
        taxOutcome(baseIncome);
        healthInsurence(baseIncome);
        retirementInsurence(baseIncome);
    }
}
