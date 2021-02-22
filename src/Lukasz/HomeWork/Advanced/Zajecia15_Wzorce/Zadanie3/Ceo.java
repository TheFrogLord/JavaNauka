package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Ceo implements Component {

    private long id;
    private String name;
    private List<Component> elements = new ArrayList<>();

    public Ceo(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printSubordinatesNames() {
        System.out.println("Ceo: " + name);
        for (Component e : elements) {
            System.out.println(e);
        }
        System.out.println();
    }

    @Override
    public void addElement(Component e) {
        elements.add(e);

    }

    @Override
    public void getElement(long id) {
        for (Component e : elements) {
            if (id == e.getId())
                System.out.println(e);
        }
    }

    @Override
    public void removeElement(long id) {
        for (Component e : elements) {
            if (id == e.getId())
                elements.remove(id);
        }
    }

    @Override
    public long getId() {
        return id;
    }
}
