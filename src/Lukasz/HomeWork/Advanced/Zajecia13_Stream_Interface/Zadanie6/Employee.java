package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie6;

public class Employee {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
