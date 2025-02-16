class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        
        for(int i = 0; i <= n - k; i++){
            char a = s.charAt(i);
            boolean b = true;
            int j = i;
            int cnt = 0;
            
            while(cnt < k - 1){
                j++;
                if(a != s.charAt(j)) {
                    b = false;
                    break;
                }else{
                    a = s.charAt(j);
                }
                cnt++;
            }
            
            if((j + 1 < n && a == s.charAt(j + 1)) || (i - 1 >= 0 && a == s.charAt(i - 1))){
                b = false;
            }
                
            if(b){
                return true;
            }
        }
        
        return false;
    }
}