class Solution {
    int m = 0;
    int n = 0;
    int output = 0;
    int moves[] = {-1, 0, 1};
    
    public int maxMoves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        
        int dp[][] = new int[m][n];

        for(int i = 0; i < m; i++) {
            func(grid, i, 0, 0, dp);
        }

        return output;
    }

    public void func(int[][] grid, int row, int col, int temp, int[][] dp) {
        output = Math.max(output, temp);
        for(int move : moves) {
            int i = row + move;
            int j = col + 1;
            
            if(i == -1 || j == -1 || i == m || j == n) continue;
            
            if(grid[i][j] > grid[row][col]) {
                if(temp + 1 > dp[i][j]) {
                    dp[i][j] = temp + 1;
                    func(grid, i, j, temp + 1, dp);
                }
            }
        }  
    }
}