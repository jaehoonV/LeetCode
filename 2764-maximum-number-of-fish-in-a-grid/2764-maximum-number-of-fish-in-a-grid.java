class Solution {
    int[][] directions={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean[][] check;
    int m, n;

    public int findMaxFish(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int output = 0;       

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0) continue;
                
                check = new boolean[m][n];       
                output = Math.max(output, func(grid, i, j));
            }
        }

        return output;
    }

    int func(int[][] grid, int i, int j){
        check[i][j] = true;
        int output = 0;
        
        if(grid[i][j] == 0) return output;

        output += grid[i][j];
        for(int[] dir : directions){
            int r = i + dir[0];
            int c = j + dir[1];
            if(r >= 0 && r < m && c >= 0 && c < n && !check[r][c]){
                output += func(grid, r, c);
            }
        } 

        return output;
    }
}