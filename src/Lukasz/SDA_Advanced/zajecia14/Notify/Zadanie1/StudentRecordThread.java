package Lukasz.SDA_Advanced.zajecia14.Notify.Zadanie1;

public class StudentRecordThread extends Thread {

    private String name;
    private JavaCurse cursList;

    public StudentRecordThread(String name, JavaCurse cursList) {
        this.name = name;
        this.cursList = cursList;
    }

    public void run() {
        cursList.recordName(name);

    }
}
