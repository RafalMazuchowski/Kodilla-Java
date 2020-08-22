package com.kodilla.sudoku;

public class SudokuElement {
    public static int EMPTY = -1;
    int value;
    int[] possibleValues;

    public SudokuElement(int value) {
        this.value = value;
        this.possibleValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public SudokuElement() {
        this.value = EMPTY;
        this.possibleValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasChosenOne () {
        int count = 0;
        for (int value:possibleValues) {
            if (value!=0) count++;
        }
        return count==1;
    }

    public int chosenOne () {
        for (int value:possibleValues) {
            if (value!=0){
                return value;
            }
        }
        return 0;
    }

    public boolean containsPossible (int value) {
        for (int possibleValue:possibleValues) {
            if (possibleValue==value){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return value==EMPTY?" ":Integer.toString(value);
    }
}
