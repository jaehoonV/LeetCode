class Solution {
    public int maxOperations(String s) {
        int output = 0, a = 0, n = s.length();
        
        for(int i = 0; i < n; i++){
            a += s.charAt(i) - '0';
            if(i > 0 && s.charAt(i) < s.charAt(i - 1)) output += a;
        }
        return output;
    }
}