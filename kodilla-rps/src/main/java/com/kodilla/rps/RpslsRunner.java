package com.kodilla.rps;

import java.util.Scanner;

public class RpslsRunner {
    private static String name;

    public static void main(String[] args) {
        Messages messages = new Messages();
        RpslsLogic logic = new RpslsLogic();
        int rounds = 0;
        int winCounter = 0;
        int loseCounter = 0;
        int temp;
        boolean endGame = false;
        String endRound;
        Scanner sc = new Scanner(System.in);
        System.out.println("ROCK-PAPER-SCISSORS-LIZARD-SPOCK (RPSLS)\n");
        System.out.println("ENTER YOUR NAME: ");
        String cap = sc.next();
        name = cap.substring(0, 1).toUpperCase() + cap.substring(1);
        rounds = messages.intro(rounds);
        messages.describe();

        do {
            endRound = "smth";
            if (rounds == 0) rounds = messages.intro(rounds);

            System.out.println("Select the number corresponding to the gesture");
            for (int i = 0; i < rounds; i++) {
                String move = sc.next();
                temp = logic.game(move);
                if (temp > 1) {
                    if (temp == 2) {
                        System.out.println("Restart");
                        i = rounds;
                        endRound = "n";
                        winCounter = 0;
                        loseCounter = 0;
                    } else {
                        System.out.println("Game Over");
                        i = rounds;
                        endGame = true;
                    }
                } else {
                    if (temp > 0) {
                        winCounter = winCounter + temp;
                    } else if (temp < 0) {
                        loseCounter = loseCounter - temp;
                    } else i = i - 1;
                }
                System.out.println("");
                System.out.println("Wins: " + winCounter);
                System.out.println("Loses: " + loseCounter);
                System.out.println("");
            }
            if (winCounter > loseCounter) {
                System.out.println(name + " WIN!\n");
            } else if (winCounter < loseCounter) {
                System.out.println("Computer WIN!\n");
            } else {
                if (!endRound.equals("n")) System.out.println("REMIS");
            }
            if (!endRound.equals("n")) {
                winCounter = 0;
                loseCounter = 0;
                System.out.println("X - END GAME");
                System.out.println("N - NEW GAME");
                endRound = sc.next();
                if (endRound.toLowerCase().equals("x")) endGame = true;
            }
            rounds = 0;
        } while (!endGame);
    }

    public String getName() {
        return name;
    }
}
