package Lukasz.HomeWork.Advanced.Interface_enums.Zadanie1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountryNumber.displayCountries();
        System.out.println("Please choose country code/symbol: ");
        String code = sc.nextLine();
        CountryNumber.displayNumber(code);

    }
}
