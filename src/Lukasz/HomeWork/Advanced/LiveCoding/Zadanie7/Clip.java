package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie7;

import java.util.ArrayList;
import java.util.List;

public class Clip {

    private int clipCapacity;
    private List<String> list = new ArrayList<>();

    public Clip(int clipCapacity) {
        this.clipCapacity = clipCapacity;
    }

    public void loadBullet(String bullet) {
        if (list.size() <= clipCapacity - 1) {
            list.add(bullet);
        } else {
            System.out.println("Clip is fully loaded");
        }
    }

    public String isLoaded() {
        if (list.isEmpty()) {
            return "Clip is empty";
        }
        return "Clip is loaded";
    }

    public void shot() {
        int i = list.size() - 1;

        if (!list.isEmpty()) {
            list.remove(i);
            System.out.println("Bang");
        } else {
            System.out.println("Empty clip");
        }
    }
}
