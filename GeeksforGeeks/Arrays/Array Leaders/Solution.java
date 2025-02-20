import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = leaders(arr);
        System.out.println(leaders); // Output: [16, 17]
    }
}
