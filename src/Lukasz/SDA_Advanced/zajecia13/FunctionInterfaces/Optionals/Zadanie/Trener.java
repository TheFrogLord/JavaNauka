package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Optionals.Zadanie;

import Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Optionals.Person;
import Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Optionals.PersonProvider;

import java.time.LocalDate;
import java.util.Optional;

public class Trener {
    public static void main(String[] args) {

        PersonProvider personProvider = new PersonProvider();

        //1
        personProvider.findByName("Adam", "Małysz")
                .map(Person::getBirthDate)
                .map(birthDate ->
                        birthDate.getDayOfMonth() + " " + birthDate.getMonth().name() + " " + birthDate.getYear())
                .ifPresent(System.out::println);//formattedDate -> System.out.println(formattedDate)

        //2
        String pesel = "81122104217";
        Optional<LocalDate> birthDate = personProvider.findByPesel(pesel)
                .map(Person::getBirthDate)
                .or(() -> Optional.of(LocalDate.of(
                        Integer.parseInt("19" + pesel.substring(0, 2)),
                        Integer.parseInt(pesel.substring(2, 4)),
                        Integer.parseInt(pesel.substring(4, 6))
                )));

        //3
        personProvider.findByName("Adam", "Małysz")
                .map(Person::getPesel)
                .filter(Trener::isValidPesel)//pesel -> isValidPesel(pesel)
                .ifPresent(System.out::println); //pesel -> System.out.println(pesel)

        //4
        personProvider.findByPesel("12312123123")
                .filter(person -> person.getName().endsWith("a"))
                .orElseThrow(IllegalStateException::new);

        //5
        Person person = personProvider.findByPesel(pesel)
                .orElseGet(() -> new Person("NN", "NN", pesel, null));
    }

    private static boolean isValidPesel(String pesel) {
        if (pesel.length() != 11) {
            return false;
        }
        for (Character character : pesel.toCharArray()) {
            if (!Character.isDigit(character)) {
                return false;
            }
        }
        return true;
    }
}
