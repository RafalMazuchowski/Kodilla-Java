package com.kodilla.sudoku;

public class SudokuApp {
    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            theGame.valueReader();
            try {
                gameFinished = theGame.resolveSudoku();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}