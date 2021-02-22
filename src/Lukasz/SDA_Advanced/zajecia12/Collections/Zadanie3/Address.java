package Lukasz.SDA_Advanced.zajecia12.Collections.Zadanie3;

public class Address {
    private String street;
    private String houseAndFlat;
    private  String postalCode;
    private String city;

    public Address(String street, String houseAndFlat, String postalCode, String city) {
        this.street = street;
        this.houseAndFlat = houseAndFlat;
        this.postalCode = postalCode;
        this.city = city;
    }
    @Override
    public String toString() {
        return street + " " + houseAndFlat + "\n" + postalCode + " " + city;
    }
}
