package com.kodilla.sudoku;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SudokuGame {
    SudokuBoard sudokuBoard;
    Scanner scan = new Scanner(System.in);

    public SudokuGame() {
        this.sudokuBoard = new SudokuBoard();
    }

    public boolean resolveSudoku() {
        System.out.println(sudokuBoard.toString());
        System.out.println("PLAY AGAIN? (Y/N)");
        String input = scan.nextLine();
        return !input.equals("y") && !input.equals("Y");
    }

    public void valueReader (){
        Pattern pattern = Pattern.compile("([1-9]),([1-9]),([1-9])");
        System.out.println("INSERT INITIAL VALUES...");
        String input = scan.nextLine();
        while (!input.equals("SUDOKU")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.matches()){
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
}
