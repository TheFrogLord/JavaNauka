package Lukasz.SDA_Advanced.zajecia12.Collections.Zadanie2;
//Wczytaj od użyt. 10 liczb
//1. Usuńmy kolekcji liczby podzielne przez 3 i 5
//2. Mamy wyświetlić liczby posortowane
//3. Obliczmy średnią tych liczb

import java.util.*;

public class MainEx {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");

        for (int i = 0; i < 10; i++) {
            numberList.add(scanner.nextInt());
        }
        //1.) - Najlepszy sposób na usuwanie elementów za pomocą pętli
        Iterator<Integer> iterator = numberList.listIterator();
        while (iterator.hasNext()) {
            Integer nextElement = iterator.next();
            if (nextElement % 3 == 0 || nextElement % 5 == 0) {
                iterator.remove();
            }
        }
        //2.)
        Collections.sort(numberList);
        for (Integer number : numberList) {
            System.out.print(number + ", ");
        }
        //3.)
        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        System.out.println("\nSrednia: " + (double) sum / numberList.size());

    }
}
