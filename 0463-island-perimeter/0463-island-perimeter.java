class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int output = 0;
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    output += func(grid, i, j, row, col);
                }
            }
        }
        return output;
    }
    
    public int func(int[][] grid, int i, int j, int row, int col){
        int cnt = 0;
        int row_m = i - 1, row_p = i + 1, col_m = j - 1, col_p = j + 1;
        
        if(row_m >= 0){
            if(grid[row_m][j] != 1) cnt++;
        }else{
            cnt++;
        }
        
        if(row_p < row){
            if(grid[row_p][j] != 1) cnt++;
        }else{
            cnt++;
        }
        
        if(col_m >= 0){
            if(grid[i][col_m] != 1) cnt++;
        }else{
            cnt++;    
        }
            
        if(col_p < col){
            if(grid[i][col_p] != 1) cnt++;
        }else{
            cnt++;
        }
        
        return cnt;
    }
}