package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie4;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        4. Utwórzcie klasę Kandydat, w niej pola:
            imie i nazwisko
            znane technologie (kolekcja)
            wyksztalcenie
            lataDoswiadczenia
        Utwórzcie listę kandydatów i wykonajcie ćwiczenia:
            4.1. Wyswietl wszystkie technologie znane przez naszych kandydatow
            4.2. Policz kandydatow znajacych Jave i majacych 3+ doswiadczenia
            4.3. Wyswietl imie i nazwisko pierwszego kandydata, ktory zna SQL, ale nie ma doswiadczenia (exp==0)
            4.4. Znajdz kandydata o najwiekszej liczbie znanych technologii
            4.5. Czy mamy na liscie kandydata, ktory nie zna zadnych technologii?
         */

        CandidateList candidateList = new CandidateList();
        List<Candidate> candidates = candidateList.findAll();

        //4.1
        System.out.println("Znane technologie:");
        candidates.stream().map(candidate -> candidate.getKnownTechnology())
                .flatMap(tech -> tech.stream()).distinct().forEach(System.out::println);

        //4.2
        System.out.println("Ilość kandydatów znających Java, posiadających minimum 3 lata doświadczenia: ");
        System.out.println(candidates.stream()
                .filter(candidate -> candidate.getKnownTechnology().contains("Java")
                        && candidate.getEarsOfExperience() >= 3).count() + " osoba/y");

        //4.3
        System.out.println("Pierwszy kandydat bez doświadczenia, znający SQL: ");
        System.out.println(candidates.stream()
                .filter(candidate -> candidate.getKnownTechnology().contains("SQL")
                        && candidate.getEarsOfExperience() == 0).findFirst());

        //4.4
        System.out.println("Kandydat znający najwięcej technologii: ");
        System.out.println(candidates.stream()
                .max(Comparator.comparingInt(candidate -> candidate.getKnownTechnology().toArray().length)));

        //4.5
        System.out.println("Kandydat nie znający żadnych technologii: ");
        System.out.println(candidates.stream()
                .anyMatch(candidate -> candidate.getKnownTechnology().toArray().length == 0));


    }
}
