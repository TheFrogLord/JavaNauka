package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Singleton;

public class MainTest {
    public static void main(String[] args) {

        User one = new User("Joanna", "Poroch", "885-223-005");
        User two = new User("Johnny", "Bravo", "654-206-895");

        SingletonDatabase.getInstance().showList();
        SingletonDatabase.getInstance().addUser(one);
        SingletonDatabase.getInstance().addUser(two);

        SingletonDatabase.getInstance().showList();
        SingletonDatabase.getInstance().getUser("Bravo");
    }
}
