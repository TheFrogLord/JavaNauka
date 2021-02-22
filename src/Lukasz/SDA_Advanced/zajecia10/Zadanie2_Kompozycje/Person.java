package Lukasz.SDA_Advanced.zajecia10.Zadanie2_Kompozycje;

public class Person {

    private String firstName;
    private String lastName;
    private String idNumber;

    public Person(String firstName, String lastName, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void showPersonData() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Id: " + idNumber);
    }
}
