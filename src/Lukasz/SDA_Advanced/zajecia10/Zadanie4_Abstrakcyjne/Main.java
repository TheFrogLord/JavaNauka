package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne;

public class Main {

    public static void main(String[] args) {

        LifeInsurance lifeInsurance = new LifeInsurance("01/2020", 10000,
                "Kuba Rozpruwacz", 45);
        CarInsurance carInsurance = new CarInsurance("02/2020", 20000, "Święty Mikołaj", 2015, 0.01);

        lifeInsurance.showInsuranceDetails();
        System.out.println(lifeInsurance.calculateRate());

        carInsurance.showInsuranceDetails();
        System.out.println(carInsurance.calculateRate());

    }
}
