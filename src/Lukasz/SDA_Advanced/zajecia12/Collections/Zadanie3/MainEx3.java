package Lukasz.SDA_Advanced.zajecia12.Collections.Zadanie3;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Utwórz książkę adresową, gdzie każdy klient będzie miał nazwę
//i na podstawie nazwy zostanie zwrócony obiekt klasy Adres
//Jeżeli to nowy klient, musimy go umieścić w naszej książce
public class MainEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Address> addressBook = new HashMap<>();

        while (true) {
            System.out.println("Podaj nazwę klienta: ");
            String customerName = scanner.nextLine();

            if (addressBook.containsKey(customerName)) {
                System.out.println("Ades: ");
                System.out.println(addressBook.get(customerName));

            } else {
                System.out.println("Podaj adres w celu zapisania: ");
                String street = scanner.nextLine();
                String postalCode = scanner.nextLine();
                String houseAndFlat = scanner.nextLine();
                String city = scanner.nextLine();
                Address customerAddress = new Address(street, houseAndFlat,
                        postalCode, city);
                addressBook.put(customerName, customerAddress);
            }
        }
    }
}
