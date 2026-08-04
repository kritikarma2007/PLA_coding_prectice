// Euler's phi algorithm 
/**
 * Program10
 */
// import java.util.Scanner;
// public class Program10 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int result = n;
//         // System.out.println("The value of Euler's phi function for " + n + " is: " + eulerPhi(n));
//         for(int i=2; i*i<=n;i++){
//             if(n%i==0){
//                 while(n%i==0){
//                     n/=i;
//                 }
//                 result-=result/i;
//             }

//         }
//         if(n>1){
//             result-=result/n;
//         }
//         System.out.println("The value of Euler's phi function is: " + result);
//         scanner.close();
//     }
// }



// binary palindrome for checking if the given number in binary ormat  is palindrome or not by using left side operator and reverse 

// import java.util.Scanner;
// public class Program10{
//     public static void main(String[] args) { 
//         int rev =0;
//         int org =0;
//         while()
//     }
// }   


//  longest sequence of 1 bit 

import java.util.Scanner;
public class Program10{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            int count = 0;
            int maxCount = 0;
            while(n>0){
                if((n&1)==1){
                    count++;
                    if(count>maxCount){
                        maxCount=count;
                    }
                }else{
                    count=0;
                }
                n>>=1;
            }
            System.out.println("The longest sequence of 1's in binary representation is: " + maxCount);
            scanner.close();
        }
}