package Lukasz.SDA_Advanced.zajecia17.Wzorce_Operacyjne.Diagram;

import java.util.LinkedList;
import java.util.List;

public class Invoker {

    private List<Command> commands = new LinkedList<>();

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    public void invoke() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
