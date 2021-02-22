package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie2;

import java.util.*;
import java.util.stream.Collectors;

public class MainEx2 {

    public static void main(String[] args) {

        ComputerFinder computerFinder = new ComputerFinder();
        List<Computer> computers = computerFinder.findAll();

        /**
         * 1. Wyświetl wszystkie komputery ASUS
         * 2. Zapisz do nowej kolekcji komputery z procesorem AMD
         * 3. Znajdź średni rozmiar dysku w naszych komputerach
         * 4. Znajdz komputer z najwieksza iloscia core
         * 5. Znajdz komputery, ktore nie maja zainstalowanego softu
         * 6. Czy wsrod naszych komputerow jest jakis z zainstalowym IntelliJ
         * 7. Ile komputerow ma Office
         * 8. Policz, ile roznych programow zainstalowano na naszych komputerach
         * 9. Policz, ile sumarycznie przestrzeni dyskowej maja nasz komputery
         * 10. Wyswietl wszystkich producentow procesorow - unikalnych
         * 11. Znajdz dowolny komputer wyprodukowany przez Sony
         */

        //1.
        long isAsus = computers.stream().filter(computer -> "ASUS".equalsIgnoreCase(computer.getProducer())).count();
        System.out.println("Liczba komputerów marki Asus: " + isAsus);

        //2.
        List<Computer> withAmd = computers.stream()
                .filter(computer -> "Amd".equalsIgnoreCase(computer.getProcessorProducer())).collect(Collectors.toList());


        //3.
        OptionalDouble averageDiskSpace = computers.stream()
                .mapToInt(computer -> computer.getHardDiskInGB())
                .average();
        averageDiskSpace.ifPresent(avg -> System.out.println("Sredni rozmiar dysku: " + avg));

        //4.
        Optional<Computer> maxCores = computers.stream()
                .max(Comparator.comparingInt(computer -> computer.getNumberOfCores()));

        //5. Znajdz komputery, ktore nie maja zainstalowanego softu
        List<Computer> computersWithoutSoft = computers.stream()
                .filter(comp -> comp.getInstalledSoftware().isEmpty())
                .collect(Collectors.toList());

        //6. Czy wsrod naszych komputerow jest jakis z zainstalowym IntelliJ
        boolean isIntellijInstalled = computers.stream()
                .anyMatch(comp -> comp.getInstalledSoftware().contains("IntelliJ"));

        //7. Ile komputerow ma Office
        long numberOfCompsWithOffice = computers.stream()
                .filter(comp -> comp.getInstalledSoftware().contains("Office"))
                .count();

        //8. Policz, ile roznych programow zainstalowano na naszych komputerach
        long numberOfUniqueSoftware = computers.stream()
                .map(comp -> comp.getInstalledSoftware())
                .flatMap(soft -> soft.stream())
                .distinct()
                .count();

        //9. Policz, ile sumarycznie przestrzeni dyskowej maja nasz komputery
        //intStream
        int sumOfHardDiskSpace = computers.stream()
                .mapToInt(comp -> comp.getHardDiskInGB())
                .sum();
        //reduce
        Integer sumOfHardDiskSpaceWithReduce = computers.stream()
                .map(comp -> comp.getHardDiskInGB())
                .reduce(0, (hd1, hd2) -> hd1 + hd2);

        //10. Wyswietl wszystkich producentow procesorow - unikalnych
        computers.stream()
                .map(comp -> comp.getProcessorProducer())
                .distinct()
                .forEach(System.out::println);

        //11. Znajdz dowolny komputer wyprodukowany przez Sony
        Optional<Computer> sonyComputer = computers.stream()
                .filter(comp -> "Sony".equalsIgnoreCase(comp.getProducer()))
                .findAny();
        sonyComputer.ifPresent(System.out::println);
    }
}
