package Lukasz.SDA_Advanced.zajecia10.Zadanie2_Kompozycje.Wlasny;

public class Processor {

    private String producer;
    private int numberOfCores;

    public Processor(String producer, int numberOfCores) {
        this.producer = producer;
        this.numberOfCores = numberOfCores;
    }

    public String toString() {
        return "Processor " + producer + "with " + numberOfCores + "cores";
    }
}
