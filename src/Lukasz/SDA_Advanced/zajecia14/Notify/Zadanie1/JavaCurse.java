package Lukasz.SDA_Advanced.zajecia14.Notify.Zadanie1;

import java.util.List;

public class JavaCurse {

    private List<String> studentsList;

    public synchronized  void cursStart() {
        while (studentsList.size() < 5) {
            System.out.println("Za mała liczba studentów");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Kurs sie rozpoczyna");
        studentsList.forEach(System.out::println);
    }

    public synchronized void recordName(String name) {
        System.out.println("Dopisanie uczestnika");
        studentsList.add(name);
        notify();

    }
}
