package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie18i19;

import java.util.Objects;

public class Computer {

    private String processor;
    private int ram;
    private String graphicCard;
    private String company;
    private String model;

    public Computer(String processor, int ram, String graphicCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getProcessor().equals(computer.getProcessor())
                && getRam() == computer.getRam()
                && getGraphicCard().equals(computer.getGraphicCard())
                && getCompany().equals(computer.getCompany())
                && getModel().equals(computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessor(), getRam(),
                getGraphicCard(), getCompany(), getModel());
    }
}
