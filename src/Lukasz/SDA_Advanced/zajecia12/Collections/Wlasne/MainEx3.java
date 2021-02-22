package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainEx3 {

    public static void main(String[] args) {

        Set<String> products = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Proszę podać produkt: ");
            String product = sc.nextLine();

            if ("@".equals(product)) {
                break;
            }
            products.add(product);
        }

        for (String p : products) {
            System.out.println(p);
        }

    }
}
