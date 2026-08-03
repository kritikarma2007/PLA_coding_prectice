// print prime number in given limit using simple sieve algorithm and tc should be n(loglog n)

import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print( "enter the number for printing the prime ");
        int n= sc.nextInt();

        boolean [] prime  =new boolean[n+1];
        for(int i =0; i<=n; i++){
            prime[i] =true;
        }
        for(int j =2; j*j<=n ; j++){
            if(prime[j]){
                for(int k=j*j ; k<=n ; k+=j){
                 prime[k]= false;
                }
            }
        }
        // System.out.println(i);
        sc.close();
    }
}



// h.w --- segmented and incremental sieve used for prime number in a cirtain range 