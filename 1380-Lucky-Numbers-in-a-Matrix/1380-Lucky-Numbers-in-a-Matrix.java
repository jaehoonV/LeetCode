class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int k = 0; k < m; k++) {
                    min = Math.min(min, matrix[i][k]);
                }
                for (int k = 0; k < n; k++) {
                    max = Math.max(max, matrix[k][j]);
                }
                int temp = matrix[i][j];
                if (temp == min && temp == max) {
                    output.add(temp);
                }
            }
            
        }
        return output;
    }
}