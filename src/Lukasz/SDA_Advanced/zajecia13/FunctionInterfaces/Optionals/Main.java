package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Optionals;

import java.time.LocalDate;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        PersonProvider personProvider = new PersonProvider();
        Optional<Person> personByPesel = personProvider.findByPesel("9103018901");
        Optional<Person> personByName = personProvider.findByName("Adam", "Małysz");

//rozwiazanie "starodawne" aby odpakowac optional
        if (personByPesel.isPresent()) {
            Person person = personByPesel.get();
            System.out.println("Osoba o podanym peselu istnieje " + person.getName() + " " + person.getSurname());
        }

//rozwiazanie przy uzyciu metod z klasy Optional - wywolanie lancuchowe
//Wykonaj akcje, gdy obiekt w Optionalu istnieje
        personByPesel.ifPresent(person -> System.out.println("Osoba istnieje " + person.getName() + " " + person.getSurname()));

//Sprawdzam czy obiekt, znajdujacy sie w Optionalu spelnia jakis warunek
        personByPesel
                .filter(person -> person.getBirthDate().isAfter(LocalDate.parse("1990-01-01")))
                .ifPresent(person -> System.out.println("Osoba istnieje i urodzila sie conajmniej w 1990"));

//Zmapowac obiekt, znajdujacy sie w optionalu
        personByPesel//Optional<Person>
                .map(person -> person.getName() + " " + person.getSurname())//Optional<String>
                .ifPresent(name -> System.out.println(name));

//Rozpakowac Optional w bezpieczny sposob
        Person personOrException = personByPesel.orElseThrow(() -> new IllegalStateException(
                "Person with given pesel not exists"));

//Rozpakowac Optional przy uzyciu wartosci domyslnej
        String nameWithDefaultValue = personByPesel
                .map(person -> person.getName() + " " + person.getSurname())
                .orElseGet(() -> "No name");
        Boolean areBothNotExists = personProvider.findByPesel("13212132132")
                .or(() -> personProvider.findByPesel("123312412421"))
                .isEmpty();

/*
W klasie PersonProvider dopisz nową metodę, która wyszuka osobę
po imieniu i nazwisku (zawsze zwracamy pierwszą napotkaną).
1. Wyszukaj osobę po imieniu i nazwisku, następnie wyświetl jej datę urodzenia
w formie - (dzien liczbowo nazwa miesiaca rok)
2. Wyszukaj osobę po peselu, wyświetl jej datę urodzenia - gdy osoba nie
istnieje, odczytaj datę z peselu (zakładamy że PESEL z przed 2000 roku)
3. Wyszukaj osobę po imieniu i nazwisku, odfiltruj jesli ma niepoprawny pesel
(11 cyfr). Wyswietl pesel
4. Wyszukaj osobe po peselu, jesli jego imie nie konczy sie na A to rzuc
wyjatek IllegalStateException
5. Wyszukaj osobe po peselu, jesli nie istnieje utworz nowy obiekt Person
z imieniem NN, nazwiskiem NN, peselem jak podany i pustą data urodzenia.
Przypisz do zmiennej
         */

        //1
        personByName.ifPresent(person -> System.out.println("Osoba istnieje a jej pesel to: " + person.getBirthDate()));

        //2
        personByPesel.ifPresent(person -> System.out.println("Data urodzenia: " + person.getBirthDate()));

        //3
        personByName.filter(person -> person.getPesel().length() == 11).ifPresent(person -> System.out.println("Pesel: " + person.getPesel()));

        //4
        Person personException = personByName.orElseThrow(() -> new IllegalStateException("Wrong name ending."));

        //5

    }
}

