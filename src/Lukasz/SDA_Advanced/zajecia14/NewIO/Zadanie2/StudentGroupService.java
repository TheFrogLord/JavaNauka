package Lukasz.SDA_Advanced.zajecia14.NewIO.Zadanie2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class StudentGroupService {
    
    private static final String STUDENTS_FILE = "/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/kursanci.txt";
    private static final String GROUPS_FILE = "/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/grupy.txt";

    public void groupStudents() {
        List<Student> students = readStudents();
        Map<String, List<Student>> groupedStudents = groupStudents(students);
        saveGroups(groupedStudents);
    }

    private void saveGroups(Map<String, List<Student>> groups) {
        Path groupsFile = Paths.get(GROUPS_FILE);
        try (BufferedWriter writer = Files.newBufferedWriter(groupsFile, StandardOpenOption.CREATE)) {
            for (Map.Entry<String, List<Student>> entry : groups.entrySet()) {
                writer.write(entry.getKey() + System.lineSeparator());
                for (Student student : entry.getValue()) {
                    writer.write(student.getFirstName() + " " + student.getLastName() + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, List<Student>> groupStudents(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGroup, Collectors.toList()));
    }

    private List<Student> readStudents() {
        Path studentsPath = Paths.get(STUDENTS_FILE);
        try (BufferedReader reader = Files.newBufferedReader(studentsPath)) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .map(fields -> new Student(fields[0], fields[1], fields[2]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();

    }
}
