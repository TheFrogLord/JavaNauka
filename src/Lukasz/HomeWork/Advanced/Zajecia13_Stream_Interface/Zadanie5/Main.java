package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        5. Utwórz klasę PozycjaWTabeli oznaczającą pozycję klubu piłkarskiego w ligowej tabeli.
            Pola jakie się pojawią to: nazwa, liczba punktów, liczba strzelonych i straconych bramek.
            W main utwórzcie kilka klubów a następnie wyświetlcie tabele ligową w następujących konfiguracjach.
            5.1 : Od najlepszego do najgorszego klubu, decyduje w pierwszej kolejności liczba punktów, następnie liczba strzelonych bramek
            5.2 : Rosnąco według straconych bramek
            5.3 : Alfabetycznie po nazwie
            5.4 : Obliczyć ile zostało w sumie strzelonych bramek przez wszystkie kluby (IntStream)
         */

        List<PositionInATable> positions = new ArrayList<>();

        positions.add(new PositionInATable("ŁoPanie Świnoujście", 0, 1, 15));
        positions.add(new PositionInATable("ToNieMy Gdańsk", 10, 8, 5));
        positions.add(new PositionInATable("Turboptysie Kraśnik", 13, 14, 8));
        positions.add(new PositionInATable("ŁyseKonie Łysica", 4, 3, 21));
        positions.add(new PositionInATable("Pancerniki Bytom", 7, 10, 10));
        positions.add(new PositionInATable("Cherlawi Otwock", 0, 0, 13));

        //5.1
        System.out.println("Pozycja w tabeli: ");
        positions.stream()
                .sorted(Comparator.comparingInt(PositionInATable::getNumberOfPoints)
                .thenComparingInt(PositionInATable::getScoreNumber).reversed())
                .forEach(System.out::println);

        //5.2
        System.out.println("Pozycja w tabeli wg. straconych bramek: ");
        positions.stream()
                .sorted(Comparator.comparingInt(PositionInATable::getScoreAgainst))
                .forEach(System.out::println);

        //5.3
        System.out.println("Tabela wg. nazw: ");
        positions.stream()
                .sorted(Comparator.comparing(PositionInATable::getName))
                .forEach(System.out::println);

        //5.4
        System.out.println("Suma bramek wszystkich klubów: ");
        System.out.println(positions.stream().mapToInt(position -> position.getScoreNumber()).sum());

    }
}
