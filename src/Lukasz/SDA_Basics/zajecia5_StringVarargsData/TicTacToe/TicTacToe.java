package Lukasz.SDA_Basics.zajecia5_StringVarargsData.TicTacToe;

import Lukasz.HomeWork.Advanced.Exceptions.Zadanie4.Unchecked;

import java.util.Scanner;

public class TicTacToe {

    private final GameBoard board = new GameBoard();
    private final Scanner sc = new Scanner(System.in);
    private char currentPlayer = 'x';
    private int numberOfMoves = 0;

    public void play() {

        while (numberOfMoves++ < 9) {

//2. Print board
            board.printBoard();
            System.out.println();

//3. Takes coordinates and returns board
            readFromUser();

//4. Checking is conditions are validate
            if (checkIfWIN()) {
                board.printBoard();
                System.out.println();
                System.out.println("GRATULACJE GRACZU" + " [" + currentPlayer + "] " + ", WYGRAŁEŚ!!!");
                break;
            }
            changePlayer();
            if (numberOfMoves == 9) {
                board.printBoard();
                System.out.println();
                System.out.println("Mamy remis!!!");
            }
        }
    }

    private boolean checkIfWIN() {
        char[][] gameBoard = board.getGameBoard();

        if (checkVertically(gameBoard)) {
            return true;

        } else if (checkHorizontally(gameBoard)) {
            return true;

        } else if (checkDiagonal1(gameBoard)) {
            return true;

        } else return checkDiagonal2(gameBoard);

    }

    private boolean checkVertically(char[][] gameBoard) {
        int foundPlayerX = 0;
        int foundPlayerO = 0;

        for (int i = 0; i < gameBoard.length; i++) {

            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[j][i] == 'x') {
                    foundPlayerX++;
                }

                if (gameBoard[j][i] == 'o') {
                    foundPlayerO++;
                }

                if (foundPlayerX == gameBoard[i].length || foundPlayerO == gameBoard[i].length) {
                    return true;
                }
            }
            foundPlayerO = 0;
            foundPlayerX = 0;
        }
        return false;
    }

    private boolean checkHorizontally(char[][] gameBoard) {

        int foundPlayerX = 0;
        int foundPlayerO = 0;

        for (char[] chars : gameBoard) {

            for (int j = 0; j < gameBoard.length; j++) {

                if (chars[j] == 'x') {
                    foundPlayerX++;
                }

                if (chars[j] == 'o') {
                    foundPlayerO++;
                }

                if (foundPlayerX == gameBoard.length || foundPlayerO == gameBoard.length) {
                    return true;
                }
            }
            foundPlayerO = 0;
            foundPlayerX = 0;
        }
        return false;
    }

    private boolean checkDiagonal1(char[][] gameBoard) {
        boolean result = true;

        for (int j = 0; j < gameBoard.length; j++) {
            if (gameBoard[j][j] != currentPlayer || gameBoard[j][j] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean checkDiagonal2(char[][] gameBoard) {
        boolean result = true;

        for (int j = 0, i = gameBoard.length - 1; j < gameBoard.length; j++, i--) {
            if (gameBoard[i][j] != currentPlayer || gameBoard[i][j] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    private void changePlayer() {
        if (currentPlayer == 'x') {
            currentPlayer = 'o';
        } else {
            currentPlayer = 'x';
        }
    }

    private void readFromUser() {
        int x;
        int y;

        System.out.println("Graczu " + "[" + currentPlayer + "]" + ", proszę podać pole:");

        System.out.println("Proszę podać współrzędną x:");
        x = sc.nextInt();

        System.out.println("Proszę podać współrzędną y:");
        y = sc.nextInt();

        if (!board.setCharacter(currentPlayer, x, y)) {
            throw new Unchecked();
        }

    }
}

