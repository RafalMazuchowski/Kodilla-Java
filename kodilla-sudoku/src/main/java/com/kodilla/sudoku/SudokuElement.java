package com.kodilla.sudoku;

public class SudokuElement {
    public static int EMPTY = -1;
    int value;
    int[] possibleValues;

    public SudokuElement() {
        this.value = EMPTY;
        this.possibleValues = new int[]{1, 2, 3, 4, 5, 6, 8, 9};
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value==EMPTY?" ":Integer.toString(value);
    }
}
