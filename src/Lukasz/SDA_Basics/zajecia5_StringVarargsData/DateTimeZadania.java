package Lukasz.SDA_Basics.zajecia5_StringVarargsData;

import java.time.Instant;

public class DateTimeZadania {

    public static void main(String[] args) {

        String[] officeArray = {"Picie kawy", "Siedzenie", "Praca", "Czytanie"};

        long start = System.currentTimeMillis();
        long end = start + 20 * 1000;
        Instant baseTime = Instant.now();

        do {

            Instant currentTime = Instant.now();
            if (currentTime.minusSeconds(4).isAfter(baseTime)) {
                baseTime = Instant.now();
                int randomIndex = (int) (Math.random() * officeArray.length);
                String randomElement = officeArray[randomIndex];
                System.out.println(randomElement);
            }
        } while (System.currentTimeMillis() < end);
    }
}
