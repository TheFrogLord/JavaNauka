package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie2;

public class Cat<T> {

    private T name;

    public Cat(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
