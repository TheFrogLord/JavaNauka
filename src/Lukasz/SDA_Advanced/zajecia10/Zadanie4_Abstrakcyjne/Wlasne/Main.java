package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne.Wlasne;

public class Main {

    public static void main(String[] args) {

        Shark shark = new Shark("grey", "hammer shark" );
        Pike pike = new Pike("blue", 0.54, 5);

        System.out.println(shark.whereLive());
        shark.eat();

        System.out.println(pike.whereLive());
        pike.eat();
    }
}
