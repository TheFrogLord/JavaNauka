package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie7;

public class Main {

    public static void main(String[] args) {

        Clip clip = new Clip(6);

        clip.loadBullet("bullet");
        clip.loadBullet("bullet");
        clip.loadBullet("bullet");
        clip.loadBullet("bullet");

        clip.shot();
        clip.shot();
        clip.shot();
        clip.shot();
        clip.shot();

    }
}
