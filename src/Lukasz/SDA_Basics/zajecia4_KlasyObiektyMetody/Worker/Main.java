package Lukasz.SDA_Basics.zajecia4_KlasyObiektyMetody.Worker;

public class Main {

    public static void main(String[] args) {

        Worker lukasz = new Worker("Łukasz", "Kędzierski", 39, "01.11.2020", 100, Worker.getNumberOfWorkers());

        Worker feliks = new Worker("Feliks", "Bąk", 32, "15.11.2020", 150, Worker.getNumberOfWorkers());

        Worker beata = new Worker("Beata", "Stefczyk", 25, "01.04.2020", 200, Worker.getNumberOfWorkers());

        Worker joe = new Worker("Joe", "Biden", 110, "03.05.1967", 2500000, Worker.getNumberOfWorkers());

        lukasz.showWorker();
        System.out.println();

        feliks.showWorker();
        System.out.println();

        beata.showWorker();

    }


}
