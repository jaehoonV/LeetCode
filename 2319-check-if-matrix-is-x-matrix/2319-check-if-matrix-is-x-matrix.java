class Solution {
    public boolean checkXMatrix(int[][] grid) {
        
        int leng = grid[0].length;
        int a = 0;
        int b = leng - 1;
        
        for(int i = 0; i < leng; i++){
            for(int j = 0; j < leng; j++){
                if(j == a){
                    if(grid[i][j] == 0) return false;
                }
                else if(j == b){
                    if(grid[i][j] == 0) return false;
                }
                else{                
                    if(grid[i][j] != 0) return false;
                }
            }
            a++;
            b--;
        }
       
        return true;
    }
}