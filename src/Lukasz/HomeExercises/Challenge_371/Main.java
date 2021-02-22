package Lukasz.HomeExercises.Challenge_371;

public class Main {

    public static void main(String[] args) {
        int[] tab = {4, 2, 7, 3, 6, 8, 5, 1};

        System.out.println(queenChecker(tab));
    }

    public static boolean queenChecker(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if ((tab[i] == tab[j] - j + i || tab[i] == tab[j] + j - i || tab[i] == tab[j]) && i != j) return false;
            }
        }
        return true;

    }
}
