class Solution {
    int[][] output;
    public int[][] rangeAddQueries(int n, int[][] q) {
        output = new int[n][n];
        int l = q.length;
        
        for(int i = 0; i < l; i++){
            func(q[i][0], q[i][1], q[i][2], q[i][3], n);
        }
        
        return output;
    }
    
    public void func(int a, int b, int c, int d, int n){
        for(int i = a; i <= c; i++){
            for(int j = b; j <= d; j++){
                output[i][j]++;
            }    
        }
    }
}