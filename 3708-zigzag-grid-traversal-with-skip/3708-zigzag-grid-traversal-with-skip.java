class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        List<Integer> output = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < m; j += 2){
                    output.add(grid[i][j]);
                }
            }else{
                int t = m - 1;
                if(m % 2 == 1) t = m - 2;
                for(int j =t; j >= 0; j -= 2){
                    output.add(grid[i][j]);
                }
            }
        }
        
        return output;
        
    }
}