class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long output = 0;
        int cnt = 0, min = Integer.MAX_VALUE, n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int temp = matrix[i][j];
                if(temp < 0) {
                    temp *= -1;
                    cnt++;
                }
                min = Math.min(min, temp);
                output += temp;
                
            }
        }
        return cnt % 2 == 0 ? output : output - (min * 2);
    }
}