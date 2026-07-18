
// Integer Break (Maximum Product)
// Problem Statement

// Given a positive integer N, break it into the sum of at least two positive integers such that their product is maximum.

// Print the maximum possible product.


import java.util.*;
 public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r =  num % 3;
        int q = num / 3;
        
        if(r == 0){
            System.out.print((int)Math.pow(3,q));
        }else if(r == 1){
            System.out.print(4*(int)Math.pow(3,q-1));
        }else {
            System.out.print(2*(int)Math.pow(3,q));
        }
        sc.close();
    }
}