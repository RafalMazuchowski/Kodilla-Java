package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SudokuGame {
    SudokuBoard sudokuBoard;
    Scanner scan = new Scanner(System.in);


    public SudokuGame() {
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
        this.sudokuBoard = new SudokuBoard(board);
        System.out.println(sudokuBoard.toString());
    }


    public boolean contains(int value, ArrayList<SudokuElement> sudokuElements) {
        for (SudokuElement sudokuElement : sudokuElements) {
            if (sudokuElement.value == value) {
                return true;
            }
        }
        return false;
    }

    public boolean canInsert(int value, int sudokuElementIndex, ArrayList<SudokuElement> sudokuElements) {
        for (int i = 0; i < 9; i++) {
            if (i != sudokuElementIndex && sudokuElements.get(i).value == SudokuElement.EMPTY && sudokuElements.get(i).containsPossible(value)) {
                return false;
            }
        }
        return true;
    }

    public boolean resolveSection(ArrayList<SudokuElement> sudokuElements) throws Exception {
        boolean actionPerformed = false;
        for (int s = 0; s < 9; s++) {
            SudokuElement sudokuElement = sudokuElements.get(s);
            if (sudokuElement.value == SudokuElement.EMPTY) {
                for (int i = 0; i < 9; i++) {
                    int pos = sudokuElement.possibleValues[i];
                    if (pos != 0) {

                        if (contains(pos, sudokuElements)) {
                            sudokuElement.possibleValues[i] = 0;
                            actionPerformed = true;
                            if (sudokuElement.hasChosenOne()) {
                                if (canInsert(sudokuElement.chosenOne(), s, sudokuElements)) {
                                    sudokuElement.value = sudokuElement.chosenOne();
                                    break;
                                } else throw new Exception("Unsolvable!");
                            }
                        } else {
                            if (canInsert(pos, s, sudokuElements)) {
                                sudokuElement.value = pos;
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

    private boolean iterate() throws Exception {
        boolean actionPerformed = false;
        //horizontal
        for (SudokuRow sudokuRow : this.sudokuBoard.sudokuRows) {
            actionPerformed = resolveSection(sudokuRow.sudokuElements);
        }

        //vertical
        for (int i = 0; i < 9; i++) {
            ArrayList<SudokuElement> sudokuElements = new ArrayList<>();
            for (SudokuRow sudokuRow : this.sudokuBoard.sudokuRows) {
                sudokuElements.add(sudokuRow.sudokuElements.get(i));
            }
            actionPerformed = resolveSection(sudokuElements);
        }

        //squares
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                ArrayList<SudokuElement> sudokuElements = new ArrayList<>();
                for (int i = m * 3; i < m * 3 + 3; i++) {
                    for (int j = n * 3; j < n * 3 + 3; j++) {
                        sudokuElements.add(this.sudokuBoard.sudokuRows.get(i).sudokuElements.get(j));
                    }
                }
                actionPerformed = resolveSection(sudokuElements);
            }
        }
        return actionPerformed;
    }

    public void valueReader() {
        Pattern pattern = Pattern.compile("([1-9]),([1-9]),([1-9])");
        System.out.println("INSERT INITIAL VALUES...");
        String input = scan.nextLine();
        while (!input.equals("SUDOKU")) {
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

    public boolean resolveSudoku() throws Exception {
        boolean actionPerformed = true;
        while (actionPerformed) {
            actionPerformed = iterate();
        }
        if (sudokuBoard.isSolved()) {
            System.out.println(sudokuBoard.toString());
        } else {
            System.out.println("Guessing...");
        }
        System.out.println("PLAY AGAIN? (Y/N)");
        String input = scan.nextLine();
        return !input.equals("y") && !input.equals("Y");
    }
}

