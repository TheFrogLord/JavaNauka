package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie18;

public class Validate {

    public static boolean aSiu(String messege) {

        if (messege.matches("a+.*psik")) {
            System.out.println("Kichnąłeś, na zdrowie!");
            return true;
        }else
            System.out.println("Nie kichnąłeś");
        return false;
    }
}
