public class Solution {
    public static int[] reverseArray(int[] arr){
        for(int i=0; i<=arr.length/2-1; i++){
            System.out.println();
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<=arr.length-1; i++){
            System.out.println("Array of index " + i + " is " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printArray(arr);
        int[] newArr;
        newArr = reverseArray(arr);
        printArray(newArr);
    }
}