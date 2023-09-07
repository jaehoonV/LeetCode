class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l_cnt = 0, r_cnt = 0, t_cnt = 0;
        for(char c : moves.toCharArray()){
            if(c == 'L') l_cnt++;
            else if(c == 'R') r_cnt++;
            else t_cnt++;
        }
        return Math.abs(l_cnt - r_cnt) + t_cnt;
    }
}