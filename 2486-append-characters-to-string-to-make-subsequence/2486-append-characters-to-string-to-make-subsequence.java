class Solution {
    public int appendCharacters(String s, String t) {
        int t_i = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(t_i)){
                t_i++;
            }
            if(t_i == t.length()) return 0;
        }
        return t.length() - t_i;
    }
}