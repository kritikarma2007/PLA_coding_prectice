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
    }
}
