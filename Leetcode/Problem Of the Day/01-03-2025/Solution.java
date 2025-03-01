import java.util.Arrays;

public class Solution {

    public static int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 0, 4, 2};
        int[] result = applyOperations(nums);
        System.out.println(Arrays.toString(result)); // Output: [2, 4, 4, 6, 0, 0, 0]
    }
}