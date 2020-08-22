package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {
    ArrayList<SudokuElement> sudokuElements;

    public SudokuRow(int[] elements) {
        this.sudokuElements = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.sudokuElements.add(new SudokuElement(elements[i]));
        }
    }

    public SudokuRow() {
        this.sudokuElements = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.sudokuElements.add(new SudokuElement());
        }
    }

    public void insertValue (int element, int value){
        this.sudokuElements.get(element).setValue(value);
    }

    @Override
    public String toString() {
        StringBuilder row = new StringBuilder();
        for (SudokuElement sudokuElement:sudokuElements) {
            row.append("|").append(sudokuElement.toString());
        }
        row.append("|");
        return row.toString();
    }
}
