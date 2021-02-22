package Lukasz.SDA_Advanced.zajecia10.Zadanie2_Kompozycje.Wlasny;

public class GraphicCard {

    private String producer;
    private int memory;

    public GraphicCard(String producer, int numberOfCores) {
        this.producer = producer;
        this.memory = memory;
    }

    public void showGPU() {
        System.out.println(producer + " gpu with " + memory + "GB GDDR5 memory." );
    }
}
