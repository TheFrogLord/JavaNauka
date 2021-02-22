package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Optionals;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private String pesel;
    private LocalDate birthDate;

    public Person(String name, String surname, String pesel, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
