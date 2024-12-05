class Solution {
    public boolean canChange(String start, String target) {
        if (start.equals(target)) return true;

        int l_cnt = 0;
        int r_cnt = 0;
        
        for (int i = 0; i < start.length(); i++) {
            char s = start.charAt(i);
            char t = target.charAt(i);
            
            if (s == 'R') {
                if (l_cnt > 0) return false;
                r_cnt++;
            }
            if (t == 'R') {
                if (r_cnt == 0) return false;
                r_cnt--;
            }
            if (t == 'L') {
                if (r_cnt > 0) return false;
                l_cnt++;
            }
            if (s == 'L') {
                if (l_cnt == 0) return false;
                l_cnt--;
            }
        }
        
        return r_cnt == 0 && l_cnt == 0;
    }
}