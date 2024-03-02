public class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sort012(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int tempLow = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = tempLow;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high]
                    int tempHigh = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = tempHigh;
                    high--;
                    break;
            }
        }
    }
}
