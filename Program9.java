import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of doors/monkeys: ");
        int n = sc.nextInt();

        // boolean array defaults to false (closed)
        boolean[] doors = new boolean[n + 1]; 

        // Simulate each monkey i
        for (int i = 1; i <= n; i++) {
            // Monkey i toggles multiples of i: i, 2i, 3i, ...
            for (int j = i; j <= n; j += i) {
                doors[j] = !doors[j]; // Toggle door state
            }
        }

        // Output open doors
        System.out.println("Open doors:");
        int openCount = 0;
        for (int i = 1; i <= n; i++) {
            if (doors[i]) {
                System.out.print(i + " ");
                openCount++;
            }
        }
        System.out.println("\nTotal open doors: " + openCount);
        sc.close();
    }
}