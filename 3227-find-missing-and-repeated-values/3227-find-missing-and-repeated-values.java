class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Set<Integer>set = new HashSet<>();
        int output[]=new int[2];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(set.contains(grid[i][j])) output[0] = grid[i][j];
                
                set.add(grid[i][j]);
            }
        }
        
        for(int i = 1; i <= n * n; i++) {
            if(!set.contains(i)) {
                output[1]=i;
                break;
            }
        }
        
        return output;
    }
}