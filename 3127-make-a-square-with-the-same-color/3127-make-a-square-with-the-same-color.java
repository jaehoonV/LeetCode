class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i = 0; i <= 1; i++) {
            for(int j = 0; j <= 1; j++) {
                if(check(grid, i, j)) return true;
            }
        }
        return false;
    }
    
    public boolean check(char[][] grid, int i, int j){
        int cnt = 0;
        for(int a = i; a <= i + 1; a++){
            for(int b = j; b <= j + 1; b++){
                if(grid[a][b] == 'B') cnt++;
            }
        }
        return cnt != 2 ? true : false;
    }
}