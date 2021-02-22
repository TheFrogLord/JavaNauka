package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie2;



public class BMICalculator {

    float bmiMin = 18.5f;
    float bmiMax = 24.9f;

    public String calcBMI( float height, int mass) {
        float powResult = (float) Math.pow(height / 100 , 2);
        float meter = powResult;
        float bmi = mass / meter;

        if (bmi >= bmiMin && bmi <= bmiMax) {
            return "W normie";

        } else {
            System.out.println( "Wynik: " + bmi + "BMI nieoptymalne");
            return "Nieoptymalne";
        }
    }
}

