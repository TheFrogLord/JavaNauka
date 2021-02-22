package Lukasz.SDA_Basics.zajecia5_StringVarargsData.TicTacToe;

public class GameBoard {

    private final char[][] gameBoard;

    public GameBoard() {
        this.gameBoard = new char[3][3];
    }

    public boolean setCharacter(char symbol, int x, int y) {
        if (gameBoard[x][y] == 0) {
            gameBoard[x][y] = symbol;
            return true;
        }
        return false;
    }

    public void printBoard() {
        System.out.println("\tY\tY\tY");
        System.out.println("\t0\t1\t2");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print("X" + i + "\t");
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public char[][] getGameBoard() {
        char[][] copy = new char[gameBoard.length][gameBoard[0].length];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                copy[i][j] = gameBoard[i][j];

            }
        }
        return copy;
    }

}
