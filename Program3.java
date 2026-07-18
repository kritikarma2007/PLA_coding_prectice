// Sum of Even-Length Consecutive Character Groups
// Most Likely Problem Statement

// Given a string, consider every group of consecutive identical characters.

// If the length of a group is even, add its length to the answer.

// Print the total sum.

import java.util.*;
// import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int currsum = 0;
        int count = 1;

        for(int i = 0; i < s.length() - 1; i++) {

            if(s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
            else {

                if(count % 2 == 0) {
                    currsum += count;
                }

                count = 1;
            }
        }

        // here we Check the last group
        if(count % 2 == 0) {
            currsum += count;
        }

        System.out.println(currsum);
        sc.close();
    }
}