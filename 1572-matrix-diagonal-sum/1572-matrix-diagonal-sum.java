class Solution {
    public int diagonalSum(int[][] mat) {
        int a = mat.length;
        int b = mat[0].length;
        int sum = 0;
        int i = 0;
        int j = 0;
        
        while(i < a && j < b){
            sum += mat[i++][j++];
        }
        
        i = a - 1;
        j = 0;
        
        while(i >= 0 && j < b){
            if(i != j) sum += mat[i][j];
            i--;
            j++;
        }
        return sum;
        
    }
}