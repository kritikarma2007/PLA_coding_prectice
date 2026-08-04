//  find the max product of sub array
// import java.util.Arrays;
public class Program14{
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0] ;
 
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
     
        
            int tempMax = Math.max(current, Math.max(maxProduct * current, minProduct * current));

            int tempMin = Math.min(current, Math.min(maxProduct * current, minProduct * current));

            maxProduct = tempMax;
            minProduct = tempMin; 

            result = Math.max(result, maxProduct);
        }
        return result;
    }
}