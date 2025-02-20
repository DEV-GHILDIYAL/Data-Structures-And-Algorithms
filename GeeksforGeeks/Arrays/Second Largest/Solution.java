public class Solution {
    public static int getSecondLargest(int[] arr) {
        if(arr.length == 1) return -1;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }else{
                return -1;
            }
        }
        if(max2 == Integer.MIN_VALUE) return -1;
        if(max1 == max2) return -1;
        
        return max2;
    }
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        int secondLargest = getSecondLargest(arr);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
