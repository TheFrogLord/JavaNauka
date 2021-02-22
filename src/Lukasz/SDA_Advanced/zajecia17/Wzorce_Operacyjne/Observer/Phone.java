package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Observer;

public class Phone implements Observer {

    @Override
    public void update(String content) {
        System.out.println("Na stronie pojawił się nowy wpis");
        System.out.println("Proszę sprawdzić skrzynkę pocztową");

    }
}
