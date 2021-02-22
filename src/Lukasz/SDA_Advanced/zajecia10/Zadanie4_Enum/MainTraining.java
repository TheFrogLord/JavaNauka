package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum;

import java.util.Scanner;

public class MainTraining {
    public static void main(String[] args) {
        System.out.println("Wybierz temat kursu: ");
        TrainingSubject[] subjects = TrainingSubject.values();

        int index = 1;
        for (TrainingSubject subject : subjects) {
            System.out.println(index++ + ". " + subject.getDisplayName()
                    + " - " + subject.getHours() + "h");
        }
        System.out.println();

        System.out.println("Wybierz temat: ");

        Scanner scanner = new Scanner(System.in);
        String subjectLabel = scanner.nextLine();
        TrainingSubject subject = TrainingSubject.valueByDisplayName(subjectLabel);

        System.out.println("Wybrany temat to " + subject.getDisplayName());
        System.out.println("W ramach tego bloku nauczysz sie: ");
        for (String skill : subject.getSkills()) {
            System.out.println(skill);
        }
    }
}
