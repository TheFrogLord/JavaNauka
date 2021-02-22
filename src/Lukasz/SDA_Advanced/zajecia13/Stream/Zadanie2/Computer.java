package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie2;

import java.util.List;

public class Computer {

    private String producer;
    private int numberOfCores;
    private int hardDiskInGB;
    private String processorProducer;
    private List<String> installedSoftware;

    public Computer(String producer, int numberOfCores, int hardDiskInGB, String processorProducer, List<String> installedSoftware) {
        this.producer = producer;
        this.numberOfCores = numberOfCores;
        this.hardDiskInGB = hardDiskInGB;
        this.processorProducer = processorProducer;
        this.installedSoftware = installedSoftware;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", numberOfCores=" + numberOfCores +
                ", hardDiskInGB=" + hardDiskInGB +
                ", processorProducer='" + processorProducer + '\'' +
                ", installedSoftware=" + installedSoftware +
                '}';
    }

    public String getProducer() {
        return producer;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getHardDiskInGB() {
        return hardDiskInGB;
    }

    public String getProcessorProducer() {
        return processorProducer;
    }

    public List<String> getInstalledSoftware() {
        return installedSoftware;
    }
}
