class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
		int n = matrix[0].length;
		int row = 0;
		
		for(int i = 0; i < m; i ++) {
			if(target <= matrix[i][n-1]) {
				row = i;
				break;
			}
		}
		
		for(int i = 0; i < n; i ++) {
			if(target == matrix[row][i]) return true;
		}
        return false;
    }
}