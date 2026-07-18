// Weird Algorithm (Collatz Sequence)
// Problem Statement

// Given a positive integer N, print the sequence obtained using the following rules until the number becomes 1:

// If the current number is even, divide it by 2.
// If the current number is odd, multiply it by 3 and add 1.

// Print all numbers in the sequence separated by spaces.

import java.util.*;
public class Program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n>1){
            if(n%2==0){
                n = n/2;
            } else {
                n = 3*n + 1;
            }
            System.out.print(" " + n);
        }
        sc.close();
    }
}
