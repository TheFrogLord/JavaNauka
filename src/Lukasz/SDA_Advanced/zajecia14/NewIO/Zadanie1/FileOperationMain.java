package Lukasz.SDA_Advanced.zajecia14.NewIO.Zadanie1;

import java.util.Scanner;

public class FileOperationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleOperation consoleOperation =
                new ConsoleOperation("/home/lukaszkedzierski/Pulpit");

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("@")) {
                break;
            }
            consoleOperation.runCommand(command);
        }
    }
}
