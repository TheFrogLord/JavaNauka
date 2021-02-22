package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEx2 {

    public static void main(String[] args) {
        Map<String, String> colours = new HashMap<>();
        colours.put("niebieski", "blue");
        colours.put("zielony", "green");
        colours.put("czerwony", "red");
        colours.put("zółty", "yellow");

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać kolor: ");
        String color = sc.nextLine();

        if (colours.containsKey(color)) {
            System.out.println("Ang: " + colours.get(color));
        } else {
            System.out.println("Nie mamy tlumaczenia dla tego koloru");
        }
    }
}
