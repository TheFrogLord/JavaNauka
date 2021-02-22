package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne;

public abstract class Insurance {

    private String number;
    protected int sumOfInsurance;
    private String owner;

    public Insurance(String number, int sumOfInsurance, String owner) {
        this.number = number;
        this.sumOfInsurance = sumOfInsurance;
        this.owner = owner;
    }

    public void showInsuranceDetails() {
        System.out.println("Number: " + number);
        System.out.println("Sum of insurance: " + sumOfInsurance);
        System.out.println("Owner: " + owner);
    }

    public abstract double calculateRate();

}
