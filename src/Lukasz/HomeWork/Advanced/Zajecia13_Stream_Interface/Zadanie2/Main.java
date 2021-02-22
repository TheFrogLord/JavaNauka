package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie2;

public class Main {
    public static void main(String[] args) {

        /*
        Chcąc stworzyć listę i napełnić ją obiektami musimy robić:
        List<Kot> cats = new ArrayList<>();
        cats.add(new Kot("Mruczek"));
        cats.add(new Kot("Filemon"));
        Musicie przyznać że to dosyć niewygodne. Napiszmy więc klasę Lists,
        a w niej statyczną metodę generyczną createArrayList,
        która przyjmie dowolną liczbę parametrów (varargs) i utworzy z niej ArrayList,
        która zostanie zwrócona.
        List<Kot> = Lists.createArrayList(new Kot("Mruczek"), new Kot("Filemon"));
        W rezultacie chcemy, aby oba zapisy dały ten sam efekt.
         */

        Lists.createArrayLIst(new Cat('X'), new Cat("Filemon"), new Cat("Bonifacy"));
    }
}
