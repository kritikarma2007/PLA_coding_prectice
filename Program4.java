// priinting all the prime number from 1 to ppn 
//  date 20/7/26

import java.util.*;
public class Program4{
      public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        for(int i=2;i<=n ; i++){
            boolean isPrime =true;
            for(int j=2; j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
        sc.close();
      }
}