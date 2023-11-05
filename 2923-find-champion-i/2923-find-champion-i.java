class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int max_cnt = 0;
        int output = 0;
        for(int i = 0; i < n; i++){
            int temp = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1) temp++;
            }
            if(max_cnt < temp){
                max_cnt = temp;
                output = i;
            }
        }
        return output;
    }
}