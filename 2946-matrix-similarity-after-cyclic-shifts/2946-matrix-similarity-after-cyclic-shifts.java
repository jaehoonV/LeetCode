class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int a = k % n;
        for(int i = 0; i < m; i++){
            if(i % 2 == 0){
                String s = "";
                String s1 = "";
                String s2 = "";
                for(int j = 0; j < n; j++){
                    s += mat[i][j]; 
                    if(j < a) s1 += mat[i][j];
                    if(j >=a) s2 += mat[i][j];
                }
                
                if(!s.equals(s2 + s1)) return false;
            }
        }
        
        return true;
    }
}