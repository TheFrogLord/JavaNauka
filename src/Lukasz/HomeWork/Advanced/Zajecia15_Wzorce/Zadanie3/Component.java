package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie3;

public interface Component {

    void printSubordinatesNames();

    void addElement(Component e);

    void getElement(long id);

    void removeElement(long id);

    long getId();
}

