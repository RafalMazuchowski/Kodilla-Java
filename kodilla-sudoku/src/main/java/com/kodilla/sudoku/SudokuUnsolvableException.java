package com.kodilla.sudoku;

public class SudokuUnsolvableException extends Exception {
    public SudokuUnsolvableException() {
        super("Sudoku unsolvable!");
    }
}
