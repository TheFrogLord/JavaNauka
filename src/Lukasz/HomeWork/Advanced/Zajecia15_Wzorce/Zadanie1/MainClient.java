package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie1;

import java.util.Arrays;

public class MainClient {
    public static void main(String[] args) {

        /*
        Zad1. Stwórz buildera umożliwiającego	stworzenie	konta	na	forum	internetowym.	Obiekt
              Profile powinien zawierać	następujące	pola:	firstName,	lastName,	nick,	email,
              phoneNumber,	age, facebookAddress,	city,	List<String>	interests.	Pola	pogrubione
              traktujemy jako obowiązkowe	do	zbudowania	obiektu,	reszta	pól	jest	opcjonalna.
              Przykład	użycia:
              new Profile.ProfileBuilder(‘’crazy781’’,	‘’crazy@email.com’’)
              .firstName(‘’Jon’’)
              .lastName(‘’Doe’’)
              .build();
         */

        Profile result = new Profile.ProfileBuilder("zabson", "aaa@onet.pl")
                .setFirstName("Hanna")
                .setCity("Lublin")
                .setInterests(Arrays.asList("hahaha", "noTak"))
                .build();

        System.out.println(result);

    }
}
