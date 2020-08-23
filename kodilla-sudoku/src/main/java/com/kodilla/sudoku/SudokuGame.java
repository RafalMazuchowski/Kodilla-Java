package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SudokuGame {
    SudokuBoard sudokuBoard;
    ArrayList<BackTrack> backTracks;
    Scanner scan = new Scanner(System.in);
    int[][][] sections = {
            {{0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}},
            {{0, 3}, {0, 4}, {0, 5}, {1, 3}, {1, 4}, {1, 5}, {2, 3}, {2, 4}, {2, 5}},
            {{0, 6}, {0, 7}, {0, 8}, {1, 6}, {1, 7}, {1, 8}, {2, 6}, {2, 7}, {2, 8}},
            {{3, 0}, {3, 1}, {3, 2}, {4, 0}, {4, 1}, {4, 2}, {5, 0}, {5, 1}, {5, 2}},
            {{3, 3}, {3, 4}, {3, 5}, {4, 3}, {4, 4}, {4, 5}, {5, 3}, {5, 4}, {5, 5}},
            {{3, 6}, {3, 7}, {3, 8}, {4, 6}, {4, 7}, {4, 8}, {5, 6}, {5, 7}, {5, 8}},
            {{6, 0}, {6, 1}, {6, 2}, {7, 0}, {7, 1}, {7, 2}, {8, 0}, {8, 1}, {8, 2}},
            {{6, 3}, {6, 4}, {6, 5}, {7, 3}, {7, 4}, {7, 5}, {8, 3}, {8, 4}, {8, 5}},
            {{6, 6}, {6, 7}, {6, 8}, {7, 6}, {7, 7}, {7, 8}, {8, 6}, {8, 7}, {8, 8}},
    };


    public SudokuGame() {
     /*   int[][] board = {
                {-1, 9, -1, -1, 4, -1, 8, -1, -1},
                {5, -1, 1, 8, -1, -1, -1, -1, -1},
                {4, -1, -1, -1, -1, -1, 7, -1, -1},
                {8, 3, 5, -1, 2, -1, -1, -1, -1},
                {1, -1, 7, -1, 3, -1, -1, -1, -1},
                {-1, 2, 9, -1, -1, -1, -1, -1, -1},
                {-1, 8, -1, -1, -1, 9, 2, 3, -1},
                {-1, -1, -1, 2, -1, -1, -1, -1, -1},
                {-1, -1, 2, -1, 7, 5, 4, 9, -1},
        };*/
        int[][] board = {
                {-1, 2, -1, 5, -1, 1, -1, 9, -1},
                {8, -1, -1, 2, -1, 3, -1, -1, 6},
                {-1, 3, -1, -1, 6, -1, -1, 7, -1},
                {-1, -1, 1, -1, -1, -1, 6, -1, -1},
                {5, 4, -1, -1, -1, -1, -1, 1, 9},
                {-1, -1, 2, -1, -1, -1, 7, -1, -1},
                {-1, 9, -1, -1, 3, -1, -1, 8, -1},
                {2, -1, -1, 8, -1, 4, -1, -1, 7},
                {-1, 1, -1, 9, -1, 7, -1, 6, -1},
        };
       /* int[][] board = {
                {-1, 2, -1, 5, -1, 1, -1, 9, -1},
                {8, -1, -1, 2, -1, 3, -1, -1, 6},
                {-1, 3, -1, -1, 6, -1, -1, 7, -1},
                {-1, -1, 1, 3, 8, -1, 6, -1, -1},
                {5, 4, -1, -1, 2, -1, -1, 1, 9},
                {-1, -1, 2, -1, 4, -1, 7, -1, -1},
                {-1, 9, -1, -1, 3, -1, -1, 8, -1},
                {2, -1, -1, 8, -1, 4, -1, -1, 7},
                {-1, 1, -1, 9, -1, 7, -1, 6, -1},
        };*/
        /*int[][] board = {
                {4, 2, 6, 5, 7, 1, 3, 9, 8},
                {8, 5, 7, 2, 9, 3, 1, 4, 6},
                {1, 3, 9, 4, 6, 8, 2, 7, 5},
                {9, 7, 1, 3, 8, 5, 6, 2, 4},
                {5, 4, 3, 7, 2, 6, 8, 1, 9},
                {6, 8, 2, 1, 4, 8, 7, 5, 3},
                {7, 9, 4, 6, 3, 2, 5, 8, 1},
                {2, 6, 5, 8, 1, 4, 9, 3, 7},
                {3, -1, -1, 9, 5, 7, -1, 6, 2}
        };*/
        this.sudokuBoard = new SudokuBoard(board);
        backTracks = new ArrayList<>();
        System.out.println(sudokuBoard.toString());
    }


    public boolean alreadyTaken(int value, ArrayList<SudokuElement> sudokuElements) {
        for (SudokuElement sudokuElement : sudokuElements) {
            if (sudokuElement.value == value) {
                return true;
            }
        }
        return false;
    }

    public boolean isOnlyOptionForSection(int value, int sudokuElementIndexToOmit, ArrayList<SudokuElement> sudokuElements) {
        for (int i = 0; i < 9; i++) {
            if (i != sudokuElementIndexToOmit
                    && sudokuElements.get(i).value == SudokuElement.EMPTY
                    && sudokuElements.get(i).containsPossible(value)) {
                return false;
            }
        }
        return true;
    }

    public boolean tryInsert(int value, SudokuElement sudokuElement, ArrayList<SudokuElement> sudokuElements) throws SudokuUnsolvableException {
        if (!alreadyTaken(value, sudokuElements)) {
            sudokuElement.value = value;
            return true;
        } else {
            throw new SudokuUnsolvableException();
        }
    }

    public boolean resolveSection(ArrayList<SudokuElement> sudokuElements) throws SudokuUnsolvableException {
        boolean actionPerformed = false;
        for (int s = 0; s < 9; s++) {
            SudokuElement sudokuElement = sudokuElements.get(s);
            if (sudokuElement.value == SudokuElement.EMPTY) {
                for (int i = 0; i < 9; i++) {
                    int possibleValue = sudokuElement.possibleValues[i];
                    if (possibleValue != 0) {
                        if (alreadyTaken(possibleValue, sudokuElements)) {
                            sudokuElement.possibleValues[i] = 0;
                            actionPerformed = true;
                            if (sudokuElement.hasChosenOne() && tryInsert(sudokuElement.chosenOne(), sudokuElement, sudokuElements)) {
                                break;
                            }
                        } else {
                            if (isOnlyOptionForSection(possibleValue, s, sudokuElements)
                                    && tryInsert(possibleValue, sudokuElement, sudokuElements)) {
                                actionPerformed = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return actionPerformed;
    }

    private boolean iterate() throws SudokuUnsolvableException {
        boolean actionPerformed = false;
        //horizontal
        for (SudokuRow sudokuRow : this.sudokuBoard.sudokuRows) {
            boolean actionPerformedHorizontal = resolveSection(sudokuRow.sudokuElements);
            if (actionPerformedHorizontal) {
                actionPerformed = true;
            }
        }

        //vertical
        for (int i = 0; i < 9; i++) {
            ArrayList<SudokuElement> sudokuElements = new ArrayList<>();
            for (SudokuRow sudokuRow : this.sudokuBoard.sudokuRows) {
                sudokuElements.add(sudokuRow.sudokuElements.get(i));
            }
            boolean actionPerformedVertical = resolveSection(sudokuElements);
            if (actionPerformedVertical) {
                actionPerformed = true;
            }
        }

        //squares
        for (int[][] section : sections) {
            ArrayList<SudokuElement> sudokuElements = new ArrayList<>();
            for (int[] cell : section) {
                sudokuElements.add(this.sudokuBoard.sudokuRows.get(cell[0]).sudokuElements.get(cell[1]));
            }
            boolean actionPerformedSquares = resolveSection(sudokuElements);
            if (actionPerformedSquares) {
                actionPerformed = true;
            }
        }
        return actionPerformed;
    }

    public void valueReader() {
        Pattern pattern = Pattern.compile("([1-9]),([1-9]),([1-9])");
        System.out.println("INSERT INITIAL VALUES...");
        String input = "S";//scan.nextLine();
        while (!input.equals("S")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("Row: " + matcher.group(1) + ", Element: " + matcher.group(2));
                System.out.println("Value: " + matcher.group(3));
                this.sudokuBoard.insertValue(Integer.parseInt(matcher.group(1)) - 1,
                        Integer.parseInt(matcher.group(2)) - 1,
                        Integer.parseInt(matcher.group(3)));
                System.out.println(sudokuBoard.toString());
            } else {
                System.out.println("Wrong pattern!");
                System.out.println("Try again");
            }
            input = scan.nextLine();
        }
    }

    public BackTrack guess() throws CloneNotSupportedException {
        BackTrack backTrack = new BackTrack();
        backTrack.sudokuBoard = sudokuBoard.clone();
        for (int i = 0; i < 9; i++) {
            SudokuRow sudokuRow = sudokuBoard.sudokuRows.get(i);
            for (int j = 0; j < 9; j++) {
                SudokuElement sudokuElement = sudokuRow.sudokuElements.get(j);
                if (sudokuElement.value == SudokuElement.EMPTY) {
                    for (int value : sudokuElement.possibleValues) {
                        if (value != 0) {
                            backTrack.guessedValue = value;
                            backTrack.guessedRowIndex = i;
                            backTrack.guessedElementIndex = j;
                            sudokuBoard.sudokuRows.get(i).sudokuElements.get(j).value = value;
                            return backTrack;
                        }
                    }
                }
            }
        }
        return backTrack;
    }

    public boolean resolveSudoku() throws CloneNotSupportedException {
        boolean finished = false;
        while (!finished) {
            boolean actionPerformed = true;
            while (actionPerformed) {
                try {
                    actionPerformed = iterate();
                } catch (Exception e) {
                    if (e.getClass() == SudokuUnsolvableException.class) {
                        BackTrack backTrack = backTracks.get(backTracks.size() - 1);
                        sudokuBoard = backTrack.sudokuBoard.clone();
                        sudokuBoard.sudokuRows.get(backTrack.guessedRowIndex)
                                .sudokuElements.get(backTrack.guessedElementIndex)
                                .removePossibleValue(backTrack.guessedValue);
                        backTracks.remove(backTrack);
                        break;
                    } else {
                        System.out.println("Potentially unsolvable");
                    }
                }
            }
            System.out.println(sudokuBoard.toString());
            if (sudokuBoard.isSolved()) {
                System.out.println("Solved!");
                finished = true;
            } else {
                System.out.println("Guessing...");
                backTracks.add(guess());
            }
        }
        System.out.println("PLAY AGAIN? (Y/N)");
        String input = scan.nextLine();
        return !input.equals("y") && !input.equals("Y");
    }
}

