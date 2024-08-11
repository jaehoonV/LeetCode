class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] arr = new int[n][n];
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = temp++;
            }
        }
        
        int a = 0, b = 0;
        for(String s : commands){
            if(s.equals("UP")) a--;
            else if(s.equals("RIGHT")) b++;
            else if(s.equals("DOWN")) a++;
            else b--;
        }
        return arr[a][b];
    }
}