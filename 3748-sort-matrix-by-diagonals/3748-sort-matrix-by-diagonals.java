class Solution {
    int[][] output;
    int n = 0;
    public int[][] sortMatrix(int[][] grid) {
        n = grid.length;
        output = new int[n][n];
        
        for(int i = 0; i < n; i++){
            func1(i, grid);
        }
        
        for(int i = 1; i < n; i++){
            func2(i, grid);
        }
        
        return output;
    }
    
    public void func1(int a, int[][] grid){
        int x = a;
        int y = 0;
        Integer[] temp = new Integer[n - a];
        
        for(int i = 0; i < n - a; i++){
            temp[i] = grid[x++][y++];
        }
        
        Arrays.sort(temp, Collections.reverseOrder());
        x = a;
        y = 0;
        for(int i = 0; i < n - a; i++){
            output[x++][y++] = temp[i];
        }
    }
    
    public void func2(int a, int[][] grid){
        int x = 0;
        int y = a;
        int[] temp = new int[n - a];
        
        for(int i = 0; i < n - a; i++){
            temp[i] = grid[x++][y++];
        }
        
        Arrays.sort(temp);
        x = 0;
        y = a;
        for(int i = 0; i < n - a; i++){
            output[x++][y++] = temp[i];
        }
    }
}