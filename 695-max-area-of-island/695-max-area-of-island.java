class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int output = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    // 큰 값으로 저장
                    output= Math.max(output, dfs(grid, i, j));
                }
            }
        }
        return output;
    }
    
    public int dfs(int[][] grid, int i, int j){
        // 가장자리이거나 0일 경우
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
        
        // 0이 아닐 경우에 해당 index의 중복 카운트를 막기위해 0으로 저장
        grid[i][j]=0;
        // 위, 아래, 오른쪽, 왼쪽 탐색
        return 1 + dfs(grid, i - 1, j)+ dfs(grid, i + 1, j)+ dfs(grid, i, j - 1)+ dfs(grid, i, j + 1);
    }
}