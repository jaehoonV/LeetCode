class Solution {
    public int numSpecial(int[][] mat) {
        int output = 0;
        int m = mat.length;
        int n = mat[0].length;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1) output += func(mat, i, j);
            }
        }
        return output;
    }
    
    public int func(int[][] mat, int i, int j) {
        int row_sum = 0, col_sum = 0;
        int m = mat.length;
        int n = mat[0].length;
        
        for(int a = 0; a < n; a++){
            row_sum += mat[i][a];
        }
        
        for(int b = 0; b < m; b++){
            col_sum += mat[b][j];
        }
        
        return row_sum == 1 && col_sum == 1 ? 1 : 0;
    }
}