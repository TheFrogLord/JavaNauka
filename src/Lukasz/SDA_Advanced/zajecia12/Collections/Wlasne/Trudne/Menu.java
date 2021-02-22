package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne.Trudne;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Store store = new Store();

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("@ - zakoncz, S - sprzedaj, D - dodaj, W - wyswietl");
            String operation = scanner.nextLine();

            switch (operation) {
                case "@":
                    return;
                case "S":
                    System.out.println("Podaj produkt: ");
                    int id = scanner.nextInt();
                    System.out.println("Podaj ilość: ");
                    int quantity = scanner.nextInt();
                    store.sellProduct(id, quantity);
                    break;
                case "D":
                    System.out.println("Podaj dane produktu: ");
                    String name = scanner.nextLine();
                    int newProductId = scanner.nextInt();
                    BigDecimal price = scanner.nextBigDecimal();
                    int newProductQuantity = scanner.nextInt();
                    store.addProduct(newProductId, name, price, newProductQuantity);
                    break;
                case "W":
                    store.displayAllProducts();
                    break;
                default:
                    System.out.println("Nieznana operacja");
            }
        }
    }
}
