class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i < m; i++){
            int j = i;
            int k = 0;
            int temp = matrix[j][k];
            while(j < m && k < n){
                if(temp != matrix[j][k]){
                    return false;
                }
                j++;
                k++;
            }
        }
        for(int i = 0; i < n; i++){
            int j = i;
            int k = 0;
            int temp = matrix[k][j];
            while(j < n && k < m){
                if(temp != matrix[k][j]){
                    return false;
                }
                j++;
                k++;
            }
        }
        return true;
    }
}