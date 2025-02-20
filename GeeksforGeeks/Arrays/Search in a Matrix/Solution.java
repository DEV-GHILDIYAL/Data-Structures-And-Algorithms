class Solution {
    public static boolean searchMatrix(int[][] mat, int num) {
        // code here
        for(int x=0; x<mat.length; x++){
            for(int y=0; y<mat[0].length; y++){
                if(mat[x][y] == num) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 4, 7, 11, 15},
                          {2, 5, 8, 12, 19},
                          {3, 6, 9, 16, 22},
                          {10, 13, 14, 17, 24},
                          {18, 21, 23, 26, 30} };
        int target = 5;
        boolean result = searchMatrix(matrix, target);
        System.out.println("Is " + target + " present in the matrix? " + result);
    }
}
