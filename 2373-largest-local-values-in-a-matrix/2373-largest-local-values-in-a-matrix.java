class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = n - 2;
        
        int[][] output = new int[m][m];
        
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < m ; j++) {
                output[i][j] = func(grid, i, j);
            }
        }
        
        return output;
        
    }
    
    public int func(int[][] grid, int a, int b) {
        int max = 0;
        
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        
        return max;
    }
}