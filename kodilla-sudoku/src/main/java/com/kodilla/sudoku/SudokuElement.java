package com.kodilla.sudoku;

import java.util.Arrays;

public class SudokuElement implements Cloneable{
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

    @Override
    public SudokuElement clone() throws CloneNotSupportedException {
        SudokuElement clonedElement = (SudokuElement) super.clone();
        clonedElement.value = value;
        clonedElement.possibleValues = Arrays.copyOf(possibleValues, 9);
        return clonedElement;
    }

    public void removePossibleValue(int valueToRemove) {
        for (int value : possibleValues) {
            if (value == valueToRemove) value = 0;
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasChosenOne() {
        int count = 0;
        for (int value : possibleValues) {
            if (value != 0) count++;
        }
        return count == 1;
    }

    public int chosenOne() {
        for (int value : possibleValues) {
            if (value != 0) {
                return value;
            }
        }
        return 0;
    }

    public boolean containsPossible(int value) {
        for (int possibleValue : possibleValues) {
            if (possibleValue == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return value == EMPTY ? " " : Integer.toString(value);
    }
}
