package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Observer;

public class Email implements Observer {


    @Override
    public void update(String content) {
        System.out.println("Nowa wiadomość: ");
        System.out.println(content);
        System.out.println();
    }
}
