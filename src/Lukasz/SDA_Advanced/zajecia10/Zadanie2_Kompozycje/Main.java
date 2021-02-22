package Lukasz.SDA_Advanced.zajecia10.Zadanie2_Kompozycje;

public class Main {

    public static void main(String[] args) {
        Person insuredPerson = new Person("Genowefa", "Pigwa", "123");
        Person beneficiaryPerson = new Person("Matka", "Teresa", "234");
        Insurance insurance = new Insurance("123/2020", insuredPerson, beneficiaryPerson);

        insurance.showInsuranceData();
    }
}
