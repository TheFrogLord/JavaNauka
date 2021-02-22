package Lukasz.SDA_Advanced.zajecia10.Zadanie2_Kompozycje;

public class Insurance {

    private String insuranceNumber;
    private Person insured;
    private Person beneficiary;

    public Insurance(String insuranceNumber, Person insured, Person beneficiary) {
        this.insuranceNumber = insuranceNumber;
        this.insured = insured;
        this.beneficiary = beneficiary;
    }

    public void showInsuranceData() {
        System.out.println("Number: " + insuranceNumber);
        System.out.println("Insured: ");
        insured.showPersonData();
        System.out.println("Beneficiary: ");
        beneficiary.showPersonData();
    }
}
