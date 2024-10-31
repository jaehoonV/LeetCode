class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int i = 0, j = 0, max = 1;
        String output = s.substring(0, 1);
        
        for(i = 0; i <= n - max; i++){
            for(j = i + max; j < n; j++){
                String temp = s.substring(i, j + 1);
                int temp_n = temp.length();
                
                if(func(temp)){
                    max = temp_n;
                    output = temp;
                }
            }
        }
        
        return output;
    }
    
    public static boolean func(String str){
        int n = str.length();
        int i = 0, j = n - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            
            i++;
            j--;
        }
        return true;
    }
    
}