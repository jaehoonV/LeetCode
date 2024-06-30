class Solution {
    public int minimumArea(int[][] grid) {
        int a = 1000, b = 1000, c = 0, d = 0;
        
        for(int i = 0; i < grid.length; i++){
            int n = grid[i].length;
            for(int j = 0; j < n; j ++){
                if(grid[i][j] == 1){
                    a = Math.min(a, i);
                    b = Math.min(b, j);
                    c = Math.max(c, i);
                    d = Math.max(d, j);
                }
            }
        }
        
        return (c - a + 1) * (d - b + 1);
    }
}