package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Diagram;

public class SumCommand implements Command {

    private double first;
    private double second;


    public SumCommand(double first, double second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void execute() {
        String result = first
                        + " + " + second + " = "
                        + (first + second);

        Receiver.recieve(result);
    }
}
