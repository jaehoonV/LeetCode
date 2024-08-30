class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int output=0;
        
        for(int i = 0; i < n; i++){
            int c1 = 0, c2 = 0;
            for(int j=i;j<n;j++){
                if(s.charAt(j) == '0') c1++;
                else c2++;
                
                if(c1 <= k || c2 <= k) output++;
                
            }
        }
        return output;
    }
}