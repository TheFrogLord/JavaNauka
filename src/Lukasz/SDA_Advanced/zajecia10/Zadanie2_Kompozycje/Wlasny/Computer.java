package Lukasz.SDA_Advanced.zajecia10.Zadanie2_Kompozycje.Wlasny;

public class Computer {

    private String model;
    private Processor type;
    private GraphicCard kind;

    public Computer(String model, Processor type, GraphicCard kind) {
        this.model = model;
        this.type = type;
        this.kind = kind;
    }

    public void showPC() {
        System.out.println("Personal computer with: ");
        System.out.println("GPU: ");
        kind.showGPU();
        System.out.println("CPU: ");
        type.toString();
    }
}
