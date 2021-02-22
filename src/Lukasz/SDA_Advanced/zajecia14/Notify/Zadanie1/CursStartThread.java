package Lukasz.SDA_Advanced.zajecia14.Notify.Zadanie1;

public class CursStartThread extends Thread {

    private JavaCurse cursList;

    public CursStartThread(JavaCurse cursList) {
        this.cursList = cursList;
    }

    @Override
    public void run() {
        cursList.cursStart();
    }
}
