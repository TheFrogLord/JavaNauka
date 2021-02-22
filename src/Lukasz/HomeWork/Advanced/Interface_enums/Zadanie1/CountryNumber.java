package Lukasz.HomeWork.Advanced.Interface_enums.Zadanie1;

public class CountryNumber {

    public static void displayCountries() {
        int count = 1;
        for (Countries country : Countries.values()) {
            System.out.println(count++ + ". " + country.getCountrySign());
        }
    }

    public static void displayNumber(String code) {
        switch (code) {
            case "PL":
                System.out.println("Direct number is: " + "+" + Countries.PL.getNumber());
                break;
            case "ES":
                System.out.println("Direct number is: " + "+" + Countries.ES.getNumber());
                break;
            case "FR":
                System.out.println("Direct number is: " + "+" + Countries.FR.getNumber());
                break;
            case "SE":
                System.out.println("Direct number is: " + "+" + Countries.SE.getNumber());
            default:
                break;
        }
    }
}
