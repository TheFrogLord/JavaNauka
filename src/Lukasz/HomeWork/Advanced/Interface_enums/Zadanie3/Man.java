package Lukasz.HomeWork.Advanced.Interface_enums.Zadanie3;

public class Man implements Comparable{

    private final String name;
    private final double height;
    private final double weight;

    public Man(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String compare(Man otherMan) {

        if (otherMan.weight / Math.pow(otherMan.height, 2) > this.weight / Math.pow(this.height, 2)) {
            return otherMan.getName() + " ma wyższy index BMI";
        }
        else {
            return this.getName() + " ma wyższy index BMI";
        }
    }
}
