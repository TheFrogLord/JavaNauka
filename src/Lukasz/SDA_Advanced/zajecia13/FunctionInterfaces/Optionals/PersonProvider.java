package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Optionals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonProvider {

    private List<Person> personList = new ArrayList<>();
    public PersonProvider() {
        personList.add(new Person("Adam", "Małysz", "8512218901", LocalDate.parse("1985-12-21")));
        personList.add(new Person("Robert", "Bak", "9103018901", LocalDate.parse("1991-03-01")));
        personList.add(new Person("Anna", "Mak", "9305238901", LocalDate.parse("1993-05-23")));
    }

    public Optional<Person> findByPesel(String pesel) {
        for (Person person: personList) {
            if (person.getPesel().equals(pesel)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> findByName(String name, String surname) {
        for (Person person: personList) {
            if (person.getName().equals(name) && person.getSurname().equals(surname)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
