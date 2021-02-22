package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateSDA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proszę podać datę najbliższych zajęć SDA: ");
        String classDate = sc.nextLine();

        LocalDate sda = LocalDate.parse(classDate);

        int days = (int) ChronoUnit.DAYS.between(LocalDate.now(), sda);
        System.out.println(days);

    }



}
