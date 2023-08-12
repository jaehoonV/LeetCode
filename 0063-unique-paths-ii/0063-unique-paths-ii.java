class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] output = new int[n][m];
        
        for(int i = 0; i < n; i++){
            if(obstacleGrid[i][0] == 0) output[i][0] = 1;
            else break;
        }
        for(int j = 0; j < m; j++){
            if(obstacleGrid[0][j] == 0) output[0][j] = 1;
            else break;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(obstacleGrid[i][j]==0) output[i][j] = output[i - 1][j] + output[i][j - 1];
            }
        }
        return output[n - 1][m - 1];
    }
}