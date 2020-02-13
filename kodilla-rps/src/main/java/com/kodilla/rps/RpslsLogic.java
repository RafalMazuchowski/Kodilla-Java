package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpslsLogic {
    Random random = new Random();
    RpslsRunner rpslsRunner = new RpslsRunner();
    Messages messages = new Messages();
    Scanner sc = new Scanner(System.in);

    public int game(String m) {
        int win = 0;

        boolean goodChoice;
        do {
            goodChoice = true;
            switch (m.toLowerCase()) {
                case "1":
                    System.out.println(rpslsRunner.getName() +": ROCK");
                    win = whoWin(1);
                    break;
                case "2":
                    System.out.println(rpslsRunner.getName() +": PAPER");
                    win = whoWin(2);
                    break;
                case "3":
                    System.out.println(rpslsRunner.getName() +": SCISSORS");
                    win = whoWin(3);
                    break;
                case "4":
                    System.out.println(rpslsRunner.getName() +": SPOCK");
                    win = whoWin(4);
                    break;
                case "5":
                    System.out.println(rpslsRunner.getName() +": LIZARD");
                    win = whoWin(5);
                    break;

                case "x":
                    win = Messages.endConfirm();
                    if (win != 3) {
                        System.out.println("> Exit canceled <");
                        System.out.println("> Your turn <");
                        m = sc.next();
                        goodChoice = false;
                    }
                    break;
                case "n":
                    win = Messages.restartConfirm();
                    if (win != 2) {
                        System.out.println("> Continue the game <");
                        System.out.println("> Your turn <");
                        m = sc.next();
                        goodChoice = false;
                    }
                    break;
                case "r":
                    messages.rules();
                    m = sc.next();
                    goodChoice = false;
                    break;
                case "h":
                    messages.describe();
                    m = sc.next();
                    goodChoice = false;
                    break;
                default: {
                    System.out.println("Wrong button!");
                    m = sc.next();
                    goodChoice = false;
                }
            }
        }
        while (!goodChoice);
        return win;
    }

    public int whoWin(int player) {
        System.out.print("Computer: ");
        int computer = random.nextInt(5)+1;
        if (computer == 1 ){
            System.out.println("ROCK");
        } else if (computer == 2 ){
            System.out.println("PAPER");
        } else if (computer == 3 ){
            System.out.println("SCISSORS");
        } else if (computer == 4 ){
            System.out.println("SPOCK");
        } else if (computer == 5 ){
            System.out.println("LIZARD");
        } else
            System.out.println("Buuuuuu!");
        int winner = 0;
        if (player == computer) {
            System.out.println("REMIS");
            winner = 0;
        } else {
            computer = computer - player;
            if (computer < 0) computer = computer + 5;
            if (computer == 2 || computer == 4) {
                System.out.println("WIN!");
                winner = 1;
            } else if (computer == 1|| computer == 3) {
                System.out.println("LOSE!");
                winner = -1;
            } else System.out.println("Counting error!\nStart new game.");
        }
        return winner;
    }
}