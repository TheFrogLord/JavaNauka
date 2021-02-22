package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie9;

public class  WavePattern {

    //Method that use 3 "for" loops to print wave pattern
    public void wavePattern(int row, int length) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k <= row * 2 - 1; k++) {

                    if (k == i || k == row * 2 - i - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
