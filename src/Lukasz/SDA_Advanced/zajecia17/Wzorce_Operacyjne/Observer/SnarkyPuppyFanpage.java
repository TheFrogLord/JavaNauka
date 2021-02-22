package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Observer;

import java.util.ArrayList;
import java.util.List;

public class SnarkyPuppyFanpage implements Fanpage {

    List<Observer> observers = new ArrayList<>();
    List<String> posts = new ArrayList<>();

    public SnarkyPuppyFanpage() {

    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void addPost(String content) {
        posts.add(content);
        for (Observer observer :observers) {
            observer.update(content);
        }
    }

    @Override
    public void notifyObserver(String content) {
        observers.forEach(observer -> observer.update(content));
    }

}
