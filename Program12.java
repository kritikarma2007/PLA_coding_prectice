//  swap two nibbles in a byte
// public class program13 {
//     public static void main(String[] args) {
//         int n = 100;

//         int swapped = ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
//         System.out.println("Original number: " + n);
//         System.out.println("Number after swapping nibbles: " + swapped);
//     }
// }


//  equlibrium indexof an array
public class program12 {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i; 
            }
            leftSum += arr[i];
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int equilibriumIndex = findEquilibriumIndex(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}

