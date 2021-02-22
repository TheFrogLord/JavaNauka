package Lukasz.SDA_Advanced.zajecia14.Notify.Zadanie1;

public class MainCourse {

    public static void main(String[] args) throws InterruptedException {
        JavaCurse javaCurse = new JavaCurse();
        Thread startCourseTh = new CursStartThread(javaCurse);
        startCourseTh.start();

        for (int i = 0; i < 7; i++) {
            Thread addParticipantThread = new StudentRecordThread("Adam Malysz" + i, javaCurse);
            addParticipantThread.start();
            addParticipantThread.join();
            Thread.sleep(1000L);
        }

        javaCurse.toString();
    }
}

