public class Solution {
    static int missingNumber(int arr[]) {
        int n = arr.length;
        long sum = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
        }
        return (int) sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int result = missingNumber(arr);
        System.out.println("The missing number is: " + result);
    }
}