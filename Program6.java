// 21/7/26
// calculating a difficulty quotient for a given string of text by analyzing individual words and classifying them as easy and hard  
import java.util.*;
public class Program6 {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str =sc.nextLine();
    System.out.println("You entered: '" + str + "'");
    String[] words = str.split(" ");
    int easycount =0;
    int hardcount =0;
    for (String word : words) {
        if (word.length() <= 3) {
            easycount++;
        } else {
            hardcount++;
        }
    }
    System.out.println("Easy words: " + easycount);
    System.out.println("Hard words: " + hardcount);
    sc.close();
    }
}
