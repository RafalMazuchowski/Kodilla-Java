package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard {

    ArrayList<SudokuRow> sudokuRows;

    public SudokuBoard(int[][] board) {
        this.sudokuRows = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.sudokuRows.add(new SudokuRow(board[i]));
        }
    }

    public SudokuBoard() {
        this.sudokuRows = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.sudokuRows.add(new SudokuRow());
        }
    }

    public void insertValue (int row, int element, int value){
        this.sudokuRows.get(row).insertValue(element, value);
    }

    public boolean isSolved () {
        for (SudokuRow sudokuRow:sudokuRows){
            for(SudokuElement sudokuElement:sudokuRow.sudokuElements){
                if (sudokuElement.value==SudokuElement.EMPTY){
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
//            board += "-------------------\n";
            board.append(sudokuRow.toString()).append("\n");
        }
//        board += "-------------------\n";
        return board.toString();
    }
}
