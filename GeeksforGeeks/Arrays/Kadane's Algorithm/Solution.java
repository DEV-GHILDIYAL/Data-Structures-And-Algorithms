class Solution {
    int maxSubarraySum(int[] arr) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        // Your code here
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum<0) currSum = 0;
        }
        return maxSum;
    }
}