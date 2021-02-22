package Lukasz.SDA_Advanced.zajecia10.Zadanie2_Kompozycje.Wlasny;

public class Main {
    public static void main(String[] args) {

        Processor Cpu = new Processor("Intel", 6);
        GraphicCard Gpu = new GraphicCard("Msi", 8);
        Computer Pc = new Computer("Flash", Cpu, Gpu);
        Pc.showPC();

    }
}
