class Solution {
    public void setZeroes(int[][] matrix) {
        boolean b = false;
        int n = matrix.length, m = matrix[0].length;

        for(int r = 0; r < n; r++) {
            if(matrix[r][0] == 0) b = true;
            for(int c = 1; c < m; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        for(int r = n - 1; r >= 0; r--) {
            for(int c = m - 1; c >= 1; c--) {
                if(matrix[r][0] == 0 || matrix[0][c] == 0) matrix[r][c] = 0;
            }
            if(b) matrix[r][0] = 0;
        }
    }
}