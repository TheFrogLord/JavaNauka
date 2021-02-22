package Lukasz.SDA_Advanced.zajecia12.Collections.Zadanie4;

//Użytkownik będzie nam podawał pary następujących danych
//Imie + miasto zamieszkania.
//Chcemy pogrupowac ludzi po miescie zamieszkania i nastepnie wyswietlic wyniki
//naszego grupowania

import java.util.*;

public class MainEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> groupedNames = new HashMap<>();
        while (true) {
            System.out.println("Podaj imie i miasto:");
            String name = scanner.nextLine();
            if ("@".equals(name)) {
                break;
            }
            String city = scanner.nextLine();
            if (groupedNames.containsKey(city)) {
                groupedNames.get(city).add(name);
               /* Rozwiązanie z rozpisana operacja wyzej^
                List<String> namesFromCity = groupedNames.get(city);
                namesFromCity.add(name);
                groupedNames.put(city, namesFromCity);*/
            } else {
                List<String> namesFromCity = new ArrayList<>();
                namesFromCity.add(name);
                groupedNames.put(city, namesFromCity);
            }
        }
        for (Map.Entry<String, List<String>> entry : groupedNames.entrySet()) {
            System.out.println("Miasto: " + entry.getKey());
            for (String name : entry.getValue()) {
                System.out.print(name + ", ");
            }
            System.out.println();
        }
    }
}
