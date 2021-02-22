package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie9.AnnaC;

public class FalaGwiazdek {
    public static int HIGHTVALUE = 4;
    public static int ONE_SEGMENT = 8;
    public static void main(String[] args) {
        int liczbaPodana = 128;

        // stoper start
        long start = System.currentTimeMillis();

        for (int i = 0; i <HIGHTVALUE ; i++) {
            int amountOfFullSegments = liczbaPodana/ONE_SEGMENT;
//            System.out.println(amountOfFullSegments);
            for (int j = 0; j < amountOfFullSegments; j++) {
                printLine(8,i);
            }
            int lastSegment = liczbaPodana%ONE_SEGMENT;
//            System.out.println(lastSegment);
            if(lastSegment != 0){
                printLine(lastSegment,i);
            }
            System.out.println();
        }
        //Stoper stop i wynik

        long stop = System.currentTimeMillis() - start;
        System.out.println("Stoper: " + stop + " milisekund");
//        for (int i = 0; i < HIGHTVALUE; i++) {
////            printLine(4,i);
//            printLine(8,i);
//            System.out.println();
//        }
    }
    public static void printLine(int liczbaPodana, int wiersz){
        for (int j = 0; j <liczbaPodana; j++) {
            if(j < 4){
                if (wiersz==j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }else{
                if(j==ONE_SEGMENT-1-wiersz){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
