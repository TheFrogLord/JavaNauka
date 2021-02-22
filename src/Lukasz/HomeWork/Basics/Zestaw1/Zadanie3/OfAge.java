package Lukasz.HomeWork.Basics.Zestaw1.Zadanie3;

import java.util.Calendar;

public class OfAge {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int daysLeft = 366 - dayOfYear;

        System.out.println("Mamy " + dayOfYear + " dzień roku");
        System.out.println("Do końca roku pozostało: " + daysLeft + " dni");

    }
}


