package com.kodilla.rps;

import java.util.Scanner;

public class Messages {
    static Scanner scan = new Scanner(System.in);

    public int intro (int rounds) {
        do {
            System.out.println("Number of rounds: ");
            rounds = scan.nextInt();
        } while (rounds <= 0);
        System.out.println();
        return rounds;
    }

    public void describe (){
        System.out.println("CONTROLS:");
        System.out.println("1 - ROCK");
        System.out.println("2 - PAPER");
        System.out.println("3 - SCISSORS");
        System.out.println("4 - SPOCK");
        System.out.println("5 - LIZARD");
        System.out.println("X - END GAME");
        System.out.println("N - NEW GAME");
        System.out.println("R - RULES");
        System.out.println("H - CONTROLS");
        System.out.println();
    }

    public void rules () {
        System.out.println("RULES:");
        System.out.println();
        System.out.println("STONE CRUSHES SHEARS");
        System.out.println("SCISSORS CUT PAPER");
        System.out.println("THE PAPER COVERS THE STONE");
        System.out.println("THE STONE CRUSHES THE LIZARD");
        System.out.println("THE LIZARD POISONS SPOCK");
        System.out.println("SPOCK BREAKS THE SCISSORS");
        System.out.println("THE SCISSORS HURT THE LIZARD");
        System.out.println("THE LIZARD EATS PAPER");
        System.out.println("PAPER PROVES SPOCK'S MISTAKE");
        System.out.println("SPOCK CRUSHES STONE");
        System.out.println();
    }

    public static int endConfirm (){
        int value = 0;
        System.out.println("Are you sure you want to end the game?\n Y/N");
        String answer = scan.next();
        if (answer.toLowerCase().equals("y")) value = 3;
        return value;
    }

    public static int restartConfirm(){
        int value = 0;
        System.out.println("Are you sure you want to end the current game?\n Y/N");
        String answer = scan.next();
        if (answer.toLowerCase().equals("y")) value = 2;
        return value;
    }
}
