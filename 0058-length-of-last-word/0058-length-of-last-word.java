class Solution {
    public int lengthOfLastWord(String s) {
        String s_t = s.trim();
        int n = s_t.length();
        int i = n - 1;
        while(i >= 0){
            if(s_t.charAt(i) == ' ') break;
            i--;
        }
        
        return n - 1 - i;
    }
}