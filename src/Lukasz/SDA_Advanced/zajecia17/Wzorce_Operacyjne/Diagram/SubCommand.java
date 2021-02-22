package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Diagram;

public class SubCommand implements Command {

    private double first;
    private double second;

    public SubCommand(double first, double second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void execute() {
        String result = first
                + " - " + second + " = "
                + (first - second);

        Receiver.recieve(result);


    }
}
