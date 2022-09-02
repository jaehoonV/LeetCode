class Solution {
    public int lengthOfLastWord(String s) {
        String s_t = s.trim();
        int a = s_t.length();
        int i = a - 1;
        while(i >= 0){
            if(s_t.charAt(i) == ' ') break;
            i--;
        }
        
        return a - 1 - i;
    }
}