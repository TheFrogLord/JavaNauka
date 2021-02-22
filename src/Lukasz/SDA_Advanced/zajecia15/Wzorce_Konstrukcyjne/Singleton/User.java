package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Singleton;

public class User {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int id;

    public User(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return id + ". " + firstName + " " + lastName +
                ", tel.: " + phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }
}
