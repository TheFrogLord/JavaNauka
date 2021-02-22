package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie6;

import java.util.*;

public class Team {

    private final List<Employee> employeeList;
    private final String name;

    public Team(String name, List<Employee> employeeList) {
        this.employeeList = employeeList;
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + employeeList + "\n";

    }
}
