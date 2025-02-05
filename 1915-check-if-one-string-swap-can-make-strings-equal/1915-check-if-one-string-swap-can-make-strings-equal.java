class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt = 0;
        int a = -1, b = -1;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
                if(cnt > 2) return false;
                if(a == -1) a = i;
                else if(b == -1) b = i;
            }
        }

        if(cnt == 0) return true;

        return cnt == 2 && s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}