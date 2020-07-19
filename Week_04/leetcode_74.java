class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length, index = 0;
        
        int left = 0, right = m*n-1; //[left, right]
        while(left <= right) {
            int mid = left + (right-left) / 2;
            if(matrix[mid/n][mid%n] == target) {
                return true;
            }else if(target > matrix[mid/n][mid%n]) {
                left = mid + 1;
            }else if(target < matrix[mid/n][mid%n]) {
                right = mid - 1;
            }
        }
        return false;
    }
}
//思路1：使用一个一维数组，然后正常二分搜索