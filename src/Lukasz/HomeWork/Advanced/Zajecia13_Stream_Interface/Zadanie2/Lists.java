package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

    private static List<Cat> cats = new ArrayList<>();

    public static void createArrayLIst(Cat... name) {

        //dodanie wszystkich kotów do listy za pomocą klasy Collections
        Collections.addAll(cats, name);

        //wyswietlam koty - mozliwe jest uzycie petli.
        System.out.print("Mamy Koty o imionach:\n" + cats.toString());

    }
}
