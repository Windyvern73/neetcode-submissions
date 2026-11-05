class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;
        int row = -1;
        int width = matrix[0].length - 1;
        while(r >= l) {
            int mid = l + (r-l)/2;
            if(matrix[mid][0] <= target && matrix[mid][width] >= target) {
                row = mid;
                break;
            }
            else if(matrix[mid][0] > target) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        if(row == -1) {
            return false;
        }
        l = 0;
        r = matrix[row].length - 1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(matrix[row][mid] == target) {
                return true;
            }
            else if(matrix[row][mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return false;
    }
}
