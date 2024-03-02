import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 6, 2, 9, 5};
        int k = 4;
        Arrays.sort(arr); // {1, 2, 4, 5, 6, 8, 9}
        System.out.println("Kth Maximum element is : " + arr[arr.length-k]);
        System.out.println("Kth Minumum element is : " + arr[k-1]);

    }    
}
