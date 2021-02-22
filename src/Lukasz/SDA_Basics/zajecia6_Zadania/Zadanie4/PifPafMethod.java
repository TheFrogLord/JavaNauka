package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie4;

public class PifPafMethod {

    public void pifPaf(int number) {
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif Paf");
                continue;

            } else if (i % 3 == 0) {
                System.out.println("Pif");
                continue;

            } else if (i % 7 == 0) {
                System.out.println("Paf");
                continue;
            }

            System.out.println(i);
        }
    }
}

