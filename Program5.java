// Two players A and B, are playing the game of Rock, Paper, Scissors. Player A chooses a move represented by a string value M: and the move can be one of the following: 'rock', 'paper', or 'scissors' where.
// ⚫ rock beats scissors
// scissors beats paper
// paper beats rock
// Your task is to find and return a string value representing the winning move for Player B.
// Note The output is case sensitive
// Input Format
// A string value M representing the move chosen by Player A
// Constraints
// NA
// Output Format
// Return a string representing the winning move for Player B.



// 20/7/26

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String moveA = scanner.nextLine().trim().toLowerCase();

        System.out.println("You entered: '" + moveA + "'");

        String moveB = getWinningMove(moveA);
        System.out.println(moveB);

        scanner.close();
    }

    public static String getWinningMove(String moveA) {
        switch (moveA) {
            case "rock":
                return "paper";
            case "paper":
                return "scissors";
            case "scissors":
                return "rock";
            default:
                return "Invalid Move";
        }
    }
}