package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne;

public class CarInsurance extends Insurance {

    private int yearOfProduction;
    private double riskRate;

    public CarInsurance(String number, int sumOfInsurance, String owner,
                        int yearOfProduction, double riskRate) {
        super(number, sumOfInsurance, owner);
        this.yearOfProduction = yearOfProduction;
        this.riskRate = riskRate;
    }

    public double calculateRate() {
        return ((double) sumOfInsurance / 120) + yearOfProduction * riskRate;
    }
}






