class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i < m; i++) {
            int k = 0;
            for(int j = 0; j < n; j++) {
                k = Math.max(k, matrix[j][i]);
            }
            for (int j = 0; j < n; j++) {
                if (matrix[j][i] == -1) matrix[j][i] = k;
            }
        }
        return matrix;
    }
}