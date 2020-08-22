package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard {

    ArrayList<SudokuRow> sudokuRows;

    public SudokuBoard() {
        this.sudokuRows = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.sudokuRows.add(new SudokuRow());
        }
    }

    public void insertValue (int row, int element, int value){
        this.sudokuRows.get(row).insertValue(element, value);
    }

    @Override
    public String toString() {

        StringBuilder board = new StringBuilder();
        for (SudokuRow sudokuRow : sudokuRows) {
//            board += "-------------------\n";
            board.append(sudokuRow.toString()).append("\n");
        }
//        board += "-------------------\n";
        return board.toString();
    }
}
