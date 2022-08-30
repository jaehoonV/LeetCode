class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];
        int[][] output = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                temp[i][j] = matrix[j][i];
            }
        }
        int a = 0;
        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                matrix[j][a] = temp[j][i];
            }
            a++;
        }
    }
}