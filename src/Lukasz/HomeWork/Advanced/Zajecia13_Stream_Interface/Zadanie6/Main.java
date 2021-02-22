package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        6. Piszemy system dla firmy.
        Mamy następujące klasy: Firma, Oddział, Zespół, Pracownik.
        Firma posiada listę oddziałów, oddział posiada listę zespołów,
        a każdy zespół listę pracowników.
        W Main utwórzcie firmę, która ma conajmniej 2 oddziały,
        z czego każdy ma 2 zespoły z niepustą liczbą pracowników.
        Wyświetl:
            6.1 : Nazwę i liczebość każdego z oddziałów.
            6.2 : Listę imion i nazwisk pracowników posortowaną alfabetycznie
            6.3 : Za pomocą reduce utworzyć zespół stworzony z wszystkich pracowników firmy
         */

        Employee one = new Employee("Johnny Bravo");
        Employee two = new Employee("Triss Merigold");
        Employee three = new Employee("Pinokio Morawiecki");
        Employee four = new Employee("Lech Roch");
        Employee five = new Employee("Mirek Trzeciak");
        Employee six = new Employee("Bolesława Przepiórka");
        Employee seven = new Employee("Adam Ewacki");
        Employee eight = new Employee("Ewa Adamska");
        Employee nine = new Employee("Ewa Adamskaaaa");

        Team teamBlue = new Team("Blue", Arrays.asList(one, two, nine));
        Team teamRed = new Team("Red", Arrays.asList(three, four));
        Team teamYellow = new Team("Yellow", Arrays.asList(five, six));
        Team teamGreen = new Team("Green", Arrays.asList(seven, eight));

        Division northDivision = new Division("Północ", Arrays.asList(teamBlue, teamRed));
        Division southDivision = new Division("Południe", Arrays.asList(teamYellow, teamGreen));

        Company company = new Company("Top Market", Arrays.asList(northDivision, southDivision));

        List<Division> divisions = company.getDivisionList();


        //6.1

        int northDivisionPeople = (int) divisions.stream() //przypisanie liczby pracowników do oddziału północnego
                .filter(division -> "Północ".equalsIgnoreCase(division.getName()))
                .flatMap(division -> division.getTeamList().stream())
                .mapToLong(team -> team.getEmployeeList().size()).sum();

        int southDivisionPeople = (int) divisions.stream() //przypisanie liczby pracowników do oddziału południowego
                .filter(division -> "Południe".equalsIgnoreCase(division.getName()))
                .flatMap(division -> division.getTeamList().stream())
                .mapToLong(team -> team.getEmployeeList().size()).sum();

        System.out.println("Ilość pracowników:\n" + northDivision.getName()
                + ": " + northDivisionPeople + "\n" + southDivision.getName()
                + ": " + southDivisionPeople + "\n");

        //6.2
        System.out.println("Lista pracowników alfabetycznie: ");
        //flatMap jako stream zbierający wszystkich pracowników
        divisions.stream().flatMap(division -> division.getTeamList().stream())
                .flatMap(team -> team.getEmployeeList().stream())
                .map(Employee::getName).sorted().forEach(System.out::println);


        //6.3
        String oneTeamList = divisions.stream()
                .flatMap(division -> division.getTeamList().stream())
                .flatMap(team -> team.getEmployeeList().stream())
                .map(Employee::getName)
                .reduce("", (nameA, nameB) -> nameA + " | " + nameB);
        System.out.println("Połączony zespół: \n" + oneTeamList);


    }
}
