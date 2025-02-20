public class Solution {
    public static int peakElement(int[] arr) {
        if(arr.length == 1) return 0;
        if(arr[0] > arr[1]) return 0;

        for(int i = 1; i < arr.length-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) return i;
        }
        if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5};
        int peakIndex = peakElement(arr);
        System.out.println("Peak element index: " + peakIndex);
    }
}
