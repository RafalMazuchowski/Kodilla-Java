package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard implements Cloneable{

    ArrayList<SudokuRow> sudokuRows;

    public SudokuBoard() {
        this.sudokuRows = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.sudokuRows.add(new SudokuRow());
        }
    }

    @Override
    public SudokuBoard clone() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
        clonedBoard.sudokuRows = new ArrayList<>();
        for (SudokuRow sudokuRow : sudokuRows) {
            clonedBoard.sudokuRows.add(sudokuRow.clone());
        }
        return clonedBoard;
    }

    public void insertValue(int row, int element, int value) {
        this.sudokuRows.get(row).insertValue(element, value);
    }

    public boolean isSolved() {
        for (SudokuRow sudokuRow : sudokuRows) {
            for (SudokuElement sudokuElement : sudokuRow.sudokuElements) {
                if (sudokuElement.value == SudokuElement.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder board = new StringBuilder();
        for (SudokuRow sudokuRow : sudokuRows) {
            board.append(sudokuRow.toString()).append("\n");
        }
        return board.toString();
    }
}
