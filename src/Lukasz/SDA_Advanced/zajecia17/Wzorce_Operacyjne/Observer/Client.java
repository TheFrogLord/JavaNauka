package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Observer;

public class Client {

    public static void main(String... args) {

        Fanpage fanpage = new SnarkyPuppyFanpage();
        fanpage.attachObserver(new Phone());
        fanpage.attachObserver(new Email());
        fanpage.addPost("koncert, super koncert, tra lalal");
        fanpage.addPost("koncert, suAlahjfkadiufhasef");
        fanpage.addPost("koncsjfhsudgfasf");
        fanpage.addPost("koncert, kuhafuhdyuhjrbewaudbjfufschfdusifvj ");
        fanpage.addPost("koncjdvjcj");
    }

}
