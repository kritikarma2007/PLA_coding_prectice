// longest sequence o 1s after flip  or it should print flipping one 0 to 1 
import java.util.Scanner;
public class  Program11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        int maxCount = 0;
        int prevCount = 0;
        while(n>0){
            if((n&1)==1){
                count++;

            }else{
                prevCount = count;
                count=0;
            }
            
            maxCount=Math.max(maxCount,prevCount+count+1);
            n>>=1;
        }
        System.out.println("The longest sequence of 1s after flipping one bit is: " + maxCount);
        scanner.close();
    }
}