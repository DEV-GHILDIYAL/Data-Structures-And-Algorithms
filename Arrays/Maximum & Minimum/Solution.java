/**
 * Solution
 */
public class Solution {
    public static void FindMaxAndMin(int[] arr){
        int max = 0;
        int min = arr[0];

        for(int i = 0; i<=arr.length-1; i++){
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }

        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 5, 2, 7};
        FindMaxAndMin(arr);
    }
}