import java.util.*;
class Solution {

    static ArrayList<Integer> gapDiff(int[] arr, int st, int end){
        ArrayList<Integer> result = new ArrayList<>();
        int val = arr[st] + 1;
        while (val < arr[end]) {
            result.add(val);
            val++;
        }
        return result;
    }

    static int KthMissingElement(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int val = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                val++;
            } else {
                ArrayList<Integer> gap = gapDiff(arr, i - 1, i);
                result.addAll(gap);
                val = arr[i] + 1;
            }
        }
        if (result.size() < k) {
            return -1;
        }
        while (result.size() < k) {
            result.add(val++);
        }
        
        return result.get(k - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 9, 11};
        int k = 3;
        System.out.println(KthMissingElement(arr, k)); // Output: 6
    }
}