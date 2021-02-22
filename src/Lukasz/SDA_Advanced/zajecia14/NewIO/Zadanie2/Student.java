package Lukasz.SDA_Advanced.zajecia14.NewIO.Zadanie2;

public class Student {
    private String firstName;
    private String lastName;
    private String group;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }
}
