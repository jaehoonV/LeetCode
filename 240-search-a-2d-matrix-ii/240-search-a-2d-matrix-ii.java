class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i < m; i++){
            if(matrix[i][0] <= target && target <= matrix[i][n - 1]){
                for(int j = 0; j < n; j++){
                    if(target == matrix[i][j]) return true;
                }
            }
        }
        return false;
    }
}