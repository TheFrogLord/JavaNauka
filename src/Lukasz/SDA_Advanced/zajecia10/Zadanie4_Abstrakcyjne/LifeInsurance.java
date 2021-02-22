package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne;

public class LifeInsurance extends Insurance {

    private int insuredAge;

    public LifeInsurance(String number, int sumOfInsurance, String owner, int insuredAge) {
        super(number, sumOfInsurance, owner);
        this.insuredAge = insuredAge;
    }

    public double calculateRate() {
        return ((double) sumOfInsurance / 120) + insuredAge;
    }
}
