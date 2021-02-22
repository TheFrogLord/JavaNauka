package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie6;

import java.util.List;

public class Company {

    private final String name;
    private final List<Division> divisionList;

    public Company(String name, List<Division> divisionList) {
        this.name = name;
        this.divisionList = divisionList;
    }

    public String getName() {
        return name;
    }

    public List<Division> getDivisionList() {
        return divisionList;
    }

    @Override
    public String toString() {
        return "Oddziały: " + "\n" + divisionList;
    }
}
