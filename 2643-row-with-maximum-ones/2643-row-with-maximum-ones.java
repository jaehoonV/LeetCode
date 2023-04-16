class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int i = 0;
        int a = 0;
        int b = 0;
        
        while(i < m){
            int temp = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1) {
                    temp++;
                }
            }
            if(b < temp){
                a = i;
                b = temp;
            }
            i++;
        }
        return new int[]{a, b};
    }
}