package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie3;

import java.time.LocalTime;

public class Client {

    public static void main(String[] args) {

        LocalTime start = LocalTime.now();
        //System.out.println(start);

        Ceo ceo = new Ceo(1, "Santa Claus");
        Hod hod = new Hod(345456, "Zenon Martyniuk - HOD");
        Dm dm = new Dm(23667, "Martyna Wojciechowska - DM");
        Dm dm1 = new Dm(22667, "Papcio Chmiel - DM");
        Hr hr = new Hr(27768, "Pani Krystyna - HR");
        Programmer programmer = new Programmer(10, "Alek Smietana");
        Programmer programmer1 = new Programmer(11, "Monika Sewioło");
        Programmer programmer2 = new Programmer(12, "Miś Uszatek");

        ceo.addElement(hr);
        ceo.addElement(hod);
        hod.addElement(dm);
        hod.addElement(dm1);
        dm.addElement(programmer);
        dm1.addElement(programmer1);
        dm.addElement(programmer2);
        dm1.addElement(new Programmer(13, "Ringo Starro"));

        ceo.printSubordinatesNames();

        System.out.println("Team leader: " + hod.getName());
        hod.printSubordinatesNames();

        System.out.println("Team leader: " + dm.getName());
        dm.printSubordinatesNames();

        System.out.println("Team leader: " + dm1.getName());
        dm1.printSubordinatesNames();

        ceo.getElement(27768);
        dm1.getElement(13);

        dm.addElement(new Programmer(1010, "Hmmmm"));

        LocalTime stop = LocalTime.now();
        System.out.println("Start: " + start + "\n" + "Stop: " + stop);

    }
}
