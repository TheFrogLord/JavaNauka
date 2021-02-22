package Lukasz.HomeWork.Advanced.Interface_enums.Zadanie3;

public class Main {
    public static void main(String[] args) {
        Man firstMan = new Man("George", 1.85, 92);
        Man secondMan = new Man("Frank", 1.78, 80);

        System.out.println(firstMan.compare(secondMan));
    }
}
