class Solution {
    public int numIslands(char[][] grid) {
        int output = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    output++;
                    dfs(grid, i, j, m, n);
                }
            }
        }
        return output;
    }

    public void dfs(char[][] grid, int i, int j, int m, int n){
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i + 1, j, m, n);
        dfs(grid, i, j - 1, m, n);
        dfs(grid, i, j + 1, m, n);
    }
}
    

