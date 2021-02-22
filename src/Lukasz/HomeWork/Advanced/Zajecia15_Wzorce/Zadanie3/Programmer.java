package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie3;

public class Programmer implements Component {

    private long id;
    private String name;

    public Programmer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printSubordinatesNames() {

    }

    @Override
    public void addElement(Component e) {

    }

    @Override
    public void getElement(long id) {

    }

    @Override
    public void removeElement(long id) {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " | " + name + " - programmer";
    }
}
