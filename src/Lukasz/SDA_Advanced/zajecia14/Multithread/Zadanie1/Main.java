package Lukasz.SDA_Advanced.zajecia14.Multithread.Zadanie1;

public class Main {

    public static void main(String[] args) {

        //1. Utworz klase watku, ktora wyswietli nam komunikat o nazwie tego watku.
        System.out.println("Nazwa wątku: ");

        new Thread(new ThreadName()).start();
        new Thread(new ThreadName()).start();
        new Thread(new ThreadName()).start();

       /*2. Utworz klase watku, ktory jako parametr przyjmie obiekt klasy Counter.
        W wątku wylosujemy 100 liczb, jesli liczba parzysta to inkrementejemy licznik,
                jesli liczba nieparzytsa to robimy dekrementacji. W main utworz trzy watki
        i zadbaj o synchronizacje.*/

        Counter counter = new Counter(0);

        Thread th1 = new RandomIncThread(counter);
        Thread th2 = new RandomIncThread(counter);
        Thread th3 = new RandomIncThread(counter);

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}

