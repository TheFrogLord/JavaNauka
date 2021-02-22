package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie26;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer {

    public String name;
    public int yearOfCreation;
    List<Model> models;
    static List<String> manufacturersNames = new ArrayList<>();//tworze statyczna liste z nazwami producentow

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
        if (manufacturersNames != null) {
            manufacturersNames.add(name);
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public List<Model> getModels() {
        return models;
    }

    public void addModel(Model model) {
        models.add(model);
    }

    public static void getManufacturerName() {
        System.out.println("Manufacturers names: ");
        for (String s : manufacturersNames) {
            System.out.println(s);
        }
    }
}

