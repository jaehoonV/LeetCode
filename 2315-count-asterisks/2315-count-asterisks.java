class Solution {
    public int countAsterisks(String s) {
        int cnt = 0, t = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '|') t++;
            if((c == 42 || c == '*') && (t % 2 == 0)) cnt++;
        }
        return cnt;
    }
}