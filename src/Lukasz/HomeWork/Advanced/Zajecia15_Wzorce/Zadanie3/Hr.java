package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie3;

public class Hr implements Component {

    private long id;
    private String name;

    public Hr(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void printSubordinatesNames() {

    }

    @Override
    public void addElement(Component e) {

    }

    @Override
    public void getElement(long id) {
        if (id == this.id) {
            System.out.println(name);
        }
    }

    @Override
    public void removeElement(long id) {
    }

    @Override
    public String toString() {
        return id + " | " + name;
    }

}
