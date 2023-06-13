class Solution {
    public int equalPairs(int[][] grid) {
        int output = 0;
        int n = grid.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                output += calFunc(i, j, grid, n);
            }
        }
        
        return output;
    }
    
    public int calFunc(int r_i, int c_j, int[][] grid, int n){
        int[] r = new int[n];
        int[] c = new int[n];
        
        for(int j = 0; j < n; j++){
            r[j] = grid[r_i][j];
        }
        
        for(int i = 0; i < n; i++){
            c[i] = grid[i][c_j];
        }
        
        return Arrays.equals(r, c) ? 1 : 0;
    }
}