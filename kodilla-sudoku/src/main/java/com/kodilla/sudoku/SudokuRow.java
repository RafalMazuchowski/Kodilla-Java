package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow implements Cloneable{
    ArrayList<SudokuElement> sudokuElements;

    @Override
    public SudokuRow clone() throws CloneNotSupportedException {
        SudokuRow clonedRow = (SudokuRow)super.clone();
        clonedRow.sudokuElements = new ArrayList<>();
        for (SudokuElement sudokuElement: sudokuElements){
            clonedRow.sudokuElements.add(sudokuElement.clone());
        }
        return clonedRow;
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
