package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Observer;

public interface Fanpage {

        void attachObserver(Observer observer);

        void addPost(String content);

        void notifyObserver(String content);

}
