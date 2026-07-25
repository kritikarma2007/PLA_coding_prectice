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

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        if (st.equals("paper")) {
            System.out.print("scissors");
        } else if (st.equals("scissors")) {
            System.out.print("rock");
        } else {
            System.out.print("paper");
        }
        sc.close();
    }
}
